package br.edu.principal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	double pre, venda, novo_pre;
    	
    	System.out.println("Digite o preço atual: ");
    	pre = sc.nextDouble();
    	System.out.println("Digite o valor das vendas: ");
    	venda = sc.nextDouble();
    	
    	if(venda < 500 || pre < 30) {
    		novo_pre = pre + 10/100 * pre;
    	} else if((venda >= 500 && venda < 1200) || (pre >= 30 && pre < 80)) {
    		novo_pre = pre + 15/100 * pre;
    	} else if (venda >= 1200 || pre >= 80) {
    		novo_pre = pre - 20/100 * pre;
    	}else {
    		novo_pre = pre;
    	}
    	
    	System.out.printf("O novo preço é: " + novo_pre);

    }

}

      
