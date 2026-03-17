package Classes;

public class Aluno1 extends Pessoa {
    private int numeroTenis ;
    private int matricula;
    private double nota1,nota2, nota3;

    public Aluno1(){

    }
    public Aluno1 (String nome,int numeroTenis, int matricula, double nota1, double nota2,double nota3){
        super(nome);
        this.numeroTenis = numeroTenis;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;


    }


    public double calcularMedia() {
        double media = (nota1 + nota2 + nota3) / 3;
        return media; // Isso faz o método devolver o valor para o println
    }





    public int getNumeroTenis() {
        return numeroTenis;
    }

    public void setNumeroTenis(int numeroTenis) {
        this.numeroTenis = numeroTenis;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
