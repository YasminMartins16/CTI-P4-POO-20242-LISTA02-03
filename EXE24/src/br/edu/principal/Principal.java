package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		Double hora, h, m, conversao1, conversao2, conversao3;
		System.out.println("Qual o horário? (Ex: 1.38)");
		hora = ia.nextDouble();
		System.out.println("Agora fale só as horas? (Ex: 1)");
		h = ia.nextDouble();
		m = hora - h;
		conversao1 = h * 60;
		conversao2 = m * 100;
		conversao3 = conversao1 + conversao2;
		System.out.println("São, a conversâo, em minutos é: " + conversao3);
				

	}

}
