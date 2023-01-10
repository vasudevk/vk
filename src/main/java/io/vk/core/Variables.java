package io.vk.core;

public class Variables {

    int age = 28;
    char grade = 'A';
    boolean late = true;
    byte b = 20;
    long num = 1234567;
    short no = 10;
    float f = 12.5f;
    double pi = 3.14;

    // null is another, but it can only ever store the value null.

    public static void main(String[] args) {

        // compound assignment operators
        int number = 5;
        number += 3;
        number -= 4;
        number *= 6;
        number /= 2;
        number %= 7;
        System.out.println(number);

        int dividend = 3;
        int divisor = 2;

        double result = dividend / divisor * 1.0;
        System.out.println(result);
    }


    /* The value of a variable cannot be changed if the variable was declared using the final keyword. */
    final double diameter = 10.20;

    /* Order of operations :: parentheses -> multiplication -> division -> modulo -> addition -> subtraction. */
}