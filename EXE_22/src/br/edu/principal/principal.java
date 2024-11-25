package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sal, qtd, tipo, valor_kw, gasto, acresc, total,
				tot_geral, qtd_cons;
		tot_geral = 0;
		qtd_cons = 0;
		
		System.out.print("Digite o salário: ");
        sal = sc.nextInt();
        System.out.print("Digite a quatidade de KW condumida: ");
        qtd = sc.nextInt();
        
        valor_kw = sal/8;
        
        while(qtd != 0 ) {
        	gasto = qtd * valor_kw;
        	
        	System.out.print("Digite o tipo de consumidor 1,2 ou 3: ");
            tipo = sc.nextInt();
            
            if (tipo == 1) {
                acresc = gasto * 5 / 100;
            } else if (tipo == 2) {
                acresc = gasto * 10 / 100;
            } else if (tipo == 3) {
                acresc = gasto * 15 / 100;
            } else {
                System.out.println("Tipo de consumidor inválido. Sem acréscimos.");
                acresc = 0;
            }

           
            total = gasto + acresc;
            tot_geral += total;

            if (total >= 500 && total <= 1000) {
                qtd_cons++;
            }

            System.out.println("Gasto: " + gasto);
            System.out.println("Acréscimo: " + acresc);
            System.out.println("Total: " + total);

            System.out.print("Digite a quantidade de KW consumida (ou 0 para encerrar): ");
            qtd = sc.nextInt();
        }

        
        System.out.println("Total geral: " + tot_geral);
        System.out.println("Quantidade de consumidores com gasto entre 500 e 1000: " + qtd_cons);

	 }
	}

