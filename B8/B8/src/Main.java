
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Product implements Comparable<Product>{
    String productName, productID;
    double productPrice;

    public Product(String productName, String productID, double productPrice) {
        this.productName = productName;
        this.productID = productID;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (productID == null) {
            if (other.productID != null)
                return false;
        } else if (!productID.equals(other.productID))
            return false;
        return true;
    }

    @Override
    public int compareTo(Product obj) {
        return Double.compare(this.productPrice, obj.productPrice);
    }
}

//order
class Order{
    String orderID, dateCreated;
    Customer customer;
    ArrayList<Product> productList;

    public Order(String orderID, String dateCreated, Customer customer, ArrayList<Product> productList) {
        this.orderID = orderID;
        this.dateCreated = dateCreated;
        this.customer = customer;
        this.productList = productList;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
}

//Person
abstract class Person{
    String name, age, sex;

    public Person(String name, String age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public abstract void language();
}

//Customer
class Customer extends Person{

    String country;

    public Customer(String name, String age, String sex, String country) {
        super(name, age, sex);
        this.country = country;
    }

    @Override
    public void language() {
        if (country.equals("USA")) {
            System.out.println("English");
        } 
        else if (country.equals("VN")) {
            System.out.println("Vietnamese");
        } 
        else if (country.equals("JP")) {
            System.out.println("Japanese");
        } 
        else {
            System.out.println("Unknown language");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Product> productList = new ArrayList<>();
        ArrayList<Customer> customersList = new ArrayList<>();
        boolean chay = true;

        while (chay) {
            System.out.println("Enter your choice:");
            System.out.println("1. Add a new product");
            System.out.println("2. Update product price");
            System.out.println("3. All avaailable product");
            System.out.println("4. Create a new order");
            System.out.println("5. Order information by ID");
            System.out.println("6. Sort products");
            System.out.println("7. Print customer information");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine(); 

            switch (chay) {
                case 1:
                    System.out.println("Enter product name: ");
                    String productName = input.nextLine();
                    System.out.println("Enter product id: ");
                    String productID = input.nextLine();
                    System.out.println("Enter product price: ");
                    double productPrice = input.nextDouble();
                    Product Thao = new Product(productName, productID, productPrice);
                    productList.add(Thao);
                    System.out.println("Da them san pham");
                    break;

                case 2:
                    System.out.println("Enter the selected product to update price: ");
                    int productSelect = input.nextInt();
                    if (productSelect >= 0 && productSelect < productList.size()) {
                        System.out.println("Enter the new price: ");
                        Thao.setProductPrice(input.nextDouble()); 
                        System.out.println("Da cap nhat gia san pham thanh cong");
                    }
                    else{
                        System.out.println("Khong tim thay san pham");
                    }
                    break;

                case 3:
                    System.out.println("All availabale product:");
                    for (int i = 0; i < productList.size(); i++) {
                        System.out.println((i + 1) + " " + productList.get(i).getProductName());
                    }
                    break;

                case 4:
                    System.out.println("Enter order id: ");
                    String orderID = input.nextLine();
                    input.nextLine();
                    System.out.println("Enter date created: ");
                    String dateCreated = input.nextLine();
                    System.out.println("Enter name: ");
                    String name = input.nextLine();
                    System.out.println("Enter age: ");
                    String age = input.nextLine();
                    System.out.println("Enter sex: ");
                    String sex = input.nextLine();
                    System.out.println("Enter country: ");
                    String country = input.nextLine();
                    Customer Thao1 = new Customer(name, age, sex, country);
                    Order Thao2 = new Order(orderID, dateCreated, Thao1, productList);
                    System.out.println("Da them san pham thanh cong");
                    break;

                case 5:
                    System.out.println("Order ID: " + Thao2.getOrderID());
                    System.out.println("Date created: " + Thao2.getDateCreated());
                    System.out.println("Customer: " + Thao2.getCustomer().name);
                    System.out.println("Product: ");
                    for (Product i : productList) {
                        System.out.println(" - " + i.getProductName());
                    }
                    break;

                case 6:
                    extracted(productList); {
                        System.out.println("San pham da sap xep: ");
                        for (Product i : productList) {
                            System.out.println(i.getProductName() + " - " + i.getProductPrice());
                        }
                    }
                    break;

                case 7:
                    customersList.add(Thao1);
                    System.out.println("Thong tin khach hang: ");
                    for (Customer i : customersList) {
                        System.out.println("Name: " + i.name);
                        System.out.println("Age: " + i.age);
                        i.language();
                    }
                    private static void extracted(ArrayList<Product> productList) {
                        Collections.sort(productList);
                    }
                    break;
            
                case 0:
                    chay = false;
                    System.out.println("Thoat chuong trinh");
                    break;

                default:
                    System.out.println("Vui long chon tu 1-7.");
                    break;
            }
        }
    }    
}
