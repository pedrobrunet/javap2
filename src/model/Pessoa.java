package model;

public abstract class Pessoa {
    // Atributos protegidos para que as classes filhas (Aluno, Professor) acessem
    protected String nome;
    protected int idade;
    protected double altura;
    protected double peso;

    // 1. Construtor Padrão
    public Pessoa() {
    }

    // 2. Construtor com Nome
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // --- MÉTODOS DE LÓGICA ---

    // Aumenta a idade
    public void fazerAniversario() {
        this.idade++;
    }

    // Cálculo de IMC
    public double calculoImc() {
        if (altura > 0) {
            return peso / (altura * altura);
        }
        return 0;
    }

    // Método obrigatório para todas as filhas
    public abstract void quemSouEu();

    // --- GETTERS E SETTERS ---

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // toString completo e fechado corretamente
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
} // Chave que fecha a classe Pessoa