package com.krecktenwald.generalsoftware.interview_questions.tree;

/**
 * The MaxDepthRecursive class is used to calculate the maximum depth of a binary tree
 * using a recursive approach.
 */
public class MaxDepthDfsRecursive {
    /**
     * Calculates the maximum depth of the given binary tree.
     *
     * @param root The root node of the binary tree.
     * @return The maximum depth of the binary tree.
     */
    public int maxDepth(TreeNode root) {
        // Base case: If the root is null, the depth is 0.
        if (root == null) {
            return 0;
        } else {
            // Recursive cases: Calculate the depth of the left and right subtrees.
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);

            // The maximum depth is the greater of the left and right subtree depths, plus 1 for the current node.
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
