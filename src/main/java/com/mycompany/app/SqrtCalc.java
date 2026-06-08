// Copyright 2025 UNN-CS
// Nazyrov A.A.

package com.mycompany.app;

public class SqrtCalc {
    private double accuracy = 0.00000001;
    private double inputValue;
    
    public SqrtCalc(double val) {
        this.inputValue = val;
    }
    
    public double getAverage(double a, double b) {
        return (a + b) / 2.0;
    }
    
    public boolean isCloseEnough(double guess, double target) {
        return Math.abs(guess * guess - target) < accuracy;
    }
    
    public double improveGuess(double currentGuess, double target) {
        return getAverage(currentGuess, target / currentGuess);
    }
    
    public double iterateNewton(double startGuess, double target) {
        if (isCloseEnough(startGuess, target)) {
            return startGuess;
        }
        return iterateNewton(improveGuess(startGuess, target), target);
    }
    
    public double compute() {
        if (inputValue == 0.0) return 0.0;
        return iterateNewton(inputValue / 2.0, inputValue);
    }
}
