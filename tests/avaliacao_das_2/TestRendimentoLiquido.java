package avaliacao_das_2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRendimentoLiquido {

	@Test
	public void testCalculoRendimentoLiquido() {
		CalculadoraCDB calc = new CalculadoraCDB();
		double calculo = calc.calcularRendimentoLiquido(1000, 60, 8.5);
		assertEquals(calculo, 1.0829, 0.01);
	}
}
