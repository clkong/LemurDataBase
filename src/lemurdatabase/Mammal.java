/*
 *Sean Luo 29/11/2018
 *Mammal.java
 *This is progrem calculates the Mammal.
 */

package lemurdatabase;

/**
 *
 * @author toluo7449
 */
public class Mammal {
    private int age;
    private double weight;
    private String gender;
    
    public Mammal(){
        age = (int)(Math.random()*12+1);
        weight = (double)(Math.random()*5+1);
        int gender1 = (int)(Math.random()*2+1);
        if(gender1 == 1){
            gender = "Male";
        }
        else{
            gender = "Female";
        }
    }
    
    public int getage(){
        return age;
    }
    
       public void setage(int a){
        age = a;
    }
    
    public String getgender(){
        return gender;
    }
    
    public void setgender(String g){
        gender = g;
    }
    
    public double getweigth(){
        return weight;
    }
         
     public void setweigtht(double w){
        weight = w;
    }
     
     public String toString() {
        String output = "Age = " + age + "\nWeight = " + weight + "\nGender = " + gender + "\n";
        return output;
    }
}
     
     

