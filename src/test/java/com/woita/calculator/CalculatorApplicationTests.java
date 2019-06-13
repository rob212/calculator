package com.woita.calculator;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * CalculatorApplication Test class.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorApplicationTests {

	@Autowired
	private CalculatorController controller;


	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}
}
		  