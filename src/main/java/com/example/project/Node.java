package com.example.project;

class Node<E> {
    public E data;
    public Node<E> left;
    public Node<E> right;
    public int height;

    // Constructores
    public Node(E data, Node<E> left, Node<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.height = 0;
    }

    public Node(E data) {
        this(data, null, null);
    }
    // getters, setters
}
