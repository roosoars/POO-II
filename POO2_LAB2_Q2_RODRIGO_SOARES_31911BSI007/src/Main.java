public class Main {
    public static void main(String[] args) {

        IVehicleMakerSingleton singleton = new IVehicleMakerSingleton() ;
        IVehicleMaker fabricanteToyota = singleton.getInstance("toyota");

        IVehicle corolla = fabricanteToyota.makeVehicle("Corolla");
        corolla.start();
        corolla.drive();
        corolla.stop();
    }
}
