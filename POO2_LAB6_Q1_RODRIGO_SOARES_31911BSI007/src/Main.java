public class Main {

    public static void main(String ... args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionaItem(new Item("livro x", 50) );
        carrinho.adicionaItem(new Item("tenis y", 800));

        // pensando que o usuario vai pagar com o pix
        PagamentoStrategy strategy = new PixPagamento();

        carrinho.realizaPagamento(strategy);

    }
}
