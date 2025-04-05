public class Tomate extends PizzaDecorator {

    public Tomate(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return super.pizza.getDescricao() + " adicionando tomate ";
    }

    public Double getCusto() {
        return super.pizza.getCusto() + 4.00;
    }
}
