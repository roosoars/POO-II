public class Main {
    public static void main(String ... args){
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionaItem(new Item("livro x", 50));
        carrinho.adicionaItem(new Item("tênis y", 800));

        carrinho.adicionaItemFrete(new Item("livro x", 50));
        carrinho.adicionaItemFrete(new Item("tênis y", 800));

        FreteStrategy freteStrategy = new FreteTransportadora();
        PagamentoStrategy strategy = new PixPagamento();
        carrinho.realizaPagamento(strategy);
        carrinho.calculaFrete(freteStrategy);
    }
}
