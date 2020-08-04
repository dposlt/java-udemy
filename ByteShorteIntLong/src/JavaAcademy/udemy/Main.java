package JavaAcademy.udemy;

public class Main {

    public static void main(String[] args) {

        //int
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Ingeger Minimum Value = " + myMinIntValue);
        System.out.println("Ingeger Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value: " + (myMaxIntValue + 1));
        System.out.println("Busted Min value: " + (myMinIntValue - 1));
        int myMaxIntTest = 2_147_483_647;  //easy read

        //byte
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Byte Value:" + myMinByteValue);
        System.out.println("Byte Maximum Byte Value:" + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Short Value:" + myMinShortValue);
        System.out.println("Short Maximum Short Value:" + myMaxShortValue);

        long myLongValue = 100;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Long Value:" + myMinLongValue);
        System.out.println("Long Maximum Long Value:" + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue /2);
        
    }
}
