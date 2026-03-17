package Classes;

public class Pessoa {
        protected int idade;
        protected String Nome;
        protected double altura;

    public Pessoa(){

}

    public Pessoa(String nome) {
    this.Nome = nome;
}


     // recebe idade




public void niver(){
            idade++;
        }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

