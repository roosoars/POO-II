public class AdaptadorControleRadio implements Controle {
    private final ControleRadio controleRadio;

    public AdaptadorControleRadio(ControleRadio controleRadio) {
        this.controleRadio = controleRadio;
    }

    @Override
    public void ligar() {
        controleRadio.ligar();
    }

    @Override
    public void desligar() {
        controleRadio.desligar();
    }

    @Override
    public void ajustarVolume() {
        controleRadio.ajustarVolume();
    }

    @Override
    public void mudarCanal() {
        controleRadio.mudarFrequencia();
    }
}
