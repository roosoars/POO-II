public class Espresso implements Cafe {

    @Override
    public String getDescricao() {
        return "Cafe espresso";
    }

    @Override
    public Double getCusto() {
        return 10.0;
    }
}
