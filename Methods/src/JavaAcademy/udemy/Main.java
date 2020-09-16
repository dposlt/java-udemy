package JavaAcademy.udemy;

public class Main {

    public static void main(String[] args) {
        calculateScore(true,800, 5, 100);

        calculateScore(true,10000, 8, 200);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        /*
        boolean gameOver = true;
        int score = 800;
        int leveCompleted = 5;
        int bonus = 100;
        */
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your finale score was " + finalScore);
        }
    }
}
