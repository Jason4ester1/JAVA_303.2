package org.example;

public class AutoPromoteTest {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
// Expression:
        double result = (f * b) + (i / c) - (d * s);
//Result after all the promotions are done.
        System.out.println("result = " + result);
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