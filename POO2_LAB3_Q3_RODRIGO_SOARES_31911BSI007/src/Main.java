public class Main {
    public static void main(String[] args) {
        ControleTv controle1 = new ControleTv();
        Controle controleUniversal = new AdaptadorControleTV(controle1);
        controleUniversal.ligar();
        controleUniversal.ajustarVolume();
        controleUniversal.mudarCanal();
        controleUniversal.desligar();

        System.out.println("");

        ControleRadio controle2 = new ControleRadio();
        Controle controleUniversal2 = new AdaptadorControleRadio(controle2);
        controleUniversal2.ligar();
        controleUniversal2.ajustarVolume();
        controleUniversal2.mudarCanal();
        controleUniversal2.desligar();

        System.out.println("");

        ControleLampada controle3 = new ControleLampada();
        Controle controleUniversal3 = new AdaptadorControleLampada(controle3);
        controleUniversal3.ligar();
        controleUniversal3.ajustarVolume();
        controleUniversal3.mudarCanal();
        controleUniversal3.desligar();

    }
}
