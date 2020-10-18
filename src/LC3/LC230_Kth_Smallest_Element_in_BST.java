package LC3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class LC230_Kth_Smallest_Element_in_BST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
    public static int kthSmallest2(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

        while (true) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            if (--k == 0) return root.val;
            root = root.right;
        }}
    public static int kthSmallest(TreeNode root, int k) {
        //add tree vals to list
        ArrayList<Integer> res =new ArrayList<>();
     //go traverse recursivly
        helper(root, res);
        //return k element in array
        return res.get(k-1);

    }

    private static void helper(TreeNode root, ArrayList<Integer> res) {
        //base case
        if (root==null) return;
        //traverse inorder
        helper(root.left, res);
        //add to array
        res.add(root.val);
       helper(root.right,res);
    }

    public static void main(String[] args) {
        TreeNode tree= new TreeNode(3);
        tree.left=new TreeNode(1);
        tree.right=new TreeNode(4);
        tree.left.right=new TreeNode(2);

        System.out.println(kthSmallest2(tree,2));
    }
}
