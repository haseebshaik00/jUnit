package com.testing.jUnit;

// assertions are used for testing
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    // for unit test make sure to add more than one test case such that it won't result in a valid answer
    // even though the func is not correct, this results in a not valid unit test
    // one of the goal of unit test is to hit 100% of the lines in the coverage, hence you should try to write good
    // .. unit test func which gives 10% coverage
    //
    @Test
    void checkAdd(){
        SimpleCalculator c = new SimpleCalculator();
        assertEquals(5, c.add(2,3));
        // more functions
        /*
        assertNotEquals();
        assertTrue();
        assertFalse();
        assertNull();
        assertNotNull();
        */
    }

    @Test
    void cornerCase(){
        SimpleCalculator c = new SimpleCalculator();
        assertThrows(IllegalArgumentException.class,
                () -> c.add(-1,-1));
    }
}