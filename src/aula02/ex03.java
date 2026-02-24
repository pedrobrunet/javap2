package aula02;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String r = "S";
        double soma = 0;
        int contador = 0;

        System.out.println("Bem-vindo ao calculador de média do aluno!");

        while (r.equalsIgnoreCase("S")) {
            System.out.print("Insira uma nota do aluno: ");
            double nota = sc.nextDouble();

            soma += nota;
            contador++;

            System.out.print("Deseja inserir outra nota? (Digite 'S' para Sim ou 'N' para Não): ");
            r = sc.next();
        }

        // Verifica se ao menos uma nota foi inserida para não dividir por zero
        if (contador > 0) {
            double media = soma / contador;
            System.out.printf("\nMédia das notas: %.2f\n", media);
        }

        System.out.println("Obrigado por usar o programa!");
        sc.close();
    }
}