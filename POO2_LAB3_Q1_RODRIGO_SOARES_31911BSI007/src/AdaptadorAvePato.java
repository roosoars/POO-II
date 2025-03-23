public class AdaptadorAvePato implements Ave {

    private Pato pato;

    public AdaptadorAvePato(Pato pato) {
        this.pato = pato;
    }

    @Override
    public void voar() {
        pato.voar();
    }

    @Override
    public void emitirSom() {
        pato.grasnar();
    }
}
