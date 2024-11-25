package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		Double area, base, altura;
		
		System.out.println("Base: ");
		base = ia.nextDouble();
		System.out.println("Altura: ");
		altura = ia.nextDouble();
		
		area = (base * altura)/2;
		
		System.out.println("Resultado: " + area);
		
	
	}

}
