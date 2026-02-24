package aula02;
import java.util.Scanner;
import java.util.Locale;

public class ex02 {
    public static void main(String[] args) {
        Scanner entradausuario = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo a sua folha Salarial");

        System.out.println("Digite seu nome");
        String nome = entradausuario.nextLine();

        System.out.println("Digite sua Matricula");
        String matricula = entradausuario.nextLine() ;

        System.out.println("Digite seu salario BRUTO");
        double salarioBruto = entradausuario.nextDouble ();

        double deducaoInss = salarioBruto * 0.15;
        double salarioLiquido = salarioBruto - deducaoInss ;

        System.out.println("SEU CONTRA-CHEQUE");
        System.out.println("nome:" + nome);
        System.out.println("Matricula:" + matricula);
        System.out.printf("Salario Bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Dedução INSS: R$ %.2f%n", deducaoInss);
        System.out.println("-------------------------");
        System.out.printf("Salario Liquido: R$ %.2f%n", salarioLiquido);





    }
}
