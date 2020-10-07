

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if ( kiloBytes < 0 ) {
            System.out.println("Invalid Value");

        } else {

            double megaBytes = 1024;
            megaBytes = kiloBytes / megaBytes;

            int intPart = (int) megaBytes;


            System.out.println(kiloBytes + " KB = " + intPart + " MB and " + (megaBytes - intPart)  + " KB");
        }
    }
}
