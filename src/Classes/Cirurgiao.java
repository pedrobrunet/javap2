package Classes;

public class Cirurgiao extends Medico {

    @Override // é uma anotação em Java que diz ao compilador: "Ei, eu estou sobrescrevendo um metodo que já existe na classe pai (superclasse)".
    public void tratarPaciente() {
        System.out.println("O cirurgião está tratando o paciente no centro cirúrgico.");
    }

    public void fazerIncisao() {
        System.out.println("Realizando incisão...");
    }
}