package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num_op, pecas_op, num_maior = 0, cont_m = 0, cont_f = 0;
        int tot_pecas = 0, cont;
        double media_m = 0, media_f = 0, salario_maior = 0, salario_op, tot_folha = 0;
        String sexo_op;
        for (cont = 1; cont <= 15; cont++) {
            System.out.println("Digite o número do " + cont + "º operário:");
            num_op = sc.nextInt();

            System.out.println("Digite o sexo do operário (M ou F):");
            sexo_op = sc.next();

            System.out.println("Digite o total de peças fabricadas pelo " + cont + "º operário:");
            pecas_op = sc.nextInt();
            
            if (pecas_op <= 30) {
                salario_op = 450;
            } else if (pecas_op <= 50) {
                salario_op = 450 + ((pecas_op - 30) * 3 / 100.0 * 450);
            } else {
                salario_op = 450 + ((pecas_op - 30) * 5 / 100.0 * 450);
            }
            System.out.println("O operário de número " + num_op + " recebe salário = " + salario_op);
            tot_folha += salario_op;
            tot_pecas += pecas_op;
            if (sexo_op.equalsIgnoreCase("M")) {
                media_m += pecas_op;
                cont_m++;
            } else if (sexo_op.equalsIgnoreCase("F")) {
                media_f += pecas_op;
                cont_f++;
            }
            if(cont == 1 || salario_op > salario_maior) {
            	salario_maior = salario_op;
            	num_maior = num_op;
            }

        }
        System.out.println("Total de folha de Pagamento" + tot_folha);
        System.out.println("Total de Peças fabricadas" + tot_pecas);
        
        if (cont_m == 0) {
            System.out.println("Nenhum homem");
        } else {
            media_m /= cont_m;
            System.out.println("Média de peças fabricadas por homens = " + media_m);
        }
        
        if (cont_f == 0) {
            System.out.println("NENHUMA MULHER");
        } else {
            media_f /= cont_f;
            System.out.println("Média de peças fabricadas por mulheres = " + media_f);
        }
        
        System.out.println("O número do operário com maior salário é " + num_maior);

	}

}
