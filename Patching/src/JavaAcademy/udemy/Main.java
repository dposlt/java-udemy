package JavaAcademy.udemy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("C:\\Users\\212437054\\Documents\\projects\\udemy\\java\\Patching\\src\\JavaAcademy\\udemy\\source.txt");
        Scanner scan = new Scanner(file);
        System.out.println(scan.nextLine());
    }

}


