package org.example;
public class ExplicitTest {
    public static void main(String[] args) {
        double d = 100.04;
        // explicit type casting
        long l = (long) d;
        int i = (int) l;
        System.out.println("Double value " + d);
        System.out.println("Long value " + l);
        System.out.println("Int value " + i);

        byte b;
        int z = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        b = (byte) z;
        System.out.println("z = " + z + " b = " + b);
        System.out.println("Conversion of double to int.");

        z = (int) dou;
        System.out.println("dou = " + dou + " b = " + z);
        System.out.println("Conversion of double to byte.");

        b = (byte) dou;
        System.out.println("dou = " + dou + " b = " + b);

    }
}


//public class AutoTypeConversion {
//    public static void main(String[] args) {
//        int x = 20;
//        double y = 40.5;
//        long p = 30;
//        float q = 10.60f;
//        double z = x + y;
//        System.out.println("Sum of two numbers: " + z);
//
//        float r = p - q;
//        System.out.println("Subtraction of two numbers: " + r);
//
//
//
//
//    }
//}