package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod, num_h, sal_b, sal_l=0, media_m =0, media_f=0,
		cont_m, cont_f=0;
		String sexo;
		
		System.out.print("Digite o código: ");
        cod = sc.nextInt();
        cont_m = 0;
        cont_m = 0;
        
        while(cod != 99999) {
        	System.out.print("Digite o sexo: ");
            sexo = sc.next();
            System.out.print("Digite o número de horas: ");
            num_h = sc.nextInt();
            sal_b = num_h * 30;
            
            if(sexo == "M") {
            	sal_l = sal_b - (sal_b * 10/100);
            	media_m = media_m + sal_l;
            	cont_m = cont_m + 1;
            }
            if(sexo == "F") {
            	sal_l = sal_b -(sal_b * 5/100);
            	media_f = media_f + sal_l;
            	cont_f = cont_f + 1;
            }
    		System.out.print(cod);
    		System.out.print(sal_b);
    		System.out.print(sal_l);
    		System.out.print("Digite o código: ");
            cod = sc.nextInt();
            
            if(cont_m == 0) {
            	System.out.print("Nenhum professor do sexo mascuilno: ");
            }else {
            	media_m = media_m / cont_m;
            	System.out.print(media_m);
            }
            if(cont_f == 0) {
            	System.out.print("Nenhum professor do sexo feminino: ");

            }else {
            	media_f = media_f / cont_f;
            	System.out.print(media_f);
            }


        }
	}

}
