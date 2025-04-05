public class Leite extends CafeDecorator {

    public Leite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return super.cafe.getDescricao() + " adicionando leite";
    }

    @Override
    public Double getCusto() {
        return super.cafe.getCusto() + 2.0;
    }
}
