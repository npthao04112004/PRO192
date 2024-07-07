/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class SpecUser extends User{
    private String address;

    public SpecUser() {
    }

    public SpecUser(String name, int status, String address) {
        super(name, status);
        this.address = address;
    }

    @Override
    public String toString() {
        return super.getName() + ", " + this.address + ", " + super.getStatus();
    }
    
    public void setData(){
        super.setName(super.getName() + address);
    }
    
    public String getValue(){
        if(super.getStatus() == 1){
            return super.getName() + "admin";
        }
        else{
            return super.getName() + "user";
        }
    }
}
