package io.vk.leet;

import java.util.Arrays;

public class Leet1480 {

    /**
     * https://leetcode.com/problems/running-sum-of-1d-array/
     * <p>
     * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
     * <p>
     * Return the running sum of nums.
     * <p>
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */

    public static void main(String[] args) {
        var nums = new int[]{4, 3, 1, 4};
        int[] res = runningSum(nums);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(runningSumAlt(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }

    public static int[] runningSumAlt(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
        return nums;
    }
}
