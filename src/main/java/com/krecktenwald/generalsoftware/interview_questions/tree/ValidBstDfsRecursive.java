package com.krecktenwald.generalsoftware.interview_questions.tree;

public class ValidBstDfsRecursive {
    public boolean validate(TreeNode root, Integer low, Integer high) {
        if (root == null) {
            System.out.print("Current Root Value: null, ");
        } else {
            System.out.printf("Current Root Value: %d, ", root.val);
        }
        System.out.printf("Current Range: %d - %d%n", low, high);
        if (root == null) {
            return true;
        }

        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }

        return  validate(root.left, low, root.val) && validate(root.right, root.val, high);
    }

    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }
}
