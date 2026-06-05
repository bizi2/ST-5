package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest
{
    private static final double DELTA = 1e-5;

    @Test
    public void testAveragePositive() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.5, sqrt.average(2.0, 3.0), DELTA);
    }

    @Test
    public void testAverageNegative() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(-2.5, sqrt.average(-2.0, -3.0), DELTA);
    }

    @Test
    public void testAverageMixed() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(0.0, sqrt.average(-1.0, 1.0), DELTA);
    }

    @Test
    public void testGoodEnoughTrue() {
        Sqrt sqrt = new Sqrt(4.0);
        assertTrue(sqrt.good(2.0, 4.0));
    }

    @Test
    public void testGoodEnoughFalse() {
        Sqrt sqrt = new Sqrt(4.0);
        assertFalse(sqrt.good(2.1, 4.0));
    }

    @Test
    public void testImproveGuess() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.05, sqrt.improve(2.5, 4.0), DELTA);
    }

    @Test
    public void testIterConverges() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.iter(2.0, 4.0), DELTA);
    }

    @Test
    public void testCalcSquareRootOfFour() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(2.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcSquareRootOfNine() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcSquareRootOfSixteen() {
        Sqrt sqrt = new Sqrt(16.0);
        assertEquals(4.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcSquareRootOfTwo() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcSquareRootOfZero() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), 1e-4);
    }

    @Test
    public void testCalcSquareRootOfOne() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcLargeNumber() {
        Sqrt sqrt = new Sqrt(10000.0);
        assertEquals(100.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcSmallNumber() {
        Sqrt sqrt = new Sqrt(0.01);
        assertEquals(0.1, sqrt.calc(), DELTA);
    }
}
