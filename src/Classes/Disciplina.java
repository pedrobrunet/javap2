package Classes;

public class Disciplina {
    private Professor p;
    private Aluno1 a;
    private String nomeDisciplina;

    public Professor getP() {
        return p;
    }

    public void setP(Professor p) {
        this.p = p;
    }


    public void associar (Professor p ){
        this.p = p;
    }

    public Aluno1 getA() {
        return a;
    }

    public void setA(Aluno1 a) {
        this.a = a;
    }



    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void mostrarDisciplinaProfessor(){
        System.out.println(p.getNome() + "ministra" + nomeDisciplina );
    }

    public void mostrarDisciplinaAluno(){
        System.out.println(a.getNome() + "cursa " + nomeDisciplina );
    }


}
