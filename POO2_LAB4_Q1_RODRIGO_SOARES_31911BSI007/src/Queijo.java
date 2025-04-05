public class Queijo extends PizzaDecorator {

    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescricao() {
        return super.pizza.getDescricao() + " adicionando queijo ";
    }

    @Override
    public Double getCusto() {
        return super.pizza.getCusto() + 5.00;
    }
}
