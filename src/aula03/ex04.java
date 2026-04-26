package aula03;

// A MUDANÇA ESTÁ AQUI: Trocamos Classes por model
import model.Aluno;
import java.util.Scanner;
import java.util.Locale;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        // Agora o Java encontrará o Aluno dentro da pasta model
        Aluno p = new Aluno();

        System.out.println("Informe o Nome:");
        p.setNome(sc.nextLine());

        System.out.println("Informe a Idade:");
        p.setIdade(sc.nextInt());

        System.out.println("Informe a Altura:");
        p.setAltura(sc.nextDouble());

        System.out.println("\n--- Dados Cadastrados ---");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Altura: " + p.getAltura());

        // Método herdado de Pessoa e implementado em Aluno
        p.quemSouEu();

        sc.close();
    }
}