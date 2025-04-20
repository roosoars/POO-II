public class PixPagamento implements PagamentoStrategy {

    @Override
    public void pagar(int total) {
        System.out.println("R$"+total+" pago com PIX.");
    }
}
