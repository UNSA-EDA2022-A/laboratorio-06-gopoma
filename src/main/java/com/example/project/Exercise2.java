package com.example.project;

public class Exercise2 {

    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2, 3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstIguales(tree1, tree2));
        
    }


    public <T extends Comparable<T>> boolean bstIguales(BST<T> a1, BST<T> a2){
        // Taking care about Strange Cases like sending null values
        if(a1 == null && a2 == null) {
            return true;
        } else if(a1 == null || a2 == null) { // Condition by Filtering
            return false;
        }
        return bstIguales(a1.root, a2.root);
    }
    public <T extends Comparable<T>> boolean bstIguales(Node<T> n1, Node<T> n2) {
        // This algorithm reuses the bstSimilares logic, in addition to inject
        // the condition that in every stop values from data have to be compared too
        if((n1 != null && n2 == null) || (n1 == null && n2 != null)) { // This condition verifies that bstSimilares' condition has not been broken, because if so, they aren't equal
            return false;
        } else {
            if(n1 == null && n2 == null) { // If both n1 and n2 are null, stop verifying their childs to avoid the NullPointerException and return true because there wasn't any inconsistency regarding the case above
                return true;
            } else {
                return n1.data.compareTo(n2.data) == 0 && bstIguales(n1.left, n2.left) && bstIguales(n1.right, n2.right); // As both nodes are not null, compare their data values and split the current path into two through recursing their same direction childs
            }
        }   
    }
}
