public class FabricanteCelularSingleton {

    private Apple apple;
    private Samsung samsung;

    public FabricanteCelular getInstance(String fabricante){
        if(fabricante.equals("Apple")) {
            if (apple == null) {
                apple = new Apple();
            } return apple;
        } else
        if (samsung ==null) {
            samsung = new Samsung();
        }
        return  samsung;
    }
}
