package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m, n, soma, i;
		
		System.out.print("Digite um número: ");
        m = sc.nextInt();
        System.out.print("Digite um número: ");
        n = sc.nextInt();
        
        while(m < n) {
        	soma = 0;
        	for( i = m; i <= n; i++) {
        		soma = soma + i;
        	}
        	 System.out.print("A soma é: "+ soma);
        	 
        	 System.out.print("Digite um número: ");
             m = sc.nextInt();
             System.out.print("Digite um número: ");
             n = sc.nextInt();
        }
	}

}
