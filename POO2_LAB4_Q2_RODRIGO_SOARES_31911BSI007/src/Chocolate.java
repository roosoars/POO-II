public class Chocolate extends CafeDecorator {

    public Chocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return super.cafe.getDescricao() + " adicionando chocolate";
    }

    @Override
    public Double getCusto() {
        return super.cafe.getCusto() + 3.0;
    }
}
