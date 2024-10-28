package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class calculatorControler {

    @GetMapping
    public String helloProgramm() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }

    @GetMapping("/plus")
    public String sumNumsProgramm(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 + num2;
        return "<p>" + num1 + " + " + num2 + " = " + result + "</p>";
    }

    @GetMapping("/minus")
    public String minusNumsProgramm(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 - num2;
        return "<p>" + num1 + " - " + num2 + " = " + result + "</p>";
    }

    @GetMapping("/multiply")
    public String multiplyNumsProgramm(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 * num2;
        return "<p>" + num1 + " * " + num2 + " = " + result + "</p>";
    }

    @GetMapping("/divide")
    public String divideNumsProgramm(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 == 0) {
            return "<p>Ошибка: деление на ноль</p>";
        }
        int result = num1 / num2;
        return "<p>" + num1 + " / " + num2 + " = " + result + "</p>";
    }
}
