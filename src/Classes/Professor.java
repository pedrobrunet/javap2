package Classes;

public class Professor extends Pessoa {
    private double salario;
    private String especialidade;

    // Getters e Setters
    public void setSalario(double salario) { this.salario = salario; }
    public double getSalario() { return salario; }

    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
    public String getEspecialidade() { return especialidade; }
}
