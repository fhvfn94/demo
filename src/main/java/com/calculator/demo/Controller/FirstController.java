package com.calculator.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class FirstController {
    private final CounterService counterService;

    public FirstController(CounterService counterService) {
        this.counterService = counterService;
    }
    private int count;
    @GetMapping
    public String showController() {
        return "<b>Hello world</b>";
    }
    @GetMapping("/counter")
    public String showCounter() {
        return "<b>Hello world</b> " + counterService.getRequestCount();
    }
    @GetMapping("/plus")
    public String showSum(@RequestParam int num1, @RequestParam int num2) {
        int r = num1 + num2;
        return num1 + " + " + num2 + " = " + r;
    }

    @GetMapping("/minus")
    public String showMinus(@RequestParam int num1, @RequestParam int num2) {
        int r = num1 - num2;
        if (r != 0 ){
            return num1 + " - " + num2 + " = " + r;
        } else {
            return "Ошибка";
        }
    }
    @GetMapping("/multiply")
    public String showMultiply(@RequestParam int num1, @RequestParam int num2) {
        if (num1 !=0 && num2 != 0) {
            int r = num1 * num2;
            return num1 + " * " + num2 + " = " + r;
        } else {
            return "Ошибка";
        }
    }

    @GetMapping("/divide")
    public String showDivide(@RequestParam int num1, @RequestParam int num2) {
        if (num1 !=0 && num2 != 0) {
            int r = num1 / num2;
            return num1 + " / " + num2 + " = " + r;
        } else {
            return "Ошибка";
        }
    }
}
