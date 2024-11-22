package br.edu.principal;

import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota_trab, aval_sem, exame, media;
		
		System.out.println("Digite a nota do trabalho de laborátorio: ");
		nota_trab = sc.nextDouble();
		System.out.println("Digite a nota da avaliação: ");
		aval_sem = sc.nextDouble();
		System.out.println("Digite a nota do exame final: ");
		exame = sc.nextDouble();
		media = (nota_trab * 2 + aval_sem * 3 + exame * 5) / 10;
		
		System.out.println("Média Ponderada: " +media);
		
		if (media >= 8 && media <= 10) {
            System.out.println("Obteve conceito A");
        } else if (media >= 7 && media < 8) {
            System.out.println("Obteve conceito B");
        } else if (media >= 6 && media < 7) {
            System.out.println("Obteve conceito C");
        } else if (media >= 5 && media < 6) {
            System.out.println("Obteve conceito D");
        } else if (media >= 0 && media < 5) {
            System.out.println("Obteve conceito E");
        }
	}

}
