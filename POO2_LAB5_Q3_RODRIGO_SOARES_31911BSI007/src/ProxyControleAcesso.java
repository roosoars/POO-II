public class ProxyControleAcesso implements Porta {
    private String chaveCorreta;
    private PortaReal portaReal;

    public ProxyControleAcesso(String chaveCorreta) {
        this.chaveCorreta = chaveCorreta;
        this.portaReal = new PortaReal();
    }

    @Override
    public void abrir(String chave) {
        if (chave.equals(chaveCorreta)) {
            portaReal.abrir(chave);
        } else {
            System.out.println("Chave incorreta. Acesso negado.");
        }
    }

    @Override
    public void fechar() {
        portaReal.fechar();
    }

    @Override
    public void trancar(String chave) {
        if (chave.equals(chaveCorreta)) {
            portaReal.trancar(chave);
        } else {
            System.out.println("Chave incorreta. Não é possível trancar a porta.");
        }
    }
}