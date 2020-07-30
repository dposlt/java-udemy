
import java.util.Scanner;
public class Hello {

    //chalange
    public static String name() {
        System.out.println("Enter yrou name: ");
        Scanner sc = new Scanner(System.in);
        String yourName = sc.nextLine();
        return yourName;
    }

    public static void main(String args[]) {
        String myName = name();
        System.out.println("Hello, " + myName);
    }

    /*
    public static void main(String args[]) {
        System.out.println("Udemy java");

     */
}
