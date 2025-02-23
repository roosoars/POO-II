public class Etios implements IVehicle {

    @Override
    public void start() {
        System.out.println("Etios está ligado.");
    }

    @Override
    public void drive() {
        System.out.println("Etios está em modo drive.");
    }

    @Override
    public void stop() {
        System.out.println("Etios está parado.");
    }
}
