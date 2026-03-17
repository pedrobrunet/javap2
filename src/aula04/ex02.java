package aula04;
import Classes.Pessoa2;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa2 p = new Pessoa2();

        System.out.println("--- CALCULADORA IMC ---");
        System.out.println("Digite seu peso: ");
        p.setPeso(sc.nextDouble());

        System.out.println("Digite sua altura: ");
        p.setAltura(sc.nextDouble());

        System.out.println("-- RESULTADO IMC --");
        System.out.println("Seu Indice de Massa Corporal : " + p.calculoImc());


    }
}
