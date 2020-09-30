package JavaAcademy.udemy;

import java.io.IOException;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) {

        String [] servers = {"ufotomtst1x","ufotomtst2x","ufotomtst3x","ufotomtst4x","ufotomtst5x","ufotomtst6x","ufotomtst7x","ufotomtst8x"};

        try {
            for (byte i = 0; i < servers.length; i++){
                if (ping(servers[i])) {
                    System.out.println("Server is up");
                    cara("#");
                    Thread.sleep(2000);
                } else {
                    System.out.println("Server is down");
                }
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static boolean ping(String serverName) throws IOException {
        try {
            InetAddress address = InetAddress.getByName(serverName);
            System.out.println("\n" + address + ":");
            boolean reachable = address.isReachable(10000);
            if (reachable == true) return true;
        } catch (Exception e) {
            return false;
        }
        return false;

    }

    public static void cara(String znak) {
        for( byte i = 0; i < 30; i++) {
            System.out.printf(znak);
        }
    }
}