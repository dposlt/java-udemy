package JavaAcademy.udemy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.KeyEvent;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //PrintOwnServers(getName(),workDirectory());
        Window();


    }


    public static void Window() {
        JFrame window = new JFrame();
        window.setSize(700,480);
        window.setTitle("Search your servers ");
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        label.setText("Enter own name or server");
        label.setBounds(30, 50, 200, 20);
        window.add(label);


        JTextField textField = new JTextField();
        textField.setBounds(30,70,200,30);
        //textField.addKeyListener();
        window.add(textField);


        JTextArea area = new JTextArea(10,10);
        //area.setBounds(30, 110, 600,300);
        area.setForeground(Color.BLACK);
        area.setBackground(Color.gray);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setEnabled(false);
        //window.add(area);


        JScrollPane sp = new JScrollPane(area);
        sp.setBounds(30,110,650,300);
        sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        window.add(sp);

        JButton btn = new JButton();
        btn.setText("Search");
        btn.setBounds(240, 70, 100,30);
        btn.setToolTipText("Click to searching");
        window.add(btn);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                area.setText("");
                String getTextField = textField.getText().toLowerCase();
                getTextField = getTextField.substring(0,1).toUpperCase();//+getTextField.substring(1);

                String[] servers;
                try {

                    servers = PrintOwnServers(getTextField, workDirectory()).toArray(new String[0]);

                    for(int i=0; i < servers.length; i++)
                        area.append(servers[i] + "\n");




                } catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                }


            }
        });


        window.setLayout(null);
        window.setVisible(true);
    }

    public static ArrayList<String> PrintOwnServers(String name, String workPath) throws FileNotFoundException  {
        File file = new File(workPath + "/src/JavaAcademy/udemy/source.txt");
        Scanner scan = new Scanner(file);
        ArrayList<String> servers = new ArrayList<String>();

        while(scan.hasNextLine()) {
            String text = scan.nextLine();
            if(text.contains(name)) {
                servers.add(text);
            }
            //System.out.println(scan.nextLine());
        }
        return servers;
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


