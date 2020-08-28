/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAcademy.udemy;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 *
 * @author moula
 */
public class IfThen {
    
    public static void main(String args[]){
        
        // if statements
          
        boolean alien = false;
        
        if (alien == true)
            System.out.println("It's not alien");
            System.out.println("And I am scare aliens!"); //if is on the block, add only first row !!!
        // result is row number 22

        if (alien == false) {
            System.out.println("It's not alien");
            System.out.println("And I am scare aliens!"); //is add becouse is in the block !!!
        }

        int topScore = 80;
        if (topScore < 100)
            System.out.println("exam pass");

        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater then second top score and less than 100");
    }
    
}
