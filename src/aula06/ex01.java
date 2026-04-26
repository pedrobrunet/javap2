package aula06;
import java.util.Scanner;

import model.Cirurgiao;
import model.ClinicoGeral;


public class ex01{
    public static void main(String[] args) {

        // 1. Instanciando o Clínico Geral
        ClinicoGeral clinico = new ClinicoGeral();

        // Usando SET para atribuir valores
        clinico.setTrabalhaNoHospital(true); // Herdado de Medico
        clinico.setAtendeEmCasa(true);      // Específico de ClinicoGeral

        System.out.println("--- Dados do Clínico Geral ---");

        // Usando GET para recuperar os valores e imprimir
        if (clinico.getAtendeEmCasa()) {
            System.out.println("O médico realiza atendimentos domiciliares.");
        } else {
            System.out.println("O médico atende apenas no consultório.");
        }

        // Chamando os métodos de comportamento
        clinico.tratarPaciente(); // Vem da classe pai (Medico)
        clinico.receitar();      // Metodo próprio da classe ClinicoGeral

        System.out.println("\n------------------------------");

        // 2. Instanciando o Cirurgião
        Cirurgiao cirurgiao = new Cirurgiao();
        cirurgiao.setTrabalhaNoHospital(true);

        System.out.println("--- Dados do Cirurgião ---");
        cirurgiao.tratarPaciente(); // Executa o @Override (versão do Cirurgião)
        cirurgiao.fazerIncisao();
    }
}