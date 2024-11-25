package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Número 1: ");
		num1 = ia.nextInt();
		System.out.println("Número 2: ");
		num2 = ia.nextInt();
		Double r1 = Math.pow(num1, num2);
		Double r2 = Math.pow(num2, num1);
		
		System.out.println("Resultado 1: " + r1);
		System.out.println("Resultado 2: " + r2);
		
	
	}

}
