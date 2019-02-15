package com.company;
import org.junit.jupiter.api.*;


public class SterlingTest {
    public SterlingTest() {
    }

    @Test
    public void testPercentage() {
        Sterling value;
        value = new Sterling(1.4);
        value.percentageChange(20);

        Assertions.assertEquals(1.4*1.2, value.getValue());
    }

    @Test
    public void testAdd(double addition) {
        Sterling value;
        value = new Sterling(1.4);
        value.add(5);

        Assertions.assertEquals(1.4+5, 6.4);
    }
}
