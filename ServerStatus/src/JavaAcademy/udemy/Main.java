package JavaAcademy.udemy;

import java.io.IOException;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) {
        try {
            if (ping("serverName")) {
                System.out.println("Server is up");
            } else {
                System.out.println("Server is down");
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean ping(String serverName) throws IOException {
            InetAddress address = InetAddress.getByName(serverName);
            //System.out.println(address);
            boolean reachable = address.isReachable(10000);
            if (reachable) return true;

            return false;
    }
}
