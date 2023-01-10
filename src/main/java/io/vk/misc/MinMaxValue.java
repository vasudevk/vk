package io.vk.misc;

/**
 * Find the smallest & largest number in an array
 */
public class MinMaxValue {

    public static void main(String[] args) {

        int[] a = {9, 10, 99, 8, 601, 2};
        int maxValue = a[0];
        int minValue = a[0];

        for (int i = 1; i < a.length; i++) {

            if (minValue > a[i]) {
                minValue = a[i];
            }

            if (maxValue < a[i]) {
                maxValue = a[i];
            }
        }

        System.out.println(maxValue);
        System.out.println(minValue);
    }
}