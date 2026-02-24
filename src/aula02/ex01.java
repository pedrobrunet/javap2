import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("--- NOVO CADASTRO ---");

            System.out.println("DIGITE SEU NOME:");
            String nome = entradaUsuario.nextLine();

            System.out.println("DIGITE SUA IDADE:");
            byte idade = entradaUsuario.nextByte();

            // Limpeza de buffer: consome o "Enter" que sobrou do nextByte
            entradaUsuario.nextLine();

            System.out.println("\nCadastro realizado: " + nome + ", " + idade + " anos.");


            System.out.println("\nDeseja repetir para fazer um novo cadastro? (S/N)");
            resposta = entradaUsuario.nextLine();

        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("Programa encerrado. Seja bem-vindo!");
        entradaUsuario.close();
    }
}