public class VehicleRentalTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car("CAR-1234", "Toyota", 5, 5000.0);
        Vehicle vehicle2 = new Bike("BIKE-5678", "Yamaha", 10, 200.0);

        vehicle1.displayVehicleInfo();
        System.out.println("Total Car Rental Cost: " + vehicle1.calculateRentalCost());
        System.out.println();

        vehicle2.displayVehicleInfo();
        System.out.println("Total Bike Rental Cost: " + vehicle2.calculateRentalCost());

        
    }
}