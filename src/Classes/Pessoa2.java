package Classes;

public class Pessoa2 {
    private double peso;
    private double altura;

    // Getters e Setters
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    // Método de cálculo
    public double calculoImc() {
        // Altura * Altura é o mesmo que altura ao quadrado
        return peso / (altura * altura);
    }
}