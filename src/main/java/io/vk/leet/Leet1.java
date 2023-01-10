package io.vk.leet;

import java.util.HashMap;
import java.util.Map;

public class Leet1 {

    /**
     * https://leetcode.com/problems/two-sum/
     * <p>
     * Given an array of integers nums and an integer target, return indices of the two numbers
     * such that they add up to target.
     * <p>
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     */

    public static void main(String[] args) {
        var nums = new int[]{4, 3, 1, 4};
        var k = 8;
        int[] res = twoSum(nums, k);
        System.out.println(res[0] + ", " + res[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        if (result[0] == result[1]) throw new RuntimeException("Cannot add two elements to get the target sum");
        return result;
    }
}
