package JavaAcademy.udemy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //PrintOwnServers(getName());
        Window();

    }

    public static void PrintOwnServers(String name) throws FileNotFoundException  {
        File file = new File("C:\\Users\\212437054\\Documents\\projects\\udemy\\java\\Patching\\src\\JavaAcademy\\udemy\\source.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()) {
            String text = scan.nextLine();
            if(text.contains(name)) {
                System.out.println(text);
            }
            //System.out.println(scan.nextLine());
        }
    }

    public static String getName() {
        Scanner searchString = new Scanner(System.in);
        System.out.println("Enter string you are search: ");

        String searchingString = searchString.nextLine().toLowerCase();
        searchingString = searchingString.substring(0,1).toUpperCase()+searchingString.substring(1);
        return searchingString;
    }

    public static void Window() {
        JFrame window = new JFrame();
        window.setSize(640,480);
        window.setTitle("Search your servers");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //

        JLabel label = new JLabel();
        label.setText("Enter own name or server");
        label.setVerticalTextPosition(20);
        label.setHorizontalTextPosition(20);
        window.setVisible(true);
    }

}


