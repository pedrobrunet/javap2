package aula03;
import java.util.Scanner;
import Classes.Aluno;
public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Nota 1 ");
        double n1 = sc.nextDouble();

        System.out.println("Nota 1 ");
        double n2 = sc.nextDouble();

        System.out.println("Nota 1 ");
        double n3 = sc.nextDouble();

        Aluno a1 = new Aluno(nome, n1, n2, n3 );












        System.out.println(a1.calculoMedia());


    }
}
