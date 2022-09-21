package Easy;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree {
    private int priv = 0;
    private String privS = "1";
    int s = 1;
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(0);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(6);
        TreeNode t8 = new TreeNode(3);

        //3
        //1 5
        //0 2 4 6
        //        3
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        t7.right = t8;
        System.out.println(maxDepthIter(t1));
        System.out.println(maxDepth(t1));

    }


        public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
    public static int maxDepthIter(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                size--;
            }
            count++;
        }
        return count;
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

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


}

class A extends MaximumDepthOfBinaryTree{
    public A (){
    }
}
