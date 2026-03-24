package Classes;

public class ClinicoGeral extends Medico {
    private Boolean atendeEmCasa;

    public void receitar(){
        System.out.println("Seu medico está receitando");
    }

    public Boolean getAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(Boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }
}
