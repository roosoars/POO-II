class PortaReal implements Porta {
    private boolean aberta;

    @Override
    public void abrir(String chave) {
        if (chave != null && chave.equals("Chave123")) {
            System.out.println("Chave correta. Acesso permitido.");
            aberta = true;
        } else {
            System.out.println("Chave incorreta. Acesso negado.");
            aberta = false;
        }
    }

    @Override
    public void fechar() {
        aberta = false;
        System.out.println("Porta fechada.");
    }

    @Override
    public void trancar(String chave) {
        if (!aberta) {
            System.out.println("Porta já está fechada. Não é possível trancar.");
        } else {
            System.out.println("Porta trancada com a chave: " + chave);
            aberta = false;
        }
    }
}
