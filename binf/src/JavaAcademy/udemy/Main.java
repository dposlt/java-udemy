package JavaAcademy.udemy;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        make(Integer.parseInt(showMenu()));
    }

    public static String showMenu() {
        String znak = "#";

        /*
        int i;
        for(i=0; i<=20; i++) System.out.printf(znak);
        System.out.println("\n B I N F -- M E N U");
        for(i=0; i<=20; i++) System.out.printf(znak);
        */
        System.out.println("###################### \n" +
                           "#                    # \n" +
                           "# B I N F -- M E N U # \n" +
                           "#                    # \n" +
                           "######################");

        System.out.println("\n 1 - status \n 2 - app bbc -> drc \n 3 - db bbc -> drc \n 4 - app drc -> bbc \n 5 - db drc -> bbc");

        System.out.printf("Zvol task: ");
        Scanner choice = new Scanner(System.in);
        return choice.next();
    }

    public static void  make(int choice) {
        try {
            System.out.println("tva volba: " + choice);
        }
        catch (NumberFormatException ex) {
            System.out.println("zvol cislo moulo");
        }
    }
}
