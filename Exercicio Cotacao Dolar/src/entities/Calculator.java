package entities;

public class Calculator {

	public static final double IOF = 6;
	
	public static double valorASerPago(double cotacao, double quantidade) {
		return (cotacao * quantidade * 6 / 100) + (cotacao * quantidade);
	}
	
}
