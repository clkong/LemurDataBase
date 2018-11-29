/*
 *Sean Luo 29/11/2018
 *DesertLemur.java
 *This is progrem calculates the DesertLemur.
 */
package lemurdatabase;

/**
 *
 * @author toluo7449
 */
public class DesertLemur extends Lemur{
     String food = "Cacti";
    String colour = "White";
    double babyDeathRate = 0.66;

    public String toString() {
        String output = "Desert Lemur:\n" + super.toString() + "\n";
        output += "Food = " + food + "\nColour = " + colour + "\nBaby Death Rate = " + babyDeathRate + "\n";
        return output;
    }

}
    

