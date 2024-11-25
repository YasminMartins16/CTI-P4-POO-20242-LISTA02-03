package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, num, qtd;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		qtd = 0;
		for(i = 1; i <= num; i++) {
			if (num % i == 0) {
				qtd = qtd + 1;
			}
		
		}
		if(qtd > 2) {
			System.out.println("Número não Primo");
		}
		else {
			System.out.println("Número Primo");
		}
	}

}
