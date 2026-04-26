package model;

public class Disciplina {
    private Professor p;
    private Aluno a; // Corrigido de Aluno1 para Aluno
    private String nomeDisciplina;

    public void mostrarDisciplinaProfessor() {
        if (p != null) {
            System.out.println(p.getNome() + " ministra " + nomeDisciplina);
        }
    }

    public void mostrarDisciplinaAluno() {
        if (a != null) {
            System.out.println(a.getNome() + " cursa " + nomeDisciplina);
        }
    }

    // Getters e Setters
    public Professor getP() { return p; }
    public void setP(Professor p) { this.p = p; }

    public Aluno getA() { return a; }
    public void setA(Aluno a) { this.a = a; } // Agora aceita Aluno!

    public String getNomeDisciplina() { return nomeDisciplina; }
    public void setNomeDisciplina(String nomeDisciplina) { this.nomeDisciplina = nomeDisciplina; }
}