package io.vk.leet;

import java.util.*;

public class Leet {

    public static void main(String[] args) {
        var fz = fizzBuzz(6);
        var nosteps = numberOfSteps(20);
        System.out.println(fz);
        System.out.println(nosteps);

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
//        node.next.next.next.next.next = new ListNode(6);
        ListNode middleNode = middleNode(node);
        System.out.println(middleNode.toString());

        System.out.println(canConstruct("aa", "aab"));

        var ones = new int[]{1, 2, 3, 4, 0, 0, 1, 1, 0, 8, 4, 7, 9, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(ones));

        var find = new int[]{12, 345, 2, 6, 7896};
        System.out.println(findNumbers(find));

        var sort = new int[]{-7, -3, 2, 3, 11};
        int[] sorted = sortedSquares(sort);
        System.out.println("Squares of a Sorted Array :: " + Arrays.toString(sorted));

        var kFreq = new int[]{1, 2}; // TODO - need to check below logic
        System.out.println("Top K Frequent Elements :: " + Arrays.toString(topKFrequent(kFreq, 2)));

        var unsorted = new int[]{1, 4, 7, 1, 2, 6, 3, 5, 0, 0, 0};
        var unsorted_1p = new int[]{2, 0, 2, 1, 1, 0};
        sortColors(unsorted);
        System.out.println(Arrays.toString(unsorted));
        sortColors_1pass(unsorted_1p);
        System.out.println(Arrays.toString(unsorted_1p));

        var nums = new int[]{2, 0, 2, 1, 1, 0};
        var start = 0;
        var end = nums.length - 1;
        var mid = start + (end - start) / 2;
        System.out.println(nums[mid]);

        // Merge Sort
        int[] arr = new int[]{9, 4, 6, 45, 87, 26, 2, 0, 27, 26, 1};
        mergeSort(arr);
        System.out.println("Merge Sorted Array :: " + Arrays.toString(arr));

        int[] missing = new int[]{-1, -1, 2, 1, 9, 3, 2, -1, 4, -1};
        System.out.println("Replaced Missing Digits :: " + Arrays.toString(replaceWith(missing)));

    }

    public static int[] replaceWith(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1 && arr[i] != i) {
                int x = arr[i];

                // check if desired place is not vacate
                while (arr[x] != -1 && arr[x] != x) {
                    // store the value from desired place
                    int y = arr[x];

                    // place the x to its correct position
                    arr[x] = x;

                    // now y will become x, now search the place for x
                    x = y;
                }

                // place the x to its correct position
                arr[x] = x;

                // check if while loop hasn't set the correct value at A[i]
                if (arr[i] != i) {
                    // if not then put -1 at the vacated place
                    arr[i] = -1;
                }
            }
        }

        return arr;
    }

    // https://leetcode.com/problems/fizz-buzz/
    public static List<String> fizzBuzz(int n) {
        List<String> sol = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) sol.add("FizzBuzz");
            else if (i % 3 == 0) sol.add("Fizz");
            else if (i % 5 == 0) sol.add("Buzz");
            else sol.add(String.valueOf(i));

            // alternate elegant solution
            // sol.add(i % 15 == 0 ? "FizzBuzz" : i % 5 == 0 ? "Buzz" : i % 3 == 0 ? "Fizz" : String.valueOf(i));
        }
        return sol;
    }

    // https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero
    public static int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            num = num % 2 == 0 ? num / 2 : num - 1;
            count++;
        }
        return count;
    }

    // https://leetcode.com/problems/middle-of-the-linked-list
    public static ListNode middleNode(ListNode head) {
        ListNode start = head;
        ListNode end = head;
        while (end != null && end.next != null) {
            start = start.next;
            end = end.next.next;
        }
        return start;
    }

    // https://leetcode.com/problems/ransom-note/
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (char i : magazine.toCharArray()) {
            arr[i - 'a']++;
        }
        for (char i : ransomNote.toCharArray()) {
            if (arr[i - 'a'] == 0) {
                return false;
            } else {
                arr[i - 'a']--;
            }
        }
        return true;
    }

    // https://leetcode.com/problems/max-consecutive-ones
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++; // if 1, then increase the count
                max = Math.max(max, count);
            } else count = 0;
        }
        return max;
    }

    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if ((num > 9 && num < 100) || (num > 999 && num < 10000) || num == 100000) {
                count++;
            }
        }
        return count;
    }

    // https://leetcode.com/problems/squares-of-a-sorted-array/
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        return Arrays.stream(nums).sorted().toArray();
    }

    // https://leetcode.com/problems/top-k-frequent-elements/
//    public static int[] topKFrequent(int[] nums, int k) {
//        List<Integer> tmp = new ArrayList<>();
//        Map<Integer, Integer> fmap = new HashMap<>();
//        for (int num : nums) {
//            fmap.put(num, fmap.getOrDefault(num, 0) + 1);
//        }
//        fmap.forEach((n, count) -> {
//            if (count >= k) {
//                tmp.add(n);
//            }
//        });
//
//        int[] response = new int[tmp.size()];
//        if (tmp.size() != 0) {
//            if (tmp.size() <= k) {
//                for (int i = 0; i < tmp.size(); i++) {
//                    response[i] = tmp.get(i);
//                }
//            } else {
//                for (int i = 0; i < k; i++) {
//                    response[i] = tmp.get(i);
//                }
//            }
//        }
//
//        return response;
//    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        heap.addAll(map.keySet());

        int response[] = new int[k];
        for (int i = 0; i < k; i++) {
            response[i] = heap.poll();
        }

        return response;
    }

    public static void sortColors(int[] nums) {

        int ct0 = 0, ct1 = 0, ct2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) ct0++;
            if (nums[i] == 1) ct1++;
            if (nums[i] == 2) ct2++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < ct0) nums[i] = 0;
            else if (i < ct0 + ct1) nums[i] = 1;
            else nums[i] = 2;
        }

    }

    public static void sortColors_1pass(int[] nums) {
        int p1 = 0;
        int p2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 2;
                nums[p2++] = 1;
                nums[p1++] = 0;
            } else if (nums[i] == 1) {
                nums[i] = 2;
                nums[p2++] = 1;
            }
        }
    }

    public static void mergeSort(int[] arr) {
        int len = arr.length;
        if (len < 2) return;

        int mid = len / 2;
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
        merge(arr, left, right);

    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int lsize = left.length;
        int rsize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < lsize && j < rsize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < lsize) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < rsize) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode node = new ListNode();
        for (ListNode list : lists) {
        }
        return new ListNode();
    }
}