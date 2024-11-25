package br.edu.principal;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double i, preco = 0, custo_est = 0, imp, preco_final, adicional, maior_p = 0, menor_p = 0, tot_imp = 0, qtd_b = 0, qtd_n = 0, qtd_c = 0;
        String refri = null, categ = null;
        
        adicional = 0;

      
        for (i = 1; i <= 12; i++) {
            System.out.println("Digite o preço: ");
            preco = sc.nextDouble();
            System.out.println("Digite o tipo de refrigerante (S ou N): ");
            refri = sc.next();
            System.out.println("Digite a categoria (A, L, V): ");
            categ = sc.next();

            
            if (preco <= 20) {
                if (categ.equalsIgnoreCase("A")) {
                    custo_est = 2;    
                } else if (categ.equalsIgnoreCase("L")) {
                    custo_est = 3;                    
                } else if (categ.equalsIgnoreCase("V")) {
                    custo_est = 4;
                }                
            }
            if (preco > 20 && preco <= 50) {
                if (refri.equalsIgnoreCase("S")) {
                    custo_est = 6;                    
                }
            } else {
                custo_est = 0;    
            }
            if (preco > 50) {
                if (refri.equalsIgnoreCase("S")) {
                    if (categ.equalsIgnoreCase("A")) {
                        custo_est = 5;
                    } else if (categ.equalsIgnoreCase("L")) {
                        custo_est = 2;                        
                    } else if (categ.equalsIgnoreCase("V")) {
                        custo_est = 4;
                    }
                }                
            } else {
                if (categ.equalsIgnoreCase("A") || categ.equalsIgnoreCase("V")) {
                    custo_est = 0;
                } else if (categ.equalsIgnoreCase("L")) {
                    custo_est = 1;                    
                }
            }

          
            if (!categ.equalsIgnoreCase("A") && !refri.equalsIgnoreCase("S")) {
                imp = preco * 2 / 100;
            } else {
                imp = preco * 4 / 100;            
            }

            
            preco_final = preco + custo_est + imp;

        
            System.out.println("Custo Estimado: " + custo_est);
            System.out.println("Imposto: " + imp);
            System.out.println("Preço Final: " + preco_final);

       
            if (preco_final <= 20) {
                qtd_b += 1;            
            }
            if (preco_final > 20 && preco_final <= 100) {
                qtd_n += 1;
                System.out.println("Classificação Normal");
            }
            if (preco_final > 100) {
                qtd_c += 1;
                System.out.println("Classificação Caro");
            }

         
            adicional += custo_est + imp;
            tot_imp += imp;

        
            if (i == 1) {
                maior_p = preco_final;
                menor_p = preco_final;
            } else {
                if (preco_final > maior_p) {
                    maior_p = preco_final;
                }
                if (preco_final < menor_p) {
                    menor_p = preco_final;
                }
            }
        }

        adicional = adicional / 12;

      
        System.out.println("Média de Adicional: " + adicional);
        System.out.println("Maior Preço: " + maior_p);
        System.out.println("Menor Preço: " + menor_p);
        System.out.println("Total de Impostos: " + tot_imp);
        System.out.println("Quantidade de Produtos Baratos: " + qtd_b);
        System.out.println("Quantidade de Produtos Normais: " + qtd_n);
        System.out.println("Quantidade de Produtos Caros: " + qtd_c);
    }
}
