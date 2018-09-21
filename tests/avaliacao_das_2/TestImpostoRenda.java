package avaliacao_das_2;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.junit.Test;


@RunWith(Parameterized.class)
public class TestImpostoRenda {

	private double inicial;
	private int dias;
	private double taxa;
	private double resposta;
	
	public TestImpostoRenda(double inicial, int dias, double taxa, double resposta) {
		this.inicial = inicial;
		this.dias = dias;
		this.taxa = taxa;
		this.resposta = resposta;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][]{
			{1000, 60, 8.5, 3.14},
			{500, 120, 8.0, 2.96},
			{3000, 240, 9.0, 35.51},
			{4200, 900, 9.5, 147.58},
			{250, 420, 8.0, 4.03}
		});
	}
	
	@Test
	public void testCalculoImpostoRenda() {
		CalculadoraCDB calc = new CalculadoraCDB();
		double calculo = calc.calcularImpostoRenda(inicial, dias, taxa);
		assertEquals(calculo, resposta, 0.01);
	}
}
