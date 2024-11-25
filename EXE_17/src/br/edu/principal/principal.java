package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double sal_carlos, sal_joao;
        int meses = 0;

        System.out.print("Digite o salário de Carlos: ");
        sal_carlos = sc.nextDouble();

       
        sal_joao = sal_carlos / 3;

        
        while (sal_joao < sal_carlos) {
            sal_carlos += sal_carlos * 0.02; 
            sal_joao += sal_joao * 0.05;
            meses++;
        }

        
        System.out.println("Número de meses: " + meses);


	}

}
