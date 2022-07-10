package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2, 3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
    }


    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2){
        // First of all, we have to take care of strange cases like sending an Empty (no root [No nodes in it]) BST
        if(a1.isEmpty() && a2.isEmpty()) { // If both BSTs are Empty, then they are similar
            return true;
        // Once we filter that both of then are not Empty, we only have that only one of then are Empty or none or them
        } else if(a1.isEmpty() || a2.isEmpty()) { // If any of then are Empty and taking into consideration the case above, then they're not similar
            return false;
        }
        return bstSimilares(a1.root, a2.root); // None of the BSTs are Empty
    }
    public <T extends Comparable<T>> boolean bstSimilares(Node<T> n1, Node<T> n2) {
        /*
         * The idea of the algorithm is to take into consideration that a BST,
         * is just a root of type Node that contains in its Left and Right other 
         * Nodes of its equal type, and so on, so we are able to say that each Node
         * in a BST has other BSTs as their childs. This could be verified in its
         * definition also
         */
        // Taking into consideration the case exposed above, the algorithm is going across
        // the BSTs and make comparisons of each pair of Nodes with same "positional" and "directional" value
        // and if all routes finishes without returning false, they're similar
        if((n1 != null && n2 == null) || (n1 == null && n2 != null)) { // Stop Condition: If they are similar, in all cases, both n1 and n2 have to have references or not
            return false;
        } else {
            if(n1 == null && n2 == null) { // If both n1 and n2 are null, stop verifying childs to avoid the NullPointerException and return true
                return true;
            } else {
                return bstSimilares(n1.left, n2.left) && bstSimilares(n1.right, n2.right); // Continue verifying and split the path into two: from Left and from Right
            }
        }
    }
}
