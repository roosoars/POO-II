public class AdaptadorAvePavao implements Ave {

    private Pavao pavao;

    public AdaptadorAvePavao(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void emitirSom() {
        pavao.cantar();
    }

    @Override
    public void voar() {
        System.out.println("Pavão não voa!!!");
    }
}
