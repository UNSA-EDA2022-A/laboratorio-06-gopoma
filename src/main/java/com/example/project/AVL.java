package com.example.project;

public class AVL<E extends Comparable<E>> extends BST<E> {

    private void updateHeight(Node<E> node) {
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        node.height = Math.max(leftHeight, rightHeight) + 1;
    }

    private int height(Node<E> node) {
        if (node == null)
            return -1;
        return node.height;
    }

    private int factorEquilibrio(Node<E> node) {
        return height(node.right) - height(node.left);
    }

    private Node<E> rotateRight(Node<E> node) {

        Node<E> leftChild = node.left;
        node.left = leftChild.right;
        leftChild.right = node;

        updateHeight(node);
        updateHeight(leftChild);

        return leftChild;
    }

    private Node<E> rotateLeft(Node<E> node) {

        Node<E> rightChild = node.right;
        node.right = rightChild.left;
        rightChild.left = node;

        updateHeight(node);
        updateHeight(rightChild);

        return rightChild;
    }

    private Node<E> doubleRotateRight(Node<E> node) {
        node.left = rotateLeft(node.left);
        return rotateRight(node);
    }

    private Node<E> doubleRotateLeft(Node<E> node) {
        node.right = rotateRight(node.right);
        return rotateLeft(node);
    }

    protected Node<E> insertNode(E x, Node<E> node) {
        node = super.insertNode(x, node);
        updateHeight(node);

        return rectructuracion(node);
    }

    protected Node<E> removeNode(E x, Node<E> node) {
        node = super.removeNode(x, node);
        if (node == null)
            return null;
        updateHeight(node);

        return rectructuracion(node);
    }

    protected Node<E> rectructuracion(Node<E> node) {

        int fe = factorEquilibrio(node);

        if (fe < -1) {
            if (factorEquilibrio(node.left) <= 0)
                node = rotateRight(node);
            else
                node = doubleRotateRight(node);
        }

        if (fe > 1) {
            if (factorEquilibrio(node.right) >= 0)
                node = rotateLeft(node);
            else
                node = doubleRotateLeft(node);
        }
        return node;
    }

}
