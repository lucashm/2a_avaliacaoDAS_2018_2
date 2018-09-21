package avaliacao_das_2;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestRendimentoBruto {

	@Test
	public void testCadastroUmRendimentoBruto() {
		CalculadoraCDB calc = new CalculadoraCDB();
		double resposta = calc.calcularRendimentoBruto(1000, 60, 8.5);
		assertEquals(13.97, resposta, 0.01);
	}

	@Test
	public void testCadastroOutroRendimentoBruto() {
		CalculadoraCDB calc = new CalculadoraCDB();
		double outraResposta = calc.calcularRendimentoBruto(500, 120, 8.0);
		assertEquals(13.15, outraResposta, 0.01);
	}
}


	