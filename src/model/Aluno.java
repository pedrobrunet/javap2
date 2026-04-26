package model;

// Aluno herda de Pessoa, ganhando nome, idade, peso e altura
public class Aluno extends Pessoa {
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    // 1. Construtor Padrão (Vazio)
    public Aluno() {
        super();
    }

    // 2. Construtor Completo (Para facilitar a criação nas Mains)
    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3) {
        super(nome); // Passa o nome para a classe pai (Pessoa)
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // --- MÉTODOS DE LÓGICA ---

    // Calcula a média aritmética simples
    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    // Retorna a situação do aluno baseada na média
    public String calcularAprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            return "Aprovado";
        } else if (media < 4.0) {
            return "Reprovado";
        } else {
            return "Está na final";
        }
    }

    // Implementação obrigatória do método abstrato de Pessoa
    @Override
    public void quemSouEu() {
        System.out.println("Sou o aluno: " + getNome() + " | Matrícula: " + this.matricula);
    }

    // --- GETTERS E SETTERS ---

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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

    // toString para facilitar a exibição de dados
    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + getNome() + '\'' +
                ", matricula=" + matricula +
                ", media=" + String.format("%.2f", calcularMedia()) +
                ", situação='" + calcularAprovacao() + '\'' +
                '}';
    }
}