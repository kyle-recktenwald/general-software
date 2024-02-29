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
        Deque<TreeNode> stack = new LinkedList<>();
        Deque<Integer> depths = new LinkedList<>();

        if (root == null) {
            return 0;
        }

        stack.add(root);
        depths.add(1);

        int depth = 0;
        int currentDepth;

        while (!stack.isEmpty()) {
            root = stack.pollLast();
            currentDepth = depths.pollLast();

            if (root != null) {
                depth = Math.max(depth, currentDepth);

                stack.add(root.left);
                stack.add(root.right);

                depths.add(currentDepth + 1);
                depths.add(currentDepth + 1);
            }
        }

        return depth;
    }
}
