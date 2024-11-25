package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base=0, alt, area;	
		
		do {System.out.println("Digite um número maior que 0: ");
		base = sc.nextInt();
			} while(base <= 0);
		
		do {System.out.println("Digite um número maior que 0: ");
		alt = sc.nextInt();
			}while(alt <= 0);
		    area = base * alt /2;
		    System.out.println(area);
	}

}
