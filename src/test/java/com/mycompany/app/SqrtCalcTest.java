// Copyright 2025 UNN-CS
// Nazyrov A.A.

package com.mycompany.app;

import static org.junit.Assert.*;
import org.junit.Test;

public class SqrtCalcTest {
    
    private static final double EPS = 1e-9;
    
    @Test
    public void testAveragePositive() {
        SqrtCalc calc = new SqrtCalc(4.0);
        assertEquals(2.5, calc.getAverage(2.0, 3.0), EPS);
    }
    
    @Test
    public void testAverageNegative() {
        SqrtCalc calc = new SqrtCalc(4.0);
        assertEquals(-2.5, calc.getAverage(-2.0, -3.0), EPS);
    }
    
    @Test
    public void testAverageMixed() {
        SqrtCalc calc = new SqrtCalc(4.0);
        assertEquals(0.0, calc.getAverage(-1.0, 1.0), EPS);
    }
    
    @Test
    public void testCloseEnoughTrue() {
        SqrtCalc calc = new SqrtCalc(4.0);
        assertTrue(calc.isCloseEnough(2.000000001, 4.0));
    }
    
    @Test
    public void testCloseEnoughFalse() {
        SqrtCalc calc = new SqrtCalc(4.0);
        assertFalse(calc.isCloseEnough(2.1, 4.0));
    }
    
    @Test
    public void testImproveGuess() {
        SqrtCalc calc = new SqrtCalc(4.0);
        assertEquals(2.05, calc.improveGuess(2.5, 4.0), EPS);
    }
    
    @Test
    public void testIterateForFour() {
        SqrtCalc calc = new SqrtCalc(4.0);
        assertEquals(2.0, calc.iterateNewton(1.0, 4.0), 1e-8);
    }
    
    @Test
    public void testIterateForNine() {
        SqrtCalc calc = new SqrtCalc(9.0);
        assertEquals(3.0, calc.iterateNewton(1.0, 9.0), 1e-8);
    }
    
    @Test
    public void testIterateForSixteen() {
        SqrtCalc calc = new SqrtCalc(16.0);
        assertEquals(4.0, calc.iterateNewton(1.0, 16.0), 1e-8);
    }
    
    @Test
    public void testComputeFour() {
        SqrtCalc calc = new SqrtCalc(4.0);
        assertEquals(2.0, calc.compute(), EPS);
    }
    
    @Test
    public void testComputeNine() {
        SqrtCalc calc = new SqrtCalc(9.0);
        assertEquals(3.0, calc.compute(), EPS);
    }
    
    @Test
    public void testComputeSixteen() {
        SqrtCalc calc = new SqrtCalc(16.0);
        assertEquals(4.0, calc.compute(), EPS);
    }
    
    @Test
    public void testComputeTwo() {
        SqrtCalc calc = new SqrtCalc(2.0);
        assertEquals(Math.sqrt(2.0), calc.compute(), 1e-8);
    }
    
    @Test
    public void testComputeZero() {
        SqrtCalc calc = new SqrtCalc(0.0);
        assertEquals(0.0, calc.compute(), EPS);
    }
    
    @Test
    public void testComputeOne() {
        SqrtCalc calc = new SqrtCalc(1.0);
        assertEquals(1.0, calc.compute(), EPS);
    }
    
    @Test
    public void testComputeLarge() {
        SqrtCalc calc = new SqrtCalc(1000000.0);
        assertEquals(1000.0, calc.compute(), 1e-6);
    }
}
