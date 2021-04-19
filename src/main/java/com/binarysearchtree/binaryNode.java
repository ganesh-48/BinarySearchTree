package com.binarysearchtree;

public class binaryNode<K extends Comparable<K>> {
    K key;
    binaryNode<K> left;
    binaryNode<K> right;

    public binaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
