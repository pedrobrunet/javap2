package aula07;

import java.util.Scanner;
import model.Professor;
import model.Aluno;
import model.Cargo; // Importante: importar o Enum
import java.util.Locale;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        // --- TESTE COM PROFESSOR (Usa Enum e Interface) ---
        Professor p = new Professor();

        System.out.println("Digite o nome do professor:");
        p.setNome(sc.nextLine());

        System.out.println("Digite a especialidade:");
        p.setEspecialidade(sc.nextLine());

        // USANDO O ENUM: Vamos definir o cargo como PROFESSOR por padrão aqui
        p.setCargo(Cargo.PROFESSOR);

        System.out.println("Digite o salário bruto:");
        p.setSalario(sc.nextDouble());
        sc.nextLine(); // Limpa o buffer

        System.out.println("\n--- Dados do Professor ---");
        // O toString de Professor já deve mostrar o Cargo
        System.out.println(p);

        // USANDO A INTERFACE: Chamando o metodo obrigatório da Remuneravel
        System.out.printf("Salário Líquido (com descontos): R$ %.2f%n", p.getSalarioLiquido());
        p.quemSouEu();

        System.out.println("\n---------------------------");

        // --- TESTE COM ALUNO ---
        Aluno a = new Aluno();
        System.out.println("Digite o nome do aluno:");
        a.setNome(sc.nextLine());

        System.out.println("\n--- Dados do Aluno ---");
        a.quemSouEu();

        sc.close();
    }
}