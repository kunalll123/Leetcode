// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Solution class to flatten the binary tree
 class Solution {
    private TreeNode prev = null;

    /**
     * Flatten the binary tree to a linked list using reverse preorder traversal.
     * The traversal order is: right -> left -> root
     */
    public void flatten(TreeNode root) {
        if (root == null) return;

        // Step 1: Recursively flatten right subtree
        flatten(root.right);

        // Step 2: Recursively flatten left subtree
        flatten(root.left);

        // Step 3: Rewire the current node
        root.right = prev; // Link current node's right to previous
        root.left = null;  // Set left to null to mimic linked list
        prev = root;       // Move prev pointer to current
    }

    /**
     * Utility function to print the flattened linked list.
     * It uses right pointers as next pointers.
     */
    public void printFlattenedList(TreeNode root) {
        System.out.print("Flattened List: ");
        while (root != null) {
            System.out.print(root.val + " -> ");
            root = root.right;
        }
        System.out.println("null");
    }

    // Main method to test the flatten function
    public static void main(String[] args) {
        // Construct the input binary tree: [1,2,5,3,4,null,6]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        // Create Solution object and flatten the tree
        Solution sol = new Solution();
        sol.flatten(root);

        // Print the flattened linked list
        sol.printFlattenedList(root);
    }
}

