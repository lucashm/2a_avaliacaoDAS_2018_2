package avaliacao_das_2;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestRendimentoBruto {

	@Test
	public void testCadastroUmRendimento() {
		CalculadoraCDB calc = new CalculadoraCDB();
		double resposta = calc.calcularRendimentoBruto(1000, 60, 8.5);
		
		assertEquals(13.97, resposta, 0.01);
	}
}
