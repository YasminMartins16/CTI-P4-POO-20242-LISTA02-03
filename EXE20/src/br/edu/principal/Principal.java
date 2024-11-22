package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int cod_prod, cod_pais;
	      double peso_quilos, peso_gramas, pre_total, imposto = 0, valor_total, pre_grama = 0;
	      Scanner scanner = new Scanner(System.in);
	      
	      System.out.print("Digite o código do produto (1-10): ");
	      cod_prod = scanner.nextInt();

	      System.out.print("Digite o peso em quilos: ");
	      peso_quilos = scanner.nextDouble();

	      System.out.print("Digite o código do país (1-3): ");
	      cod_pais = scanner.nextInt();

	      peso_gramas = peso_quilos * 1000;
	      System.out.printf("Peso em gramas: %.2f%n", peso_gramas);

	      if (cod_prod >= 1 && cod_prod <= 4) {
	           pre_grama = 10;
	      } else if (cod_prod >= 5 && cod_prod <= 7) {
	           pre_grama = 25;
	      } else if (cod_prod >= 8 && cod_prod <= 10) {
	           pre_grama = 35;
	      } else {
	           System.out.println("Código do produto inválido.");
	           System.exit(1);
	       }
	      
	        pre_total = peso_gramas * pre_grama;
	        System.out.printf("Preço total: %.2f%n", pre_total);
	        
	        if (cod_pais == 1) {
	            imposto = 0;
	        } else if (cod_pais == 2) {
	            imposto = pre_total * 0.15;
	        } else if (cod_pais == 3) {
	            imposto = pre_total * 0.25;
	        } else {
	            System.out.println("Código do país inválido.");
	            System.exit(1);
	        }

	        System.out.printf("Imposto: %.2f%n", imposto);
	        valor_total = pre_total + imposto;
	        System.out.printf("Valor total: %.2f%n", valor_total);

	    }
}
