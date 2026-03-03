package Classes;

public class Funcionario {
    public String nome;
    public int matricula;
    public double salario;

    public Funcionario(String nome, int matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public double calcularDesconto() {
        return this.salario * 0.15;
    }

    public double salarioLiquido() {
        return this.salario - this.calcularDesconto();
    }
}