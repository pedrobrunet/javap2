package Classes;

public class Aluno {
    public String nome;
    public double nota1, nota2, nota3;

public Aluno(String nome,double nota1,double nota2,double nota3){
    this.nome = nome;
    this.nota1 = nota1;
    this.nota3 = nota3;
    this.nota2 = nota2;

}

public double calculoMedia() {
    return (this.nota1 + this.nota2 + this.nota3) / 3;}

    public String calculoAprovacao() {
        double media = this.calculoMedia();

        if (media >= 70) {
            return "Aprovado";
        }
        else if (media < 40) {
            return "Reprovado";
        }
        else {
            return "Está na final";
        }
    }





}
