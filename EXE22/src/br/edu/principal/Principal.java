package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal_base, sal_liq, imposto;
		int grat, tempo;
		
		System.out.println("Digite o salário base: ");
		sal_base = sc.nextDouble();
		System.out.println("Digite o tempo serviço: ");
		tempo = sc.nextInt();
		
		if (sal_base < 200) {
			imposto = 0;
		} else if (sal_base <= 450) {
			imposto = 3 / 100 * sal_base;
		} else if(sal_base < 700) {
			imposto = 8 / 100 * sal_base;
		} else {
			imposto = 12 / 100 * sal_base;
		}
		System.out.println("Imposto: " + imposto);
		
		if (sal_base > 500) {
			if (tempo <= 3) {
				grat = 20;
			} else {
				grat = 30;
			}
		} else {
			if (tempo <= 3) {
				grat = 23;
			} else if (tempo < 6) {
				grat = 35;
			} else {
				grat = 33;
			}
		}
		System.out.println("Gratificação: " + grat);
		sal_liq = sal_base - imposto + grat;
		System.out.println("Salário Liquído: " + sal_liq);
		
		if (sal_liq <= 350) {
			System.out.println("Classificação A");
		} else if (sal_liq < 600) {
			System.out.println("Classificação B");
		} else {
			System.out.println("Classificação C");
		}
		
	}

}
