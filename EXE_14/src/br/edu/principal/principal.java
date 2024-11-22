package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor_inicial, juros = 0 ;
		double total, valor_juros, num_parc = 1, i, valor_parc;
		
		 System.out.println("Digite o valor_inicial da dívida");
		 valor_inicial = sc.nextInt();
		 total = valor_inicial;
		 valor_parc = valor_inicial;
		 System.out.println(total);
		 System.out.println(juros);
		 System.out.println(num_parc);
		 System.out.println(valor_parc);
		 juros = juros + 10;
		 num_parc = num_parc + 2;
		 for(i = 1; i <= 4; i++) {
			 valor_juros = valor_inicial * juros / 100;
			 total = valor_inicial + valor_juros;
			 valor_parc = total / num_parc;
			 System.out.println(total);
			 System.out.println(valor_juros);
			 System.out.println(num_parc);
			 System.out.println(valor_parc);
			 juros = juros + 5;
			 num_parc = num_parc + 3;
		 }
	}

}
