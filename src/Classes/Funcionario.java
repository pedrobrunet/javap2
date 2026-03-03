package Classes;

public class Funcionario {
    String nome;
    int Matricula;
    double salario;

    public double calcularDesconto (){
        return salario * 0.15;
    }

    public double salarioLiquido (){
        return salario - calcularDesconto();
    }

}
