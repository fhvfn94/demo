package com.calculator.demo.Controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
    public int plus(int num1, int num2) {
        return num1 + num2;
    }
    public int minus(int num1, int num2) {
        return num1 - num2;
    }
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public int divide(int num1, int num2) {
        int r = 0;
        if (num1 != 0 && num2 != 0) {
            r = num1 / num2;
            return r;
        }
        return r;
    }
}
