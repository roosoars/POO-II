public class Fit implements IVehicle {

    @Override
    public void start() {
        System.out.println("Fit está ligado.");
    }

    @Override
    public void drive() {
        System.out.println("Fit está em modo drive.");
    }

    @Override
    public void stop() {
        System.out.println("Fit está parado.");
    }
}
