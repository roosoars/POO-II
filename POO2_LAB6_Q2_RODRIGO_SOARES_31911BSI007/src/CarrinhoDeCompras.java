import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    List<Item> items = new ArrayList<>();
    List<Item> itensFrete = new ArrayList<>();

    public void adicionaItem(Item item) {
        items.add(item);
    }

    public void adicionaItemFrete(Item item) {
        itensFrete.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int calculaTotal() {
        int sum = 0;
        for(Item item : items) {
            sum += item.getPreco();
        }
        return sum;
    }

    public void calculaFrete(FreteStrategy freteStrategy) {
        int total = this.calculaTotal();
        freteStrategy.calcularFrete(total);
    }

    public void realizaPagamento(PagamentoStrategy strategy) {
        int total = this.calculaTotal();
        strategy.pagar(total);
    }
}