/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class SpecLift extends Lift{
    private int load;
    private String label;
    private int type;

    public SpecLift() {
    }

    public SpecLift(String label, int type, int load) {
        super(label, type);
        this.load = load;
    }

    public int getLoad() {
        return this.load;
    }
    
    
    @Override
    public String toString() {
        return super.getLabel() + ", " + load + ", " + super.getType();
    }
    
    public void setData(){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < this.getLabel().length(); i++){
            if (i % 2 == 0){
                s.append(this.getLabel().charAt(i));
            }
        }
        setLabel(s.toString());
    }
    
    public int getValue(){
        if(this.getLabel().contains(String.valueOf(this.getType()))){
            return this.getType() + this.getLoad();
        }
        else{
            return this.getLoad();
        }
    }
}