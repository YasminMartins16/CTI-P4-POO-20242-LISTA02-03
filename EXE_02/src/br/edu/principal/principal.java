package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, e, fat;
		
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		e = 1;
		
		for(int i = 1; i <= n; i++) {
			fat = 1;
			
			for(int j = 1; j <= i; j++) {
				fat *= j;
			}
			e += 1 / fat;	
			
		}
		System.out.print(e);

	}

}
