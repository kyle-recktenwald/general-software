package com.krecktenwald.generalsoftware.data_structures.interview_questions.tree;

import com.krecktenwald.generalsoftware.interview_questions.tree.TreeNode;
import com.krecktenwald.generalsoftware.interview_questions.tree.ValidBstDfsRecursive;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidBstDfsRecursiveTest {
    private ValidBstDfsRecursive validBstDfsRecursive;
    private TreeTestUtil treeTestUtil;

    @BeforeEach
    public void setup(){
        validBstDfsRecursive = new ValidBstDfsRecursive();
        treeTestUtil = new TreeTestUtil();
    }

    @Test
    public void testValidBST() {
        TreeNode root = treeTestUtil.createValidBst();
        assertTrue(validBstDfsRecursive.isValidBST(root));
    }

    @Test
    public void testLargeValidBST() {
        TreeNode root = treeTestUtil.createLargeValidBst();
        assertTrue(validBstDfsRecursive.isValidBST(root));
    }

    @Test
    public void testSimpleInvalidBST() {
        TreeNode root = treeTestUtil.createTwoNodeTree();
        assertFalse(validBstDfsRecursive.isValidBST(root));
    }

    @Test
    public void testInvalidBST() {
        TreeNode root = treeTestUtil.createInvalidBst();
        assertFalse(validBstDfsRecursive.isValidBST(root));
    }

    @Test
    public void testEmptyTree() {
        // Testing with an empty tree
        TreeNode root = null;
        assertTrue(validBstDfsRecursive.isValidBST(root));
    }
}
