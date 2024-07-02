
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class MyLift implements ILift{
    
    public static boolean checkNT(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % 1 == 0){
                return false;
            }
        }
        return true;
    }

    @Override
    public int f1(List<Lift> t) {
        int max = Integer.MIN_VALUE;
        for (Lift lift : t) {
            String lable = lift.getLabel();
            int load = lift.getLoad();
            if(checkNT(lable.length()) && load > max){
                max = load;
            }
        }
        return max;
    }

    @Override
    public void f2(List<Lift> t) {
        for(int i = 0; i <= 3; i++){
            for(int j = i + 1; j <= 4; j++){
                if(t.get(i).getLabel().compareTo(t.get(j).getLabel()) < 0){
                    Lift tmp = t.get(j);
                    t.remove(j);
                    t.add(i,tmp);
                }
            }
        }
    }

    @Override
    public void f3(List<Lift> t) {
        int count = 0;
        for(int i = 0; i < t.size(); i++){
            if(t.get(i).getLoad() < 20){
                count++;
            }
            if(count == 2){
                t.remove(i);
                break;
            }
        }
    }
}
