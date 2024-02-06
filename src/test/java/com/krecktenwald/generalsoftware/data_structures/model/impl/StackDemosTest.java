package com.krecktenwald.generalsoftware.data_structures.model.impl;

import com.krecktenwald.generalsoftware.data_structures.model.StackDemos;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackDemosTest {

    StackDemos stackDemos;

    @BeforeEach
    public void setup(){
        stackDemos = new StackDemos();
    }

    @Test
    public void stackDemoTest() {
        stackDemos.stackDemo();
    }
}
