public class Main {

    public static void main(String[] args) {

        Pizza pedido1 = new MassaFinaPizza();
        Pizza margueritaPedido1 = new Queijo(new Tomate(pedido1));
        Double precoPedido1 = margueritaPedido1.getCusto();
        System.out.println(precoPedido1);
        String descricaoPedido1 = margueritaPedido1.getDescricao();

        System.out.println(descricaoPedido1);

        Pizza pedido2 = new MassaFinaPizza();
        Pizza margueritaPedido2 = new Ervilha(new Queijo(new Tomate(pedido2)));

    }
}
