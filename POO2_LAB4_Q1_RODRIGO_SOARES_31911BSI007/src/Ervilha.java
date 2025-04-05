public class Ervilha extends PizzaDecorator {

    public Ervilha(Pizza pizza) {
        super(pizza);
    }

    public String getDescricao() {
        return super.pizza.getDescricao() + " adicionando ervilha ";
    }

    public Double getCusto() {
        return super.pizza.getCusto() + 2.00;
    }

}
