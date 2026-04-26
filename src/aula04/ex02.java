package aula04;

import model.Aluno; // Importamos Aluno para usar os recursos de Pessoa
import java.util.Scanner;
import java.util.Locale;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Garante que aceite ponto (.) em vez de vírgula

        // CORREÇÃO: Trocamos Pessoa2 por Aluno (que herdou tudo de Pessoa)
        Aluno p = new Aluno();

        System.out.println("--- CALCULADORA IMC ---");

        System.out.println("Digite seu peso: ");
        p.setPeso(sc.nextDouble());

        System.out.println("Digite sua altura: ");
        p.setAltura(sc.nextDouble());

        System.out.println("-- RESULTADO IMC --");

        // CORREÇÃO: O método na nossa classe unificada chama-se calculoImc()
        // e ele já está disponível no objeto 'p' por herança.
        System.out.printf("Seu Índice de Massa Corporal: %.2f%n", p.calculoImc());

        sc.close();
    }
}