package com.woita.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * CalculatorController
 * 
 * Spring controller for accessing the Calculator service.
 */
@RestController
class CalculatorController {
    @Autowired
    private Calculator calculator;

    @RequestMapping("/sum")
    ResponseEntity<Integer> sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
        // return String.valueOf(calculator.sum(a, b));
        int response = calculator.sum(a, b);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}