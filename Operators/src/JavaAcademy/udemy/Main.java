package JavaAcademy.udemy;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 and 2 are operants and symbol + is operator
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result -1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);
        result = result * 10; // 2 * 10 = 20;
        System.out.println("2 * 10 = " + result);
        result = result / 5;
        System.out.println("20 / 5 = " + result);
        result = result % 3; // the remainder of  (4 % 3 = 1)
        System.out.println("4 % 3 = " + result);
    }
}
