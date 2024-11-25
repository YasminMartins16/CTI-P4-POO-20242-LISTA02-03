package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fim, i, j, x, expoente, num_termos,
		den = 0, denominador, fat = 0, s;
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		System.out.println("Digite um número: ");
		num_termos = sc.nextInt();
		
		s = 0;
		denominador = 1;
		for(i = 1; i <= num_termos; i ++ ) {
			fim = denominador;
			fat = 1;
			for(j = 1; j <= fim; j++) {
				fat = fat * j;
			}
		}
		expoente = i + 1;
		if(expoente % 2 == 0) {
			s -= Math.pow(x, expoente) / fat;
		} else if (denominador == 4) {
			den = 1;
		}

        if (den == 1) {
            denominador++;
        } else {
            denominador--;
        }
        System.out.println("Resultado de s: " + s);
	}

}
