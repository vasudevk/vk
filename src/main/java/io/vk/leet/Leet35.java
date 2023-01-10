package io.vk.leet;

public class Leet35 {

    /**
     * https://leetcode.com/problems/search-insert-position/
     * Given a sorted array of distinct integers and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     * <p>
     * You must write an algorithm with O(log n) runtime complexity.
     */

    public static void main(String[] args) {
        var nums = new int[]{1, 3, 5, 6, 8};
        var target = 7;
        var index = searchInsert(nums, target);
        System.out.println(index);

    }

    private static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == nums[mid]) return mid;
            if (target > nums[mid]) left = mid + 1;
            if (target < nums[mid]) right = mid - 1;
        }

        return left;
    }
}