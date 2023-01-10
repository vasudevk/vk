package io.vk.leet;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 6, 45, 87, 26, 2, 0, 27, 26, 1};
        mergeSort(arr);
    }

    public static void mergeSort(int[] arr) {
        int len = arr.length;
        if (len < 2) return;

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }

        for (int i = mid; i < len; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        System.out.println(arr);
    }
}
