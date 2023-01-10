package io.vk.core;

public class ForLoopDemo {

    public static void main(String[] args) {


        for (int x = 6, y = 2; y < x; y++, x--) {
            System.out.println(x + y);
        }

        /* var keyword can be used to initialize a single variable unlike 2 variable above */
        for (var i = 6; i > 0; i--) {
            System.out.println(i);
        }

        /* Enhanced for-loop is primarily used for iterating through collections - list, sets, arrays, maps etc. */
        int[] prime = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25};
        System.out.println(prime.length);
        for (var i : prime) {
            System.out.println("Prime # :: " + i);
        }

        var name = new char[]{'V', 'A', 'S', 'U', 'D', 'E', 'V'};
        for (var c : name) {
            System.out.println(c);
        }
    }
}
