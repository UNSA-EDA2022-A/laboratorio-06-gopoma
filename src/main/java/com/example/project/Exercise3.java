package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2, 3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a) {
        if(a == null) { // Strange Case, it could be better to throw an Exception, but in their place, returning a consistent value
            return true;
        }
        return bstEstrictamenteBinario(a.root);
    }   
    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(Node<T> n) {
        // Continuing with the logic of past implementations, it is going to going across
        // the BST and verify if each Node of it is also a bstEstrictamenteBinario through recursion
        if(n == null) { // Arrived at an Empty path, so we finished it successfully
            return true;
        } else {
            // Stop Condition: Make a has two or no childs comparison and continue recursing with those nodes as params and connect with the previous Stop Condition
            return ((n.left == null && n.right == null) || (n.left != null && n.right != null)) 
            && bstEstrictamenteBinario(n.left) 
            && bstEstrictamenteBinario(n.right);
        }
    }
}
