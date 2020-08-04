package JavaAcademy.udemy;

public class challange {
    public static void main (String args[]){
        /*
        1. create a variable with the appropriate type to store the number
        of pounds to be converted to kilograms.
        2. calculate the result the number of kg based on the contents of the
        variable above and store the result in 2nd appropriate variable.
        3. print out the result
         */

        double libra = 200;
        double conversion = (double) 0.45359237;
        double kg = (double) libra * conversion;

        System.out.println(libra + " pounds to kg = " + kg +"kg");

    }
}
