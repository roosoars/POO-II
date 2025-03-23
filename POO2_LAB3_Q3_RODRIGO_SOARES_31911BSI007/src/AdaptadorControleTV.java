public class AdaptadorControleTV implements Controle {
    private final ControleTv controleTv;

    public AdaptadorControleTV(ControleTv controleTv) {
        this.controleTv = controleTv;
    }

    @Override
    public void ligar() {
        controleTv.ligar();
    }
    @Override
    public void desligar() {
        controleTv.ligar();
    }

    @Override
    public void ajustarVolume() {
        controleTv.ajustarVolume();
    }

    @Override
    public void mudarCanal() {
        controleTv.mudarCanal();
    }
}
