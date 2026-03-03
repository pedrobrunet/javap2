package Classes;

public class Funcionario {
    public String nome;
    public int matricula;
    public double salario;

    public double calcularDesconto (){
        return salario * 0.15;
    }

    public double salarioLiquido (){
        return salario - calcularDesconto();
    }


}
