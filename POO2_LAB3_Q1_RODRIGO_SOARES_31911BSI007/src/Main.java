public class Main {
    public static void main(String[] args) {

        Pavao meuPavaoAzul = new PavaoAzul();
        Ave meuPavaoUniversal = new AdaptadorAvePavao(meuPavaoAzul);

        meuPavaoUniversal.emitirSom();
        meuPavaoUniversal.voar();

        System.out.println("");

        Pato meuPatoDomestico1 = new PatoDomestico();
        Ave meuPatoUniversal = new AdaptadorAvePato(meuPatoDomestico1);

        meuPatoUniversal.emitirSom();
        meuPatoUniversal.voar();
    }

    public static void habilidadesDaAveGerada(Ave ave) {
        ave.emitirSom();
        ave.voar();
    }
}
