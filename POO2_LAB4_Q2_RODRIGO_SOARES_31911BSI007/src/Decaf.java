public class Decaf implements Cafe {

    @Override
    public String getDescricao() {
        return "Cafe descafeinado";
    }

    @Override
    public Double getCusto() {
        return 8.0;
    }
}
