package io.vk.core;


import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        final int[] x = {1, 2, 3, 4};
        /* x cannot be assigned a new value since it is final. uncomment below & check */
        // x = new int[]{1, 2, 3, 4, 6, 7};

        // this is completely legal since final is not immutable
        x[3] = 5;
        System.out.println(Arrays.toString(x));

        // Find mimimum in a given array
        System.out.println("Minimum in the array :: " + findMin(x));

        var y = new int[][]{{1, 2, 3, 7}, {4, 5, 6}};
        for (var i = 0; i < y.length; i++) {
            for (var j = 0; j < y[i].length; j++) {
                System.out.println(y[i][j]);
            }
        }

        var z = new int[][][]{
                {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12, 13}, {14, 15, 16, 17}, {18, 19, 20, 21}},
                {{22, 23, 24, 25}, {26, 27, 28}}
        };

        System.out.println(" @@@@ 3D Array @@@@ ");
        for (var i = 0; i < z.length; i++) {
            for (var j = 0; j < z[i].length; j++) {
                for (var k = 0; k < z[i][j].length; k++) {
                    System.out.print(z[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    static int findMin(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < Integer.MAX_VALUE)
                min = array[i];
        }
        return min;
    }
}