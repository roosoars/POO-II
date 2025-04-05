public class CafeDecorator implements Cafe {

    protected Cafe cafe;

    public CafeDecorator (Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao();
    }

    @Override
    public Double getCusto() {
        return cafe.getCusto();
    }
}
