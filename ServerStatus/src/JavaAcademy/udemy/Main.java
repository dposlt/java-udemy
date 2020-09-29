package JavaAcademy.udemy;

import java.io.IOException;
import java.net.InetAddress;

public class Main {

    public static void main(String[] args) {

        String [] servers = {"server1","server2","server3","server4"};

        try {
            for (byte i = 0; i < servers.length; i++){
                if (ping(servers[i])) {
                    System.out.println("Server is up");
                } else {
                    System.out.println("Server is down");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean ping(String serverName) throws IOException {
        try {
            InetAddress address = InetAddress.getByName(serverName);
            System.out.println(address + ":");
            boolean reachable = address.isReachable(10000);
            if (reachable == true) return true;
        } catch (Exception e) {
            return false;
        }
        return false;

    }
}