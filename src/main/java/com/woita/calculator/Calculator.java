package com.woita.calculator;
import org.springframework.stereotype.Service;

/**
 * Calculator
 * 
 * Spring Service for calculator that performs mathematical calculations. 
 */
@Service
public class Calculator {
    int sum(int a, int b) {
        return a + b;
    }
}