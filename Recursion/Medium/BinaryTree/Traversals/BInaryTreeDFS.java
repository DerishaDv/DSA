package Recursion;

import java.util.ArrayList;
import java.util.List;

class BinaryTree{
    int val;
    BinaryTree right;
    BinaryTree left;
    BinaryTree(int val){
        this.val = val;
    }

}
public class BInaryTreeDFS {
    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(1);
        root.left = new BinaryTree(2);
        root.right = new BinaryTree(3);
        root.left.left = new BinaryTree(4);
        root.left.right = new BinaryTree(5);


        List<Integer> inorderList = new ArrayList<>(5);
        inorderTraversal(root,inorderList);
        System.out.println(inorderList);

        List<Integer> preorderList = new ArrayList<>(5);
        preorderTraversal(root,preorderList);
        System.out.println(preorderList);

        List<Integer> postorderList = new ArrayList<>(5);
        postorderTraversal(root,postorderList);
        System.out.println(postorderList);
    }

    /** POSTORDER TRAVERSAL
     * Traverse the left subtree, i.e., call Postorder(left-subtree)
     * Traverse the right subtree, i.e., call Postorder(right-subtree)
     * Visit the root
     */
    private static void postorderTraversal(BinaryTree root, List<Integer> postorderList){
        if(root == null) return;
        postorderTraversal(root.left, postorderList);
        postorderTraversal(root.right, postorderList);
        postorderList.add(root.val);

    }

    /** PREORDER TRAVERSAL
     *
     * Visit the root
     * Traverse the left subtree, i.e., call Preorder(left-subtree)
     * Traverse the right subtree, i.e., call Preorder(right-subtree)
     */
    private static void preorderTraversal(BinaryTree root, List<Integer> preorderList) {
        if(root == null) return;
        preorderList.add(root.val);
        preorderTraversal(root.left, preorderList);
        preorderTraversal(root.right, preorderList);
    }

    /**INORDER TRAVERSAL
     *
     * Traverse the left subtree, i.e., call Inorder(left-subtree)
     * Visit the root
     * Traverse the right subtree, i.e., call Inorder(right-subtree)
     */

    private static void inorderTraversal(BinaryTree root, List<Integer> inorderList){
        if(root==null) return;
        inorderTraversal(root.left, inorderList);
        inorderList.add(root.val);
        inorderTraversal(root.right, inorderList);


    }
}
