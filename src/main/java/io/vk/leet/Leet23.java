package io.vk.leet;

public class Leet23 {

    // https://leetcode.com/problems/merge-k-sorted-lists
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(4);
        node.next.next = new ListNode(5);

        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(4);

        ListNode node2 = new ListNode(2);
        node2.next = new ListNode(6);

        ListNode[] nodes = new ListNode[3];
        nodes[0] = node;
        nodes[1] = node1;
        nodes[2] = node2;

        ListNode res = mergeKLists(nodes);
        System.out.println(res);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (null == lists || lists.length == 0) return null;
        for (int i = 1; i < lists.length; i++) {
            lists[0] = mergeList(lists[0], lists[i]);
        }
        return lists[0];
    }

    private static ListNode mergeList(ListNode n1, ListNode n2) {
        ListNode node = new ListNode(-1);
        ListNode prev = node;
        while (null != n1 && null != n2) {
            if (n1.val < n2.val) {
                prev.next = n1;
                n1 = n1.next;
            } else {
                prev.next = n2;
                n2 = n2.next;
            }
            prev = prev.next;
        }
        prev.next = (null != n1) ? n1 : n2;
        return node.next;
    }
}