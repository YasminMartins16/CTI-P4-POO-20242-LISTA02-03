package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade, tot_f = 0, tot_m = 0, soma1 = 0, cont_m1 = 0, cont_m2 = 0, tot = 0,
		cont_f1 = 0, media_idade, menor_idade = 0;
		double perc;
		String sexo, exp;
		System.out.print("Digite a idade do funcionário: ");
        idade = sc.nextInt();
        
        while (idade != 0) {
        	System.out.print("Digite o sexo do funcionário(M ou F): ");
        	 sexo = sc.next();
        	System.out.print("Digite se o funcionário possui experiencia (S ou N): ");
        	 exp = sc.next();
        	 if (sexo.equals("F") && exp.equals("S")) {
                 if (tot == 0 || idade < menor_idade) {
                     menor_idade = idade;
                     tot = 1;
                     }
                } 
        	 if (sexo.equals("M")) {
                     tot_m++;
                 } else if (sexo.equals("F")) {
                     tot_f++;
                 }
        	 if (sexo.equals("F") && idade < 21 && exp.equals("S")) {
                 cont_f1++;
             }
        	 if (sexo.equals("M") && idade > 45) {
                 cont_m1++;
             }
        	 if (sexo.equals("M") && exp.equals("S")) {
                 soma1 += idade;
                 cont_m2++;
             }
        	 System.out.print("Digite a idade (ou 0 para encerrar): ");
             idade = sc.nextInt();
        }
        System.out.println("Total de mulheres: " + tot_f);
        System.out.println("Total de homens: " + tot_m);

        if (cont_m2 == 0) {
            System.out.println("Nenhum homem com experiência.");
        } else {
            double mediaIdade = (double) soma1 / cont_m2;
            System.out.printf("Média de idade dos homens com experiência: %.2f%n", mediaIdade);
        }

        if (tot_m == 0) {
            System.out.println("Nenhum homem.");
        } else {
            perc = (double) cont_m1 * 100 / tot_m;
            System.out.printf("Porcentagem de homens com mais de 45 anos: %.2f%%%n", perc);
        }

        System.out.println("Mulheres com menos de 21 anos e experiência: " + cont_f1);
        if (tot == 0) {
            System.out.println("Nenhuma mulher com experiência registrada.");
        } else {
            System.out.println("Menor idade entre mulheres com experiência: " + menor_idade);
        } 
	}
}
