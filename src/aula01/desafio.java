package aula01;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do salário: R$ ");
        double salario = leitor.nextDouble();
        double percentual = 0;
        System.out.println("Seu salário é de " + salario);
        leitor.close();


        if (salario <= 900 ) {
            System.out.println("Situação: Isento");
            percentual = 0;
        }
        else if (salario <= 1500) {
            System.out.println("Situação: Desconto de 5%");
            percentual = 5;
        }
        else if (salario <= 2500) {
            System.out.println("Situação: Desconto de 10%");
            percentual = 10;
        }
        else {
            System.out.println("Situação: Desconto de 20%");
            percentual = 20;
        }

        double calculo = salario *(percentual/100);
        double salarioLiquido = salario - calculo;
        System.out.println("Valor descontado " + calculo);
        System.out.println("Valor liquido " + salarioLiquido);




    }
}
