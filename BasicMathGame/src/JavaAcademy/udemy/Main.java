package JavaAcademy.udemy;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = false;
        int result = 0;
        int score = 0;

        while (!gameOver) {
            Random rand = new Random();
            int rand_int1 = rand.nextInt(10);
            int rand_int2 = rand.nextInt(10);
            result = rand_int1 + rand_int2;
            Scanner in = new Scanner(System.in);
            System.out.println(rand_int1 + " + " + rand_int2 + " = ");
            int YourResult = in.nextInt();

            if(result == YourResult) {
                score++;
                System.out.println("Current score: " + score);
            }else if(result == 0){
                System.out.println("Your score must be more than 0");
            }else {
                score--;
                System.out.println("Current score: " + score);
            }

            if(score == 10){
                System.out.println("Your score is: " + score);
                gameOver = true;
            }

        }

    }
}
