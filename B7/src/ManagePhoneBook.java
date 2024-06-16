import java.util.Scanner;

public class ManagePhoneBook extends Phone{
    @Override
    public void insertPhone(String name, String phone) {
       
    }


    @Override
    public void removePhone(String name) {
        
    }


    @Override
    public void updatePhone(String name, String newphone) {

    }  

    @Override
    public void searchPhone(String name) {
        
    }


    @Override
    public void sort() {
        
    }

    public ManagePhoneBook(String name, String phone, String newphone) {
        super(name, phone, newphone);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhoneBook Thao = new PhoneBook("", "", "");
        int choice;

        do {
            System.out.println("======PHONEBOOK MANAGEMENT SYSSTEM======");
            System.out.println("1. Insert Phone");
            System.out.println("2. Remove Phone");
            System.out.println("3. Update Phone");
            System.out.println("4. Search Phone");
            System.out.println("5. Sort Phone");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    String name = input.nextLine();
                    System.out.println("Enter phone: ");
                    String phone = input.nextLine();
                    Thao.insertPhone(name,phone);
                    break;
                case 2:
                    System.out.println("Enter name: ");
                    name = input.nextLine();
                    Thao.removePhone(name);
                    break;
                case 3: 
                    System.out.print("Enter name: ");
                    name = input.nextLine();
                    System.out.print("Enter new phone number: ");
                    phone = input.nextLine();
                    Thao.updatePhone(name, phone);
                    break;
                case 4:
                    System.out.print("Enter name: ");
                    name = input.next();
                    System.out.println("Enter Phone: ");
                    phone = input.nextLine();
                    Thao.searchPhone(name, phone);
                    break;
                case 5:
                    Thao.sort();
                    System.out.println("Da sap xep so dien thoai");
                    break;
                case 6:
                    System.out.println("Da thoat");
                    break;
                default:
                    System.out.println("Nhap lai, vui ong nhap tu 1-6.");
                    break;
            }

        } while (choice != 6);
        input.close();
    }
}
