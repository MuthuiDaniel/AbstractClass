public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        ElectricBike electricBike = new ElectricBike();

        // Test batteryType method
        System.out.println("Electric Car Battery Type: " + electricCar.batteryType());
        System.out.println("Electric Bike Battery Type: " + electricBike.batteryType());

        // Test common method charge
        electricCar.charge();
        electricBike.charge();
    }
}