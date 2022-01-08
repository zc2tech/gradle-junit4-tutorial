package com.zc2tech;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class  GradleTutorialTest {
    GradleTutorial inst;

    public static void main(String[] args) {
        System.out.println("Hello,Gradle Tutorial");
    }

    @Before
    public void setUp() throws Exception {
        inst = new GradleTutorial();
    }

    @Test
    public void testGetPlusResult() {
        assertEquals(inst.getPlusResult(3,5),8);
        assertEquals(inst.getPlusResult(13,5),18);
    }
}