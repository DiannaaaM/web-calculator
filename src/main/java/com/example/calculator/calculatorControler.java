package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class calculatorControler {

    @GetMapping("/calculator")
    public String helloProgramm() {
        return "<h1>Добро пожаловать в калькулятор</h1>";
    }

    @GetMapping("/calculator/plus?num1=5&num2=5")
    public String sumNumsProgramm(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 + num2;
        return "<p>" + num1 + " + " + num2 + " = " + result + "</p>";
    }

    @GetMapping("/calculator/minus?num1=5&num2=5")
    public String minusNumsProgramm(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 - num2;
        return "<p>" + num1 + " - " + num2 + " = " + result + "</p>";
    }

    @GetMapping("/calculator/multiply?num1=5&num2=5")
    public String multiplyNumsProgramm(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 * num2;
        return "<p>" + num1 + " * " + num2 + " = " + result + "</p>";
    }

    @GetMapping("/calculator/divide?num1=5&num2=5")
    public String divideNumsProgramm(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 == 0) {
            return "<p>Ошибка: деление на ноль</p>";
        }
        int result = num1 / num2;
        return "<p>" + num1 + " / " + num2 + " = " + result + "</p>";
    }
}
