package JavaAcademy.udemy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.regex.Pattern;
import javax.swing.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //PrintOwnServers(getName(),workDirectory());
        Window();

    }
    public static void Window() {
        JFrame window = new JFrame();
        window.setSize(640,480);
        window.setTitle("Search your servers ");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        JLabel showAll = new JLabel();
        label.setText("Enter own name or server");

        label.setBounds(30, 50, 150, 20);
        showAll.setBounds(30, 70, 250,250);


        JTextField textField = new JTextField();
        textField.setBounds(30,70,200,30);

        JButton btn = new JButton();
        btn.setText("Search");
        btn.setBounds(240, 70, 100,30);
        btn.setToolTipText("Clic to searching");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getTextField = textField.getText().toLowerCase();
                getTextField = getTextField.substring(0,1).toUpperCase()+getTextField.substring(1);
                String servers = null;
                try {
                    servers = PrintOwnServers(getTextField, workDirectory());
                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }
                showAll.setText(servers);




            }
        });

        window.add(label);
        window.add(showAll);
        window.add(textField);
        window.add(btn);

        window.setLayout(null);
        window.setVisible(true);
    }

    public static String PrintOwnServers(String name, String workPath) throws FileNotFoundException  {
        File file = new File(workPath + "/src/JavaAcademy/udemy/source.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNextLine()) {
            String text = scan.nextLine();
            if(text.contains(name)) {
                return text;
            }
            //System.out.println(scan.nextLine());
        }
        return null;
    }

    public static String getName() {
        Scanner searchString = new Scanner(System.in);
        System.out.println("Enter string you are search: ");

        String searchingString = searchString.nextLine().toLowerCase();
        searchingString = searchingString.substring(0,1).toUpperCase()+searchingString.substring(1);
        return searchingString;
    }

    public static String workDirectory() {
        String userDirectory = System.getProperty("user.dir");
        return userDirectory;
    }



}


