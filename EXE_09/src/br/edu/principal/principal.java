package br.edu.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cont, n1, n2, media, ta=0, te=0, tr=0,
			media_classe, total_class;
		
		total_class = 0;
		for(cont = 1; cont <= 6; cont++) {
			System.out.println("Digite sua N1: ");
    		n1 = sc.nextInt();
    		System.out.println("Digite sua N2: ");
    		n2 = sc.nextInt();
    		
    		media = (n1 + n2)/2;
    		System.out.println("Média: " + media);
    		
    		if(media <= 3) {
    			tr = tr + 1;
    			System.out.println("REPROVADO");
    		}
    		if(media > 3 && media < 7) {
    			te = te + 1;
    			System.out.println("EXAME");
    		}
    		if(media >= 7) {
    			ta = ta + 1;
    			System.out.println("APROVADO");
    		}
    		total_class = total_class + media;
		}
		System.out.println(tr);
		System.out.println(te);
		System.out.println(ta);
		media_classe = total_class/6;
		System.out.println(media_classe);
	}

}
