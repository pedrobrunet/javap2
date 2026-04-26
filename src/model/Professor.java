package model;

import interfaces.Remuneravel; // Importando a interface

// O "implements Remuneravel" resolve o erro do getSalarioLiquido
public class Professor extends Pessoa implements Remuneravel {

    private String especialidade;
    private double salario;
    private Cargo cargo; // Usando o Enum Cargo

    public Professor() {
        super();
    }

    // Implementação obrigatória da interface Remuneravel
    @Override
    public double getSalarioLiquido() {
        // Exemplo: 10% de desconto no salário do professor
        return this.salario * 0.90;
    }

    // Implementação obrigatória do método abstrato de Pessoa
    @Override
    public void quemSouEu() {
        System.out.println("Sou o Professor: " + getNome() + " | Especialidade: " + especialidade);
    }

    // --- GETTERS E SETTERS ---

    // Este método resolve o erro "Cannot resolve method setCargo"
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + getNome() + '\'' +
                ", cargo=" + cargo +
                ", especialidade='" + especialidade + '\'' +
                ", salarioBruto=" + salario +
                '}';
    }
}