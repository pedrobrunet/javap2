package aula04;

import Classes.Funcionario2;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario2 f = new Funcionario2();

        System.out.println("--- Calculadora de Salário Horista ---");

        System.out.println("Digite seu Nome Completo:");
        f.setNome(sc.nextLine());

        System.out.println("Quanto você ganha por hora (R$):");
        f.setValorHora(sc.nextDouble());

        System.out.println("Digite quantas horas você trabalhou:");
        f.setHorasTrabalhadas(sc.nextInt());

        // Processamento
        f.calculoSalario();

        System.out.println("\n-----------------------------");
        System.out.println("--------- RESULTADO ---------");
        System.out.println("Funcionário: " + f.getNome());
        System.out.println("Total a receber: R$ " + f.getSalario());
        System.out.println("-----------------------------");

        sc.close(); // Boa prática fechar o scanner
    }
}