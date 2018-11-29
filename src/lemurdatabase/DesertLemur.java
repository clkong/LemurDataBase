/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    

