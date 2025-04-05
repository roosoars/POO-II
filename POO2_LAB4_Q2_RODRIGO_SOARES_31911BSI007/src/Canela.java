public class Canela extends CafeDecorator {

    public Canela(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return super.cafe.getDescricao() + " adicionando canela";
    }

    @Override
    public Double getCusto() {
        return super.cafe.getCusto() + 1.50;
    }
}
