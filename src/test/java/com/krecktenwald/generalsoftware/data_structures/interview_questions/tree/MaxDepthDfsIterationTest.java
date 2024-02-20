package com.krecktenwald.generalsoftware.data_structures.interview_questions.tree;

import com.krecktenwald.generalsoftware.interview_questions.tree.MaxDepthDfsIteration;
import com.krecktenwald.generalsoftware.interview_questions.tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxDepthDfsIterationTest {

    private  MaxDepthDfsIteration maxDepthDfsIteration;
    private TreeTestUtil treeTestUtil;

    @BeforeEach
    public void setup(){
        maxDepthDfsIteration = new MaxDepthDfsIteration();
        treeTestUtil = new TreeTestUtil();
    }


    @Test
    public void testMaxDepth_TwoNodeTree() {
        TreeNode sampleTree = treeTestUtil.createTwoNodeTree();
        int result = maxDepthDfsIteration.maxDepth(sampleTree);

        assertEquals(2, result);
    }

    @Test
    public void testMaxDepth_FiveNodeTree() {
        TreeNode sampleTree = treeTestUtil.createFiveNodeTree();
        int result = maxDepthDfsIteration.maxDepth(sampleTree);

        assertEquals(3, result);
    }
}
