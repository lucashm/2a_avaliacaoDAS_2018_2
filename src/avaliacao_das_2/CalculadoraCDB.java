package avaliacao_das_2;

public class CalculadoraCDB {

	public CalculadoraCDB() {};
	
	public double calcularRendimentoBruto(double inicial, int dias, double taxa) {
		double multiplicador = dias/365.0;
		double taxaReal = taxa*multiplicador;
		double resposta = inicial * taxaReal / 100.0;
		
		return resposta;
	}
}
