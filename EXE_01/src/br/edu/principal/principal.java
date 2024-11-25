package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano_atual;
		double salario, novo_sal, percentual;
		
		System.out.println("Digite o ano atual: ");
		ano_atual = sc.nextInt();
		
		salario = 1000;
		
		percentual = 1.5/100;
		
		novo_sal = salario + percentual * salario;
		
		for(int i = 2007; i <= ano_atual; i++) {
			percentual = 2 * percentual;
			novo_sal = novo_sal + percentual * novo_sal;
			
		}
		System.out.println("O novo salario é: " + novo_sal);
	}

}
