package com.krecktenwald.generalsoftware.interview_questions.tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/**
 * The MaxDepthDfsIteration class calculates the maximum depth of a binary tree
 * using an iterative depth-first search (DFS) approach.
 */
public class MaxDepthDfsIteration {

    /**
     * Calculates the maximum depth of the given binary tree using an iterative DFS approach.
     *
     * @param root The root of the binary tree.
     * @return The maximum depth of the binary tree.
     */
    public int maxDepth(TreeNode root) {
        // Stack to store tree nodes during DFS traversal
        Deque<TreeNode> stack = new LinkedList<>();

        // Stack to store corresponding depths for nodes during DFS traversal
        Deque<Integer> depths = new LinkedList<>();

        // Base case: If the root is null, the depth is 0
        if (root == null) {
            return 0;
        }

        // Initialize the stack and depths with the root and its depth
        stack.add(root);
        depths.add(1);

        // Variables to track the maximum depth and the current depth during traversal
        int depth = 0;
        int currentDepth;

        // Perform DFS traversal using a stack
        while (!stack.isEmpty()) {
            root = stack.pollLast();
            currentDepth = depths.pollLast();

            // If the current node is not null, update depth and continue traversal
            if (root != null) {
                depth = Math.max(depth, currentDepth);

                // Push left and right children of the current node onto the stack
                stack.add(root.left);
                stack.add(root.right);

                // Push corresponding depths for left and right children
                depths.add(currentDepth + 1);
                depths.add(currentDepth + 1);
            }
        }

        // Return the maximum depth of the binary tree
        return depth;
    }
}
