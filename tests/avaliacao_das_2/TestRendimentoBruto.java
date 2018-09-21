package avaliacao_das_2;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


import org.junit.Test;

@RunWith(Parameterized.class)
public class TestRendimentoBruto {
	
	private double inicial;
	private int dias;
	private double taxa;
	private double resposta;
	
	public TestRendimentoBruto(double inicial, int dias, double taxa, double resposta) {
		this.inicial = inicial;
		this.dias = dias;
		this.taxa = taxa;
		this.resposta = resposta;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{1000, 60, 8.5, 13.97},
			{500, 120, 8.0, 13.15},
			{3000, 240, 9.0, 177.53}
		});
	}

	@Test
	public void testCadastroRendimentoBruto() {
		CalculadoraCDB calc = new CalculadoraCDB();
		double calculo = calc.calcularRendimentoBruto(inicial, dias, taxa);
		assertEquals(calculo, resposta, 0.01);
	}

}


	