package io.vk.objects;

public class Node {
    int key;
    public Node left;
    public Node right;

    public Node(int key) {
        this.key = key;
        this.left = this.right = null;
    }
}