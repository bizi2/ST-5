// Copyright 2025 UNN-CS
// Nazyrov A.A.

package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        double num = Double.parseDouble("2.0");
        SqrtCalc calc = new SqrtCalc(num);
        double result = calc.compute();
        System.out.println("Square root of " + num + " = " + result);
    }
}
