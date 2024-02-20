package com.krecktenwald.generalsoftware.data_structures.interview_questions.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.krecktenwald.generalsoftware.interview_questions.tree.MaxDepthDfsRecursive;
import com.krecktenwald.generalsoftware.interview_questions.tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaxDepthDfsRecursiveTest {

    private MaxDepthDfsRecursive maxDepthDfsRecursive;
    private TreeTestUtil treeTestUtil;

    @BeforeEach
    public void setup(){
        maxDepthDfsRecursive = new MaxDepthDfsRecursive();
        treeTestUtil = new TreeTestUtil();
    }


    @Test
    public void testMaxDepth() {
        // Test with a sample tree
        TreeNode sampleTree = treeTestUtil.createFiveNodeTree();
        int result = maxDepthDfsRecursive.maxDepth(sampleTree);

        // The maximum depth of the sample tree is 3.
        assertEquals(3, result);
    }

    @Test
    public void testMaxDepth_SingletonTree() {
        // Test with a sample tree
        TreeNode sampleTree = treeTestUtil.createFiveNodeTree();
        int result = maxDepthDfsRecursive.maxDepth(sampleTree);

        assertEquals(1, result);
    }

    @Test
    public void testMaxDepth_TwoNodeTree() {
        // Test with a sample tree
        TreeNode sampleTree = treeTestUtil.createTwoNodeTree();
        int result = maxDepthDfsRecursive.maxDepth(sampleTree);

        assertEquals(2, result);
    }

    @Test
    public void testMaxDepthEmptyTree() {
        TreeNode emptyTree = null;
        int result = maxDepthDfsRecursive.maxDepth(emptyTree);

        assertEquals(0, result);
    }
}
