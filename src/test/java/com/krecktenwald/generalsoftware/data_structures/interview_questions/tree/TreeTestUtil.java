package com.krecktenwald.generalsoftware.data_structures.interview_questions.tree;

import com.krecktenwald.generalsoftware.interview_questions.tree.TreeNode;

public class TreeTestUtil {
    TreeNode createFiveNodeTree() {
        // Constructing a simple binary tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        return root;
    }

    private TreeNode createSingletonTree() {
        return new TreeNode(1);
    }

    /**
     * Creates a small binary tree:
     *       1
     *      /
     *     2
     */
    TreeNode createTwoNodeTree() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        return root;
    }
}
