public class Main {

    public static void main(String[] args) {
        ProxyControleAcesso proxyPorta = new ProxyControleAcesso("Chave123");

        proxyPorta.trancar("Chave123"); // Porta trancada com a chave: Chave123
        proxyPorta.abrir("Chave123");
        proxyPorta.trancar("Chave456"); // Chave incorreta. Não é possível trancar a porta.
        proxyPorta.trancar("Chave123"); // Porta trancada com a chave: Chave123

    }
}
