package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, num_cri, meses,
		tot_f, tot_m, tot_24;
		double porc_m, porc_f, porc_24 ;
		String sexo;
		
		System.out.println("Digite o número de crianças nascidas no período: ");
		num_cri = sc.nextInt();
		
		tot_m = 0;
		tot_f = 0;
		tot_24 = 0;
		for(i = 1; i <= num_cri; i++) {
			System.out.println("Digite o sexo da criança: ");
			sexo = sc.next();
			System.out.println("Digite o tempo de vida da criança: ");
			meses = sc.nextInt();
			
			if(sexo.equalsIgnoreCase("M")) {
				tot_m = tot_m +1;
				
			}
			if(sexo.equalsIgnoreCase("F")) {
				tot_f = tot_f +1;
			}
			if(meses <= 24) {
				tot_24 = tot_24 + 1;
			}
		}
		if(num_cri == 0) {
			System.out.println("NENHUMA CRIANÇA DIGITADA");
		}else {
			porc_m = tot_m * 100.0 / num_cri;
			porc_f = tot_f * 100.0 / num_cri;
			porc_24 = tot_24 * 100.0 / num_cri;
			System.out.println("Percentual de crianças do sexo feminino mortas" +porc_f);
			System.out.println("Percentual de crianças do sexo masculino mortas" +porc_m);
			System.out.println("Percentual de crianças com 24 meses mortas no período" +porc_24);
		}
		
	}

}
