package com.sm.test;


import com.sm.core.Test;
import com.sm.core.TesterInfo;

@TesterInfo(
        priority = TesterInfo.Priority.HIGH,
        createdBy = "sm",
        tags = {"some","tests" }
)
public class SimpleTests {

    @Test
    void testA() {
        if (true)
            throw new RuntimeException("This test always failed");
    }

    @Test(enabled = false)
    void testB() {
        if (false)
            throw new RuntimeException("This test always passed");
    }

    @Test(enabled = true)
    void testC() {
        if (10 > 1) {
            // do nothing, this test always passed.
        }
    }

}