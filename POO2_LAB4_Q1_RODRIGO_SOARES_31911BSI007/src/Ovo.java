public class Ovo extends PizzaDecorator {

    public Ovo(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return super.pizza.getDescricao() + " adicionando ovo ";
    }

    public Double getCusto() {
        return super.pizza.getCusto() + 1.50;
    }
}
