package main.java;

import java.util.ArrayList;
import java.util.List;


public class PreOrderTraversalOfBinaryTree {
    public static void main(String[] args) {

    }

    //      Recursive Solution

     List<Integer> list = new ArrayList<Integer>();
     public List<Integer> preorderTraversal(TreeNode root) {
         if(root == null) {
             return list;
         }
         list.add(root.val);
         preorderTraversal(root.left);
         preorderTraversal(root.right);

         return list;
     }


    //     Iterative Solution
//    List<Integer> list = new ArrayList<Integer>();
//    public List<Integer> preorderTraversal(TreeNode root) {
//
//    }
}
