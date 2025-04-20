public class FreteTransportadora implements FreteStrategy {

    @Override
    public void calcularFrete(int total) {
        System.out.println("Frete via [transportadora] no valor de R$"+ (0.05*total));
    }
}
