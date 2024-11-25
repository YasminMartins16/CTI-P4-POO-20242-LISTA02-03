package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int preço, imp, transp, seguro, finale, total_imp=0, origem;
		String meio_t, carga_total;
		
		System.out.print("Digite o preço do produto (ou um valor menor ou igual a 0 para encerrar): ");
        preço = sc.nextInt();

        while (preço > 0) {
            System.out.print("Digite a origem do produto (1, 2 ou 3): ");
            origem = sc.nextInt();

            System.out.print("Digite o meio de transporte : ");
            meio_t = sc.next(); 

            System.out.print("O produto é de carga perigosa? (S para sim, N para não): ");
            carga_total = sc.next();

            if (preço <= 100) {
                imp = preço * 5 / 100;
            } else {
                imp = preço * 10 / 100;
            }

            if (carga_total.equalsIgnoreCase("S")) { 
                if (origem == 1) {
                    transp = 50;
                } else if (origem == 2) {
                    transp = 21;
                } else if (origem == 3) {
                    transp = 24;
                } else {
                    transp = 0;
                }
            } else { 
                if (origem == 1) {
                    transp = 12;
                } else if (origem == 2) {
                    transp = 21;
                } else if (origem == 3) {
                    transp = 60;
                } else {
                    transp = 0;
                }
            }
            finale = preço + imp + transp;

            total_imp += imp;

            System.out.println("Imposto: " + imp);
            System.out.println("Custo de transporte: " + transp);
            System.out.println("Preço final: " + finale);

            System.out.print("\nDigite o próximo preço do produto (ou um valor menor ou igual a 0 para encerrar): ");
            preço = sc.nextInt();
        }
        System.out.println("Total de impostos acumulados: " + total_imp);

	}
	}
