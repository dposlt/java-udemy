package JavaAcademy.udemy;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int volba = showMenu();
        volba(volba);
    }

    public static int showMenu() {
        /*
        String znak = "#";
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

        System.out.println("\n 1 - status \n 2 - app bbc -> drc \n 3 - db bbc -> drc \n 4 - app drc -> bbc \n 5 - db drc -> bbc \n 6 - exit");

        System.out.printf("Zvol task: ");
        Scanner scan = new Scanner(System.in);
        int menuNumber = scan.nextInt();
        return menuNumber;
    }

    public static void kontrola(int volba) {
        if(volba > 6) {
            System.out.println("Zadej volbu podle menu 1 - 6");
        }
    }
}
