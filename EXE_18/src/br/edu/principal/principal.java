package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, quad, cubo, raiz;
		
        System.out.print("Digite um número: ");
        num = sc.nextDouble();
        
        while (num > 0) {
        	quad = num * num;
        	cubo = num * num * num;
        	raiz = Math.sqrt(num); 
        	 System.out.printf("Quadrado: " + quad + ", Cubo:" + cubo + ", Raiz quadrada:" + raiz); 
        	 System.out.print("Digite outro número (digite um número menor ou igual a 0 para sair): ");
        	 num = sc.nextDouble();
        }
      
	}

}
