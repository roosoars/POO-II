public class Main {

    public static void main(String[] args) {
        Cafe pedido1 = new Espresso();
        Cafe descafePedido1 = new Leite(new Canela(new Chocolate(pedido1)));

        String descPed1 = descafePedido1.getDescricao();
        Double custoPed1 = descafePedido1.getCusto();

        System.out.println("Descrição: "+descPed1+"\n Valor: "+custoPed1);

        System.out.println("");
        Cafe pedido2 = new Decaf();
        Cafe descafePedido2 = new Chocolate(new Canela(new Chocolate(new Leite(pedido2))));

        String descPed2 = descafePedido2.getDescricao();
        Double custoPed2 = descafePedido2.getCusto();

        System.out.println("Descrição: "+descPed2+"\n Valor: "+custoPed2);
    }
}
