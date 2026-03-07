package Classes;

public class Calculadora {
    public double n1,n2;

public Calculadora(double n1 ,double n2){
    this.n1 = n1;
    this.n2 = n2;}

public double somar (){
    return n1 + n2;
}

public double subtrair (){
        return n1 - n2;
    }


public double mutiplicar (){
        return n1 * n2;
    }

public double dividir(){
    return n1 / n2 ;
}

}
