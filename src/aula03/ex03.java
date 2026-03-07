package aula03;

import java.util.Scanner;
import java.util.Locale;
import Classes.Calculadora;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Insira seu nome:");
        String nome = sc.nextLine();
        System.out.println("Seja bem-vindo à sua Calculadora, " + nome + "!");

        int opcao; // variavel pra armazenar valor dado do teclado no DO

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1- Somar | 2- Subtrair | 3- Multiplicar | 4- Dividir | 0- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double n1 = sc.nextDouble();
                System.out.print("Digite o segundo número: ");
                double n2 = sc.nextDouble();

                // Criando o objeto com os números lidos
                Calculadora calc = new Calculadora(n1, n2);

                switch (opcao) {
                    case 1 -> System.out.println("Resultado da Soma: " + calc.somar());
                    case 2 -> System.out.println("Resultado da Subtração: " + calc.subtrair());
                    case 3 -> System.out.println("Resultado da Multiplicação: " + calc.mutiplicar());
                    case 4 -> {
                        if (n2 != 0) {
                            System.out.println("Resultado da Divisão: " + calc.dividir());
                        } else {
                            System.out.println("Erro: Não é possível dividir por zero!");
                        }
                    }
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0); // Continua rodando até o usuário digitar 0

        System.out.println("Programa encerrado. Até mais, " + nome + "!");
        sc.close();
    }
}