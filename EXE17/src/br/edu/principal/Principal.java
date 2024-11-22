package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, delta, x1, x2;
		
		System.out.println("Digite um valor para a: ");
		a = sc.nextDouble();
		System.out.println("Digite um valor para b: ");
		b = sc.nextDouble();
		System.out.println("Digite um valor para c: ");
		c = sc.nextDouble();
		
		if (a == 0) {
			System.out.println("Estes valores não formam uma equação de segundo grau!");
		} else {
			delta = (b * b) - (4 * a * c);
			
			if (delta < 0) {
				System.out.println("Não existe raiz real");
			} else if (delta == 0) {
				System.out.println("Existe uma raiz real");
				x1 = (-b) / (2 * a);
				System.out.println("O valor de x1 é: " + x1);
			} else if (delta > 0) {
				System.out.println("Existem duas raízes reais");
				x1 = (- b + Math.sqrt(delta) / (2 * a));
				x2 = (- b - Math.sqrt(delta) / (2 * a));
				System.out.println("O valor de x1 é: " + x1);
				System.out.println("O valor de x2 é: " + x2);
			}
		}

	}

}
