package aula03;

import java.util.Scanner;
import model.Aluno;
import java.util.Locale;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Ao inserir a Nota sempre usa ponto - ex: 9.8, 8.3, 9.5");

        System.out.println("Nota 1 ");
        double n1 = sc.nextDouble();

        System.out.println("Nota 2 ");
        double n2 = sc.nextDouble();

        System.out.println("Nota 3 ");
        double n3 = sc.nextDouble();

        // Criando o aluno com a nova estrutura (Nome, Matricula, Nota1, Nota2, Nota3)
        Aluno a1 = new Aluno(nome, 0, n1, n2, n3);

        System.out.println("\nBoletim:");
        System.out.println("------------------");
        System.out.println("Nome do aluno: " + a1.getNome());
        System.out.printf("Média Final: %.2f %n", a1.calcularMedia());
        System.out.println("Situação: " + a1.calcularAprovacao());

        sc.close();
    } // Fecha o método main
} // Fecha a classe ex02