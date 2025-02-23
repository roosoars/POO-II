public class Apple implements FabricanteCelular {

    @Override
    public Celular constroiCelular(String modelo) {
        if (modelo.equals("IPhone 16")){
            return new IPhone16();
        } else {
            return null;
        }
    }
}