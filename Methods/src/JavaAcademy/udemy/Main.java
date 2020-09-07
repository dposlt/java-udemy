package JavaAcademy.udemy;

public class Main {

    public static void main(String[] args) {
        calculateScore();
    }

    public static void calculateScore() {
        boolean gameOver = true;
        int score = 800;
        int leveCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (leveCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your finale score was " + finalScore);
        }
    }
}
