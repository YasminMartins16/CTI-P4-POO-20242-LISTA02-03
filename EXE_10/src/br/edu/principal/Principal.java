package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont_time, cont_jog, idade, qtde = 0, tot80 = 0;
        double peso, altura, media_idade, media_altura = 0, porc;
		 for (cont_time = 1; cont_time <= 5; cont_time++) {
	            media_idade = 0;
	            for (cont_jog = 1; cont_jog <= 11; cont_jog++) {
	                System.out.println("Digite a idade, peso e altura do jogador " + cont_jog + " do time " + cont_time + ":");
	                idade = sc.nextInt();
	                peso = sc.nextInt();
	                altura = sc.nextInt();
	                if (idade < 18) {
	                    qtde++;
	                }
	                media_idade += idade;
	                media_altura += altura;
	                
	                if (peso > 80) {
	                    tot80++;
	                }
	            }
	            media_idade /= 11;
	            System.out.println("Média de idade do time " + cont_time + ": " + media_idade);
	      }
		 media_altura /= 55;
		 porc = (tot80 * 100.0) / 55;
		 System.out.println("Quantidade de jogadores com menos de 18 anos: " + qtde);
	     System.out.println("Média de altura dos jogadores: " + media_altura);
	     System.out.println("Porcentagem de jogadores com peso acima de 80kg: " + porc + "%");
	}
}
