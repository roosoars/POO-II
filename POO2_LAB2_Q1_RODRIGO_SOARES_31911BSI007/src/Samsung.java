public class Samsung implements FabricanteCelular {

    @Override
    public Celular constroiCelular(String modelo) {
        if (modelo.equals("Galaxy S25")) {
            return new S25();
        } else {
            return null;
        }
    }
}
