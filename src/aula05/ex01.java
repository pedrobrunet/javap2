package aula05;

// IMPORTANTE: Mudamos de "Classes" para "model"
import model.Aluno;
import model.Disciplina;
import model.Professor;
import java.util.Scanner;
import java.util.Locale;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int opcao;
        Disciplina d = new Disciplina();

        do {
            System.out.println("\n===== SISTEMA ACADÊMICO =====");
            System.out.println("1 - Cadastrar Aluno");
            System.out.println("2 - Cadastrar Professor");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    Aluno a = new Aluno();

                    System.out.println("Digite o nome do aluno:");
                    a.setNome(sc.nextLine());

                    System.out.println("Digite a sua disciplina:");
                    d.setNomeDisciplina(sc.nextLine());

                    System.out.println("Digite a matricula:");
                    a.setMatricula(sc.nextInt());

                    System.out.println("--- Notas do Aluno ---");
                    System.out.print("Primeira nota: ");
                    a.setNota1(sc.nextDouble());

                    System.out.print("Segunda nota: ");
                    a.setNota2(sc.nextDouble());

                    System.out.print("Terceira nota: ");
                    a.setNota3(sc.nextDouble());
                    sc.nextLine();

                    d.setA(a);

                    System.out.println("\n--------- DADOS DO ALUNO ---------");
                    System.out.println("Nome: " + a.getNome());
                    d.mostrarDisciplinaAluno();
                    System.out.println("Matricula: " + a.getMatricula());
                    System.out.println("N1: " + a.getNota1() + " | N2: " + a.getNota2() + " | N3: " + a.getNota3());
                    System.out.printf("Média: %.2f%n", a.calcularMedia());
                    System.out.println("Situação: " + a.calcularAprovacao());
                    break;

                case 2:
                    Professor p = new Professor();
                    System.out.println("Digite o nome do professor:");
                    p.setNome(sc.nextLine());

                    System.out.println("Digite a especialidade:");
                    p.setEspecialidade(sc.nextLine());

                    System.out.println("Digite a disciplina que seu professor ministra:");
                    d.setNomeDisciplina(sc.nextLine());

                    System.out.println("Digite o salário:");
                    p.setSalario(sc.nextDouble());

                    d.setP(p);

                    System.out.println("\n--------- DADOS DO PROFESSOR ---------");
                    System.out.println("Nome: " + p.getNome());
                    d.mostrarDisciplinaProfessor();
                    System.out.println("Especialidade: " + p.getEspecialidade());
                    System.out.printf("Salário: R$ %.2f%n", p.getSalario());
                    break;

                case 0:
                    System.out.println("Saindo do sistema... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}