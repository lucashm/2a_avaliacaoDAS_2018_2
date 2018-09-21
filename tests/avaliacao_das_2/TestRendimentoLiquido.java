package avaliacao_das_2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.junit.Test;

@RunWith(Parameterized.class)
public class TestRendimentoLiquido {

	private double inicial;
	private int dias;
	private double taxa;
	private double resposta;
	
	public TestRendimentoLiquido(double inicial, int dias, double taxa, double resposta) {
		this.inicial = inicial;
		this.dias = dias;
		this.taxa = taxa;
		this.resposta = resposta;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{1000, 60, 8.5, 1.0829},
			{500, 120, 8.0, 2.0384},
			{3000, 240, 9.0, 4.7342},
			{400, 550, 8.0, 9.9452}
		});
	}
	
	@Test
	public void testCalculoRendimentoLiquido() {
		CalculadoraCDB calc = new CalculadoraCDB();
		double calculo = calc.calcularRendimentoLiquido(inicial, dias, taxa);
		assertEquals(calculo, resposta, 0.01);
	}
}
