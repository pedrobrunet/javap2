package aula03;

import Classes.Funcionario;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- BEM VINDO A FOLHA SALARIAL ---");

        // 2. Coleta os dados do usuário primeiro
       // variáveis locais (n, m, s) para guardar temporariamente os valores
        System.out.print("Digite seu nome: ");
        String n = sc.nextLine();

        System.out.print("Insira sua matricula: ");
        int m = sc.nextInt();

        System.out.print("Informe seu salario Bruto: ");
        double s = sc.nextDouble();

        // objeto usando o CONSTRUTOR
        // n,m,s na posição que passamos na classe
        Funcionario f1 = new Funcionario(n, m, s);

        // 4. Exibe os resultados acessando os métodos do objeto f1
        System.out.println("\n===============================");
        System.out.println("FOLHA COM DESCONTOS");
        System.out.println("-------------------------------");
        System.out.println("Matricula: " + f1.matricula);
        System.out.println("Nome: " + f1.nome);
        System.out.println("Salario bruto: " + f1.salario);
        System.out.println("Desconto total (15%): " + f1.calcularDesconto());
        System.out.println("Salario Liquido a receber: " + f1.salarioLiquido());

        sc.close();
    }
}