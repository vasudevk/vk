package io.vk.core;

import java.util.Arrays;

public class ArraysReverseDemo {

    // TODO - https://www.geeksforgeeks.org/reverse-an-array-in-java/

    public static void main(String[] args) {

        int[] arr = {8, 17, 20, 95, 63};
        System.out.println("Original Array :: " + Arrays.toString(arr));
        reverseArray(arr);
        reverseArray(arr, arr.length);

    }

    private static void reverseArray(int[] arr) {
        int len = arr.length;
        int[] tempArr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            tempArr[len - 1] = arr[i];
            len--;
        }
        System.out.println("Reversed Array :: " + Arrays.toString(tempArr));
    }

    private static void reverseArray(int[] arr, int len) {
        int temp;
        for (int i = 0; i < len / 2; i++) {
            temp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = temp;
        }
        System.out.println("Reversed Array in less swaps :: " + Arrays.toString(arr));
    }
}
