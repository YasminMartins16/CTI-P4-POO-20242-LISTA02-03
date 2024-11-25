package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, num, fat;
		
		System.out.println("Digite um número: ");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
		}
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			fat = 1;
			
			for(int j = 1; j <= num; j++) {
				fat = fat * j;
			}
			System.out.print(fat);	
	}

}
