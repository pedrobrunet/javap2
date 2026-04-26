package model;

public class Funcionario extends Pessoa {
    private int matricula;
    private double salarioBase;
    private double valorHora;
    private int horasTrabalhadas;

    // 1. Construtor Padrão
    public Funcionario() {
        super();
    }

    // 2. Construtor Completo
    public Funcionario(String nome, int matricula, double salarioBase) {
        super(nome);
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    // --- MÉTODOS DE LÓGICA ---

    public double calcularSalarioHorista() {
        this.salarioBase = this.valorHora * this.horasTrabalhadas;
        return this.salarioBase;
    }

    public double calcularDesconto() {
        return this.salarioBase * 0.15;
    }

    public double getSalarioLiquido() {
        return this.salarioBase - calcularDesconto();
    }

    @Override
    public void quemSouEu() {
        System.out.println("Sou o funcionário: " + this.getNome() + " | Matrícula: " + this.matricula);
    }

    // --- GETTERS E SETTERS ---

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", matricula=" + matricula +
                ", salarioBruto=" + salarioBase +
                ", salarioLiquido=" + getSalarioLiquido() +
                '}';
    }
} // Chave final que fecha a classe