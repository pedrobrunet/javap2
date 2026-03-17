package Classes;

public class Funcionario2 {
    private String nome;
    private double valorHora;
    private int horasTrabalhadas;
    private double salario; // Mudei para private para manter o encapsulamento

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    // Corrigido: Agora recebe o parâmetro int horasTrabalhadas
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculoSalario() {
        this.salario = this.horasTrabalhadas * this.valorHora;
        return this.salario;
    }
}