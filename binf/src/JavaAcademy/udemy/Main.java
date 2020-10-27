package JavaAcademy.udemy;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int volba = showMenu();
        if(kontrola(volba)) {
            System.out.println("vse je ok");
        }
    }

    public static int showMenu() {

        System.out.println("###################### \n" +
                "#                    # \n" +
                "# B I N F -- M E N U # \n" +
                "#                    # \n" +
                "######################");

        System.out.println("\n 1 - status \n 2 - app bbc -> drc \n 3 - db bbc -> drc \n 4 - app drc -> bbc \n 5 - db drc -> bbc \n 6 - exit");

        System.out.printf("Zvol task: ");
        Scanner scan = new Scanner(System.in);
        boolean flag = false;

        do {
            try {
                int menuNumber = scan.nextInt();
                flag = true;
                return menuNumber;

            } catch (InputMismatchException exception) {
                System.out.println("Integers only, please.");

            }
        }
        while (flag);
        return 0;
    }

    public static boolean  kontrola(int volba) {
        if(volba <= 6 ) {
            return true;
        }
        return false;
    }
}
