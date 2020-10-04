public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(0);
        checkNumber(-12);
        checkNumber(34);
    }
    public static void checkNumber(int number) {

        if (number > 0) {
            System.out.println("number " + number + " : is positive");

        } else if (number < 0) {
            System.out.println("number " + number + " : is negative");
        } else if(number == 0) {
            System.out.println("number " + number + " : is zero");
        }
    }
}
