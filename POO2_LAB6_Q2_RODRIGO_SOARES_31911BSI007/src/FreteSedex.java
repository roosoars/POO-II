public class FreteSedex implements FreteStrategy {

    @Override
    public void calcularFrete(int total) {
        System.out.println("Frete via [Sedex] no valor de R$"+ (0.15*total));
    }
}
