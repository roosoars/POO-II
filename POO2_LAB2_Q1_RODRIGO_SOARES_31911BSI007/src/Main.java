public class Main {

    //APPLE E SAMSUNG É SINGLETON

    //CADA FABRICANTE PRODUZ VÁRIOS CELULARES E UM NEW PARA CADA CELULAR.
    //SAMSUNG: GALAXY S24, GALAXY S25
    //APPLE: IPHONE 15, IPHONE 16


    public static void main(String[] args) {
        FabricanteCelularSingleton singleton = new FabricanteCelularSingleton();
        FabricanteCelular Samsung = singleton.getInstance("Samsung");


        Celular s25 = Samsung.constroiCelular("Galaxy S25");
        s25.tiraFoto();

    }
}

