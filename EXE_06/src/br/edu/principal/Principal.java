package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont, codigo, nht, valor, sal_min, sal_inic=0,
		aux, sal_final;
		
		sal_min = 450;
		for(cont = 1; cont <= 10; cont++ ) {
			System.out.println("Digite o código: ");
    		codigo = sc.nextInt();
    		
    		System.out.println("Digite o número de horas trabalhdas: ");
    		nht = sc.nextInt();
    		
    		System.out.println("Digite a inicial do seu turno: ");
    		char turno = sc.next().toUpperCase().charAt(0);
    		
    		System.out.println("Digite sua categoria: ");
    		char categoria = sc.next().toUpperCase().charAt(0);
    		
    		
            while(turno != 'M' && turno != 'V' && turno != 'N') {
            	 System.out.println("Turno inválido! Digite novamente (M, V ou N):");
                 turno = sc.next().toUpperCase().charAt(0);
    		}
            while (categoria != 'G' && categoria != 'O') {
                System.out.println("Categoria inválida! Digite novamente (G ou O):");
                categoria = sc.next().toUpperCase().charAt(0);
            }
            if (categoria == 'G') {
                if (turno == 'N') {
                    valor = sal_min * 18/100;
                } else {
                    valor = sal_min * 15/100;
                }
            } else {
                if (turno == 'N') {
                    valor = sal_min * 13/100;
                } else {
                    valor = sal_min * 10/100;
                }
             sal_final = nht * valor;
             if(sal_inic <= 300) {
            	 aux = sal_inic * 20/100;
            	 
             }else if( sal_inic < 600) {
            	 aux = sal_inic * 15/100;
             	}else {
             		aux = sal_inic * 5/100;
             	}
             sal_final = sal_inic + aux;
             
             System.out.println("Código: " + codigo);
             System.out.println("Número de horas trabalhdas: " + nht);
             System.out.println("Valor por hora: " + valor);
             System.out.println("Salário Inicial: " + sal_inic);
             System.out.println("Auxílio: " + aux);
             System.out.println("Salário Final: " + sal_final);
            }
		}
	}
}
    