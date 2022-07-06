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


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){
        return bstEstrictamenteBinario(a.root);
    }   
    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(Node<T> n) {
        if(n == null) {
            return true;
        } else {
            return ((n.left == null && n.right == null) || (n.left != null && n.right != null)) 
            && bstEstrictamenteBinario(n.left) 
            && bstEstrictamenteBinario(n.right);
        }
    }
}
