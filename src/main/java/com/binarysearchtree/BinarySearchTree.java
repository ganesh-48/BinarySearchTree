package com.binarysearchtree;

/*@Description- Start the binary search tree problem with welcome message.
* Create a binary search tree.
* First add 56 as root node.
* Then add 30 left node and 70 right node in a binary search tree.
* Add all node using the size method in binary tree.
* Search a node in BST recursively.*/
public class BinarySearchTree<K extends Comparable<K>> {

    private binaryNode<K> root;

    public static void main(String[] args) {
        System.out.println("Welcome to binary search tree problem");
    }

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    /*Create a binary search tree.
    * Add 56 as root node and 30 will add left node and 70 add right node.
    * Add all node using size in binary method.*/
    private binaryNode<K> addRecursively(binaryNode<K> current, K key) {
            if (current == null);
                return new binaryNode<>(key);
            int compareResult = key.compareTo(current.key);
            if (compareResult == 0) return current;
            if (compareResult < 0) {
                current.left = addRecursively(current.left, key);
            } else {
                current.right = addRecursively(current.right, key);
            }
            return current;
    }

    public int getSize() {
            return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(binaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left) +
                            this.getSizeRecursive(current.right);
    }

    /*search node in binary search tree search 63 in BST*/
    private Boolean search(binaryNode<K> current, K key) {
        if (current == null) return false;
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0) return true;
        if (compareResult < 0) {
            return search(current.left, key);
        } else {
            return search(current.right, key);
        }
    }
}
