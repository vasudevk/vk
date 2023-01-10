package io.vk.core;

import java.util.Arrays;

public class ArraysSortDemo {

    public static void main(String[] args) {
        int[] one = {100, 50, 16, 117, 56};
        int[] two = {100, 50, 16, 15, 1};
        System.out.println("Sorted Array :: " + Arrays.toString(sortedArray(one)));
        System.out.println("Sorted Array :: " + Arrays.toString(sortedArray(two)));
    }

    static int[] sortedArray(int[] nums) {

        int temp;
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] < nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                    flag = true;
                }
            }
        } while (flag);

        return nums;
    }
}