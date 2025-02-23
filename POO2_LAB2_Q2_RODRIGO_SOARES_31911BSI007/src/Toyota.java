public class Toyota implements IVehicleMaker {

    @Override
    public IVehicle makeVehicle(String modelo) {
        if  (modelo.equals("Corolla")) {
            return new Corolla();
        } else if (modelo.equals("Hilux")) {
            return new Hilux();
        } else {
            return new Etios();
        }
    }
}