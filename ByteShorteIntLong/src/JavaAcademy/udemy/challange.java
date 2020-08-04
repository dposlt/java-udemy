package JavaAcademy.udemy;

public class challange {
    //create byte and short number with valid number
    //create int and set any int number
    //lastly create variable of type long and make it equal 50000 plus 10 times the sum of the bytes plus the short plus the integer values

    public static void main(String args[]) {
        byte myByteValue = 10;
        short myShortValue = 20;
        int myIntValue = 50;
        long myLongValue = 50000L;

        long totalValue = myLongValue + 10L * (myByteValue + myShortValue + myIntValue);

        System.out.println("Total number is: " + totalValue);

    }

}
