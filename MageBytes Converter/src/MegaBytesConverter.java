

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if ( kiloBytes < 0 ) {
            System.out.println("Invalid Value");
        }

        double megaBytes = 0.001;
        megaBytes = kiloBytes * megaBytes;

        System.out.println(kiloBytes + " KB = " + megaBytes + " MB");
    }
}
