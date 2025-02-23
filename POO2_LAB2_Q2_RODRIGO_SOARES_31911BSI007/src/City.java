public class City implements IVehicle {

    @Override
    public void start() {
        System.out.println("City está ligado.");
    }

    @Override
    public void drive() {
        System.out.println("City está em modo drive.");
    }

    @Override
    public void stop() {
        System.out.println("City está parado.");
    }
}
