package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculator;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cotação dólar?");
		double cotacao = sc.nextDouble();
		System.out.println("Quantidade de dólares?");
		double quantidade = sc.nextDouble();
		
		System.out.printf("Valor final: %.2f", Calculator.valorASerPago(cotacao, quantidade));
		sc.close();
		
	}

}
