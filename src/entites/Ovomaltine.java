package entites;

public class Ovomaltine extends Complementos {
    public Ovomaltine(Acai acai) {
        this.acai = acai;
    }

    @Override
    public String getDescricao() {
        return acai.getDescricao() + " Com Ovomaltine";
    }

    @Override
    public double preco() {
        return this.acai.preco() + 5;
    }
}
