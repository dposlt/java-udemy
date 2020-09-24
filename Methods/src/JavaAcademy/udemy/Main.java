package JavaAcademy.udemy;

public class Main {

    public static void main(String[] args) {
        calculateScore(true,800, 5, 100);

        calculateScore(true,10000, 8, 200);

        displayHighScorePosition("David", 1500);
        displayHighScorePosition("Bob", 900);
        displayHighScorePosition("Tim", 400);
        displayHighScorePosition("Gilbert", 50);
        displayHighScorePosition("Robert", 1000);

    }

    public static void displayHighScorePosition(String name, int highScore){

        System.out.println(name + " managed to get into position " + calculateHighScorePosition(highScore) + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
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
