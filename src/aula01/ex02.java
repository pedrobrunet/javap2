package aula01;

public class ex02 {
    public static void main(String[] args) {

        // CONSEGUIRIA IMPORTA TBM A BIBLIOTECA SCANNER PARA RECEBER DADOS DO USUARIO
        int numA = 2;
        int numB = 5;

        if (numA > numB) {
            System.out.println("O número " + numA + " é MAIOR que " + numB);
        } else if (numA < numB) {
            System.out.println("O número " + numA + " é MENOR que " + numB);
        } else {
            System.out.println("Os números são IGUAIS.");
        }

    }
}
