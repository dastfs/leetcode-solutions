package Medium;

import java.util.ArrayList;
import java.util.List;

public class ValidateBST {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(0);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(6);
        TreeNode t8 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        t7.right = t8;
            //3
        //1     5
     //0   2   4  6
     //             3
        TreeNode t01 = new TreeNode(2);
        TreeNode t02 = new TreeNode(1);
        TreeNode t03 = new TreeNode(3);

        t01.left = t02;
        t01.right = t03;
        isValidBSTEfficient(t1);
    }

    public static boolean isValidBST(TreeNode root){
        List<Integer> list = new ArrayList<>();
        list = getListOfValues(root, list);

        if(root == null)
            return true;

        System.out.println(list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) >= list.get(i))
                return false;
        }
        return true;
    }

    public static boolean isValidBSTEfficient(TreeNode root) {
        return helper(root, null, null);
    }
    private static boolean helper(TreeNode root, TreeNode min, TreeNode max) {
        System.out.println("min - " + (min!=null?min.val:null) + "; "
                + "max - "+ (max!=null?max.val:null) + "; "
                + "root - "+ (root!=null?root.val:null) + "; ");

        if (root == null)
            return true;

        if ((min != null && root.val <= min.val) || (max != null && root.val >= max.val))
            return false;

        return helper(root.left, min, root)
                && helper(root.right, root, max);
    }

    public static List<Integer> getListOfValues(TreeNode root, List<Integer> values) {
        // List<Integer> values = new ArrayList<>();
        if(root.left != null ){
            // if(root.val <= root.left.val)
            //     return false;

            // values.add(root.left.val);

            // if(root.right != null){
            //     if(root.left.val >= root.right.val)
            //         return false;
            // }
            getListOfValues(root.left, values);
        }

        values.add(root.val);
        if(root.right != null ){
            // if(root.val >= root.right.val)
            //     return false;
            // if(root.left != null){
            //     if(root.right.val <= root.left.val)
            //         return false;
            // }
            // values.add(root.right.val);
            getListOfValues(root.right, values);
        }
        return values;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
