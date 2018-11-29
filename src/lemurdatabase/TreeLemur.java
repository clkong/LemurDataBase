/*
 *Sean Luo 29/11/2018
 *TreeLemur.java
 *This is progrem calculates the TreeLemur.
 */
package lemurdatabase;

/**
 *
 * @author toluo7449
 */
public class TreeLemur extends Lemur{
     String food = "Fruit";
     String colour = "Red";
     String packSize = "Large groups";

    public String toString() {
        String output = "Tree Lemur:\n" + super.toString() + "\n";
        output += "Food = " + food + "\nColour = " + colour + "\nPack Size = " + packSize + "\n";
        return output;
    }
}
