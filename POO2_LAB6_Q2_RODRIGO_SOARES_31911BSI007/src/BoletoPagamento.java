public class BoletoPagamento implements PagamentoStrategy {

    @Override
    public void pagar(int total) {
        System.out.println("R$"+total+" pago com boleto.");
    }
}
