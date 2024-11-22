package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int idade, tot_f = 0, tot_m = 0, soma1 = 0, cont_m1 = 0, cont_m2 = 0, tot = 0, cont_f1 = 0;
        double media_idade, perc;
        int menor_idade = 0 ;
        String sexo, exp;

        System.out.println("Digite a idade (0 para terminar):");
        idade = sc.nextInt();

        while (idade != 0) {
            sc.nextLine();
            System.out.println("Digite o sexo (F para feminino, M para masculino):");
            sexo = sc.nextLine().toUpperCase();

            System.out.println("Tem experiência? (S para sim, N para não):");
            exp = sc.nextLine().toUpperCase();

            if (sexo.equals("F") && exp.equals("S")) {
                if (tot == 0) {
                    menor_idade = idade;
                    tot = 1;
                } else if (idade < menor_idade) {
                    menor_idade = idade;
                }
            }

            if (sexo.equals("M")) {
                tot_m++;
                if (idade > 45) {
                    cont_m1++;
                }
                if (exp.equals("S")) {
                    soma1 += idade;
                    cont_m2++;
                }
            }

            if (sexo.equals("F")) {
                tot_f++;
                if (idade < 21 && exp.equals("S")) {
                    cont_f1++;
                }
            }

            System.out.println("Digite a próxima idade (0 para terminar):");
            idade = sc.nextInt();
        }

        System.out.println("Total de mulheres: " + tot_f);
        System.out.println("Total de homens: " + tot_m);

        if (cont_m2 == 0) {
            System.out.println("Nenhum homem com experiência.");
        } else {
            media_idade = (double) soma1 / cont_m2;
            System.out.printf("Média de idade dos homens com experiência: " + media_idade);
        }

        if (tot_m == 0) {
            System.out.println("Nenhum homem.");
        } else {
            perc = (double) cont_m1 * 100 / tot_m;
            System.out.printf("Porcentagem de homens com mais de 45 anos: "+ perc);
        }

        System.out.println("Mulheres com menos de 21 anos e com experiência: " + cont_f1);
        if (tot > 0) {
            System.out.println("Menor idade entre mulheres com experiência: " + menor_idade);
        } else {
            System.out.println("Nenhuma mulher com experiência foi registrada.");
        }

        sc.close();
    }
}


