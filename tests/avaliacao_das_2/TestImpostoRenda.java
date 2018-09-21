package avaliacao_das_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestImpostoRenda {

	@Test
	public void testCalculoImpostoRenda() {
		CalculadoraCDB calc = new CalculadoraCDB();
		double calculo = calc.calcularImpostoRenda(1000, 60, 8.5);
		assertEquals(calculo, 3.14, 0.01);
	}

	@Test
	public void testCalculoOutroImpostoRenda() {
		CalculadoraCDB calc = new CalculadoraCDB();
		double calculo = calc.calcularImpostoRenda(500, 120, 8.0);
		assertEquals(calculo, 2.96, 0.01);
	}
}
