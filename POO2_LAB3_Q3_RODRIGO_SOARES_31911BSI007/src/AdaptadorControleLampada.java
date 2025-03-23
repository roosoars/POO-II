public class AdaptadorControleLampada implements Controle {
    private final ControleLampada controleLampada;

    public AdaptadorControleLampada(ControleLampada controleLampada) {
        this.controleLampada = controleLampada;
    }

    @Override
    public void ligar() {
        controleLampada.ligar();
    }

    @Override
    public void desligar() {
        controleLampada.desligar();
    }

    @Override
    public void ajustarVolume() {
        System.out.println("Não é possível ajustar o volume da lâmpada.");
    }

    @Override
    public void mudarCanal() {
        controleLampada.mudarCor();
    }
}