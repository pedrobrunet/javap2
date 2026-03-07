package aula03;
import Classes.Calculadora;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-------- CALCULADORA ---------");
        System.out.println("insira seu nome");
        String nome = sc.nextLine();


        System.out.println("Seja Bem vindo a sua Calculadora " + nome);
        System.out.println("Escolha o numero para: 1- Somar | 2- Subtrair | 3- Mutiplicar | 4- Dividir");
        int escolha = sc.nextInt();
        System.out.println("Digite o primeiro número:");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = sc.nextDouble();

        Calculadora calc = new Calculadora(num1, num2);

        switch (escolha) {
            case 1:
                System.out.println("Resultado da Soma: " + calc.somar());
                break;
            case 2:
                System.out.println("Resultado da Subtração: " + calc.subtrair());
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + calc.mutiplicar());
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado da Divisão: " + calc.dividir());
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Opção inválida!");
        }







    }
}
