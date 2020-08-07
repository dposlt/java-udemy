package JavaAcademy.udemy;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("my string is equal to " + myString);
        myString = myString + " and this is more";
        System.out.println("my string is equal to " + myString);
        myString = myString + " \u00A9 2020";
        System.out.println("my string is equal to " + myString);
    }
}
