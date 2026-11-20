
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    Main obj = new Main();

    @Test
    void testAddition() {
        assertEquals(15, obj.add(10, 5));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, obj.subtract(10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50, obj.multiply(10, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2, obj.divide(10, 5));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class,
                () -> obj.divide(10, 0));
    }
}
