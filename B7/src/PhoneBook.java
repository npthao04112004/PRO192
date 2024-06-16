import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook extends Phone {


    public PhoneBook(String name, String phone, String newphone) {
        super(name, phone, newphone);
    }

    public PhoneBook(String name, String phone, String newphone, ArrayList<PhoneBook> phoneList) {
        super(name, phone, newphone);
        PhoneList = phoneList;
    }


    ArrayList<PhoneBook> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        boolean tendaTontai = false;        
        for (int i = 0; i < PhoneList.size(); i++) {
            PhoneBook nhapvao = PhoneList.get(i);
            if (nhapvao.getName().startsWith(name)) {
                tendaTontai = true;
                if (!nhapvao.getPhone().equals(phone)){
                    nhapvao.setPhone(nhapvao.getPhone() + " : " + phone);
                }
                break;
            }
        }
        if (!tendaTontai) {
            PhoneList.add(new PhoneBook(name,phone,newphone));
        }
    }

    @Override
    public void removePhone(String name) {
        ArrayList<PhoneBook> xoaPhone = new ArrayList<>(); 

        for (PhoneBook i : PhoneList) {
            if (i.getName().equals(name)) {
                xoaPhone.add(i);
            }
        }

        if (xoaPhone.isEmpty()) {
            PhoneList.remove(xoaPhone);
            System.out.println("Da xoa nguoi dung va phone");
        }
        else{
            System.out.println("Khong tim thay tn nguoi dung");
        }

    }

    @Override
    public void searchPhone(String name) {
        ArrayList<PhoneBook> timPhone = new ArrayList<>();
    
        for (PhoneBook i : PhoneList) {
            if (i.getName().equals(name)) {
                timPhone.add(i.getPhone());
            }
        }
        
        if (timPhone.isEmpty()) {
            System.out.println("Khong tim thay so dien thoai");
        }
        else{
            System.out.println("So dien thoai la: ");
            for (PhoneBook i : timPhone) {
                System.out.println(timPhone);
            }
        }
    }

    @Override
    public void sort() {
        for (int i = 0; i < PhoneList.size(); i++) {
            for (int j = i + 1; j < PhoneList.size(); j++) {
                PhoneBook so1 = PhoneList.get(i);
                PhoneBook so2 = PhoneList.get(j);

                if (so1.getName().compareTo(so2.getName()) > 0) {
                    PhoneList.set(i, so2);
                    PhoneList.set(j, so1);
                }
            }
        }
        
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneBook i : PhoneList) {
            if (i.getName().equals(name)) {
                i.setPhone(newphone);
                System.out.println("Da cap nhat phone");
                return;
            }
        }
        System.out.println("Khong tim thay nguoi dung");
    }
}
