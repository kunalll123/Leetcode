import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

 class InorderTraversalRecursive {

    // Inorder Traversal Method
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode node, List<Integer> list) {
        if (node == null) return;

        inorder(node.left, list);       // Left
        list.add(node.val);             // Root
        inorder(node.right, list);      // Right
    }

    // Main Method
    public static void main(String[] args) {
        /*
            Example Tree: [1,null,2,3]
                  1
                   \
                    2
                   /
                  3
        */

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        InorderTraversalRecursive solution = new InorderTraversalRecursive();
        List<Integer> inorderList = solution.inorderTraversal(root);

        System.out.println("Inorder Traversal: " + inorderList);
    }
}

