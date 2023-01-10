package io.vk.leet;

public class Leet1672 {

    /**
     * https://leetcode.com/problems/richest-customer-wealth/
     * <p>
     * You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the
     * ith customer has in the j bank. Return the wealth that the richest customer has.
     * <p>
     * A customer's wealth is the amount of money they have in all their bank accounts.
     * The richest customer is the customer that has the maximum wealth.
     */

    public static void main(String[] args) {
        int[][] nums = {{1000}, {1, 2, 3}, {4, 5, 6}, {10, 90}, {1001}};
        var res = maximumWealth(nums);
        System.out.println(res);
    }

    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int curr = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                curr += accounts[i][j];
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}