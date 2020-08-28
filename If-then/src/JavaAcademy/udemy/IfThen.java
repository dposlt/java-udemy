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

        // and operand
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100)
            System.out.println("Greater then second top score and less than 100");

        if ((topScore > secondTopScore) && (topScore < 100)) //easy for read
            System.out.println("Greater then second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("Either or both of the conditions are true");

        // boolean with if
        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is a car - 1");

        if (isCar = true) // there I am change false on true and this is not wrong boolean is not a variable !!!
            System.out.println("This is a car - 2");

        if (isCar) //same but with shor record
            System.out.println("This is a car - 3");

        if (!isCar) //isCar == true or isCar != false
            System.out.println("This is a car - 4");

        // ternary operator
        isCar = false;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is a true");
        }


        // challage
        /*
                1. create a double variable with value 20.00
                2. create a second variable of type double with value 80.00
                3. add both number together and multiply by 100.00
                4. use the remainder operator to figure out what the raminder from the result of the operations
                   in step 3 and 40.00. We used the modulus or remainder operator on ints in the course, but we
                   can also use in on a double
                5. create a boolean variable that assings the value true if the remainderin #4 is 0, or false if its not zero
                6. output the boolean variable
                7. write an if-then statement that displays a message got some remaider if the boolean in
                   step 5 is not true. Don''t be surprised if you see output for this step, where you might
                   expect in no to show.
                */

        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double multiply = (firstVariable + secondVariable) * 100.00d;
        multiply %= 40.00d;
        boolean result = (multiply == 0) ? true : false;
        System.out.println(result);

        if(!result){
            System.out.println("got some remainder");
        }





    }
    
}
