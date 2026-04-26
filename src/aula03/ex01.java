package aula03;

// A MUDANÇA PRINCIPAL ESTÁ AQUI: de Classes para model
import model.Funcionario;
import java.util.Scanner;
import java.util.Locale;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("--- BEM VINDO À FOLHA SALARIAL ---");

        System.out.print("Digite seu nome: ");
        String n = sc.nextLine();

        System.out.print("Insira sua matricula: ");
        int m = sc.nextInt();

        System.out.print("Informe seu salario Bruto: ");
        double s = sc.nextDouble();

        // Criando o objeto: Funcionario(nome, matricula, salarioBase)
        Funcionario f1 = new Funcionario(n, m, s);

        System.out.println("\n===============================");
        System.out.println("FOLHA COM DESCONTOS");
        System.out.println("-------------------------------");

        // Agora o IntelliJ encontrará esses métodos em model.Funcionario
        System.out.println("Matricula: " + f1.getMatricula());
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salario bruto: " + f1.getSalarioBase());
        System.out.println("Desconto total (15%): " + f1.calcularDesconto());

        // Este método vem da implementação da interface Remuneravel
        System.out.println("Salario Liquido a receber: " + f1.getSalarioLiquido());

        sc.close();
    }
}