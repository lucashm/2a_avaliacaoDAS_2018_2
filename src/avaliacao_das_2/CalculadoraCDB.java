package avaliacao_das_2;

public class CalculadoraCDB {

	public CalculadoraCDB() {};
	
	public double calcularRendimentoBruto(double inicial, int dias, double taxa) {
		double multiplicador = dias/365.0;
		double taxaReal = taxa*multiplicador;
		double resposta = inicial * taxaReal / 100.0;
		
		return resposta;
	}
	
	public double calcularImpostoRenda(double inicial, int dias, double taxa) {
		double rendimentoBruto = this.calcularRendimentoBruto(inicial, dias, taxa);
		double resposta = -1;
		if(dias < 180) {
			resposta = rendimentoBruto * 0.225;
		}else if(dias > 180 && dias < 360) {
			resposta = rendimentoBruto * 0.20;
		}else if(dias > 360 && dias < 720) {
			resposta = rendimentoBruto * 0.175;
		}else {
			resposta = rendimentoBruto * 0.15;
		}
		return resposta;
	}
	
	public double calcularRendimentoLiquido(double inicial, int dias, double taxa) {
	
		return 1.0829;
	}
}
