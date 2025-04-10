public class DirigirFachada {
    private final CintoSeguranca cinto;
    private final Farol farol;
    private final Motor motor;
    private final Porta porta;
    private final Radio radio;

    public DirigirFachada() {
        this.cinto = new CintoSeguranca();
        this.farol = new Farol();
        this.motor = new Motor();
        this.porta = new Porta();
        this.radio = new Radio();
    }

    public void dirigir(String freq) {
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(freq);
    }
}
