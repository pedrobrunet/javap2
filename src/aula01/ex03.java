package aula01;


public class ex03 {
    public static void main(String[] args) {
        int nota1 = 50;
        int nota2 = 50;
        int nota3 = 40;
        int MediaFinal = (nota1 + nota2 + nota3) / 3;

        System.out.println(MediaFinal);

        if (MediaFinal >= 70) {
            System.out.println("Aprovado");
        }
        else if (MediaFinal == 50){
            System.out.println("Final");
        }

        else {
            System.out.println("Reprovado");
        }


   }

}