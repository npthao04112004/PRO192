
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MyUser implements IUser{

    @Override
    //note -> max voi min thi nen dat la Integer.Min/max Value
    public int f1(List<User> t) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < t.size(); i++){
            if(Character.isDigit(t.get(i).getName().charAt(1))){
                if(max < t.get(i).getStatus()){
                    max = t.get(i).getStatus();
                }
            }
        }
        return max;
    }

    @Override
    public void f2(List<User> t) {
        for(int i = 3; i < 5; i++){
            for(int j = i + 1; j < 6; j++){
                if(t.get(i).getName().compareTo(t.get(j).getName()) < 0){
                    User tmp = t.get(j);
                    t.remove(j);
                    t.add(i, tmp);
                }
            }
        }
    }

    @Override
    public void f3(List<User> t) {
       User max = t.get(0);
        for (User user : t) {
            if(max.getStatus() < user.getStatus()){
                max = user;
            }
        }
        t.set(0, max);
    }
}
