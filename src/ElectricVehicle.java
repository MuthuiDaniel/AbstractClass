public abstract class ElectricVehicle {
    // Abstract method to be implemented by subclasses
    public abstract String batteryType();

    // Common method for all electric vehicles
    public void charge() {
        System.out.println("Charging the electric vehicle.");
    }
}
