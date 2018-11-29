/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lemurdatabase;

import javax.swing.JOptionPane;

/**
 *
 * @author toluo7449
 */
public class LemurDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Lemursnumber = JOptionPane.showInputDialog("How man Lemurs do  "
                        + "you want to add the list?");
        int number = Integer.parseInt(Lemursnumber);
          Lemur lemurs[] = new Lemur[number];
        for(int i = 0; i <number;i++){
            String kind = JOptionPane.showInputDialog("Please enter the type"
                    + "of the Lemur to add:\n1 - Tree Lemur\n2 - Desert Lemur\n"
                    + "3 - Jungle Lemur");
            int kinds = Integer.parseInt(kind);
            if(kinds == 1){
                System.out.println("Creating Tree Lemur.");
               lemurs[i] = new TreeLemur();
            }
            else if(kinds == 2){
                System.out.println("Creating Desert Lemur.");
                lemurs[i] = new DesertLemur();
            }
            else if(kinds == 3){
                System.out.println("Creating Jungle Lemur");
                lemurs[i] = new JungleLemur();
            }
            else{
                System.out.println("Invaild selection. Please try again");
                i--;
            }
            
        }
         System.out.println("Displaying the list of Lemurs:\n--------------------------------------------\n");

        for(int i = 0; i < number; i++){
            System.out.println(lemurs[i].toString());
        }
    }
}
    
    

