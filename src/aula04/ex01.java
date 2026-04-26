package aula04;

import model.Funcionario;
import java.util.Scanner;
import java.util.Locale;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Garante que aceite ponto em valores decimais

        Funcionario f = new Funcionario();

        System.out.println("--- Calculadora de Salário Horista ---");

        System.out.println("Digite seu Nome Completo:");
        f.setNome(sc.nextLine());

        System.out.println("Quanto você ganha por hora (R$):");
        f.setValorHora(sc.nextDouble());

        System.out.println("Digite quantas horas você trabalhou:");
        f.setHorasTrabalhadas(sc.nextInt());

        // CORREÇÃO 1: O nome do método na classe unificada é calcularSalarioHorista()
        f.calcularSalarioHorista();

        System.out.println("\n-----------------------------");
        System.out.println("--------- RESULTADO ---------");
        System.out.println("Funcionário: " + f.getNome());

        // CORREÇÃO 2: O método para pegar o valor base é getSalarioBase()
        // Ou, se quiser o valor final com descontos, use getSalarioLiquido()
        System.out.printf("Total a receber (Bruto): R$ %.2f%n", f.getSalarioBase());
        System.out.printf("Total a receber (Líquido): R$ %.2f%n", f.getSalarioLiquido());
        System.out.println("-----------------------------");

        sc.close();
    }
}