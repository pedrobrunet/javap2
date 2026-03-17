package aula03;
import Classes.Pessoa;
import java.util.Scanner;

public class ex04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        Pessoa p = new Pessoa();
        System.out.println("Infome o Nome ");
        p.setNome(sc.nextLine());

        System.out.println("Informe a Idade ");
        p.setIdade(sc.nextInt());

        System.out.println("altura ");
        p.setAltura(sc.nextDouble());

        System.out.println("Nome: " + p.getNome());
        System.out.println("Nome: " + p.getIdade());
        System.out.println("Nome: " + p.getAltura());
    }
}
