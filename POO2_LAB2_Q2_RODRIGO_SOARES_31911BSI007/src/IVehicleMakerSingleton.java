public class IVehicleMakerSingleton {

    private Toyota toyota;
    private Honda honda;

    public IVehicleMaker getInstance(String fabricante) {
        if (fabricante.equals("toyota")) {
            if (toyota == null) {
                toyota = new Toyota();
            }
            return toyota;
        } else if (honda == null) {
            honda = new Honda();
        }
        return honda;
    }
}