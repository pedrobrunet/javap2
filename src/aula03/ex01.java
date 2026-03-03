package aula03;
import Classes.Funcionario;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         Classes.Funcionario f1 = new Funcionario();
        System.out.println("BEM VINDO A FOLHA SALARIAL");

        System.out.println("Digite seu nome");
        f1.nome = sc.nextLine();
        System.out.println(f1.nome);

        System.out.println("Insira sua matricula");
        f1.matricula = sc.nextInt();
        System.out.println(f1.matricula);

        System.out.println("Informe seu salario Bruto");
        f1.salario = sc.nextDouble();
        System.out.println(f1.salario);

        System.out.println(f1.nome + "Aqui está a folha com seus descontos");
        System.out.println("FOLHA COM DESCONTOS");
        System.out.println("----------------------------");
        System.out.println("Matricula: "+ f1.matricula);
        System.out.println("Nome: " + f1.nome);
        System.out.println("Salario bruto: "+ f1.salario);
        System.out.println("Desconto total de : "+ f1.calcularDesconto());
        System.out.println("Salario Liquido a receber: "+ f1.salarioLiquido());


    }
}
