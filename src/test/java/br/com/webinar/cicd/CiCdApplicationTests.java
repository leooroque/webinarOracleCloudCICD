package br.com.webinar.cicd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.webinar.cicd.model.CalculadoraSimples;
import br.com.webinar.cicd.model.CalculoSimples;

@SpringBootTest
class CiCdApplicationTests {


	@Test
	void soma(){
		CalculadoraSimples calculadora = new CalculadoraSimples();
		double result  = calculadora.calcular(new CalculoSimples(1,1,"+"));
		assertEquals(2, result);
	}

	@Test
	void subtracao(){
		CalculadoraSimples calculadora = new CalculadoraSimples();
		double result  = calculadora.calcular(new CalculoSimples(1,1,"-"));
		assertEquals(0, result);
	}

	@Test
	void multiplicacao(){
		CalculadoraSimples calculadora = new CalculadoraSimples();
		double result  = calculadora.calcular(new CalculoSimples(1,1,"*"));
		assertEquals(1, result);
	}

	@Test
	void divisao(){
		CalculadoraSimples calculadora = new CalculadoraSimples();
		double result  = calculadora.calcular(new CalculoSimples(1,1,"/"));
		assertEquals(1, result);
	}

}
