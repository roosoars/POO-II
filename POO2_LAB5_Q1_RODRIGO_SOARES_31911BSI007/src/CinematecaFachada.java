public class CinematecaFachada {
    private final Pipoqueira maqPipoca;
    private final Luzes luz;
    private final Telao tela;
    private final Projetor projetor;
    private final Amplificador amplificador;
    private final PlayerStreaming player;

    public CinematecaFachada() {
        this.maqPipoca = new Pipoqueira();
        this.luz = new Luzes();
        this.tela = new Telao();
        this.projetor = new Projetor();
        this.amplificador = new Amplificador();
        this.player = new PlayerStreaming();
    }


    public void iniciarFilme(String nome) {
        //ligar pipoqueira
        maqPipoca.ligar();
        //rebentar pipoca
        maqPipoca.arrebentarPipoca();
        //desligar luzes
        luz.desligar();
        //abaixar telao
        tela.abaixar();
        //ligar projetor
        projetor.ligar();
        //ligar amplificador
        amplificador.ligar();
        //ajustar volume som para 10
        amplificador.aumentarVolume(10);
        //ligar player
        player.ligar();
        //apertar play
        player.iniciarFilme(nome);
    };

    public void fimDoFilme() {
        player.desligar();
        amplificador.desligar();
        projetor.desligar();
        tela.subir();
        luz.ligar();
        maqPipoca.desligar();
    };
}
