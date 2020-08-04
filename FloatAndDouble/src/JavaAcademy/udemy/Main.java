package JavaAcademy.udemy;

import javax.swing.plaf.metal.MetalIconFactory;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = (float) 5 / 3;
        double myDoubleValue = (double) 5 / 3;

        System.out.println("My int value " + myIntValue);
        System.out.println("My Float value " + myFloatValue);
        System.out.println("My double value " + myDoubleValue);




    }
}
