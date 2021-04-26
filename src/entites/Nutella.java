package entites;

public class Nutella extends Complementos{
    public Nutella(Acai acai) {
        this.acai = acai;
    }

    @Override
    public String getDescricao() {
        return acai.getDescricao() + " Com Nutella";
    }

    @Override
    public double preco() {
        return this.acai.preco() + 5;
    }
}
