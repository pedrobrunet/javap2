package model;

public class Medico extends Pessoa {
    protected boolean trabalhaNoHospital;

    @Override
    public void quemSouEu() {
        System.out.println("Sou um médico.");
    }

    public void tratarPaciente() {
        System.out.println("O médico está a tratar o paciente...");
    }

    public boolean getTrabalhaNoHospital() { return trabalhaNoHospital; }
    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) { this.trabalhaNoHospital = trabalhaNoHospital; }
}