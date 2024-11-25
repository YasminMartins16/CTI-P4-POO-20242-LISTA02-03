package br.edu.principal;

import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double angulo;
		int voltas;
		
		System.out.println("Digite o ângulo: ");
		angulo = sc.nextInt();
		
		if (angulo > 360 || angulo < -360) {
			voltas = (int)(angulo / 360);
			angulo = angulo % 360;
		} else {
			voltas = 0;
		}
		
		if (angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360 || angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360) {
			System.out.println("Está em cima de algum dos eixos");
		}
		if ((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) {
			System.out.println("1º Quadrante");
		} else if ((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
			System.out.println("2º Quadrante");
		} else if ((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
			System.out.println("3º Quadrante");
		} else if ((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -90)) {
			System.out.println("4º Quadrante");
		}
		
		System.out.println("Volta(s) no sentido: " + voltas);
		
		if (angulo < 0) {
			System.out.println("horário");
		} else {
			System.out.println("anti-horário");
		}

	}

}
