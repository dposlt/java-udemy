package JavaAcademy.udemy;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //System.out.println(getDate());
        setToTxt(getDate(),"Ok");

    }

    public static String getDate() {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);

    }

    public static void setToTxt(String date, String result) {
        try {
            File resultsFile = new File("results");

            if (resultsFile.createNewFile()) {
                System.out.println("new file: " +resultsFile.getName() + " created" );
            }

            System.out.println("File already exists: writing new dates ");
            if(resultsFile.canWrite()) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(resultsFile, true));
                writer.append(date + " status: " + result + "\n");
                //writer.append("\n");
                writer.close();
            } else {
                System.out.println("Cannot write to file");
            }

            BufferedReader reader = new BufferedReader(new FileReader(resultsFile));
            int lines = 0;
            while (reader.readLine() != null) lines++;
            System.out.printf(lines + " : days");
            reader.close();

            } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
