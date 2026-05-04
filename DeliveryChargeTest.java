public class DeliveryChargeTest {
    public static void main(String[] args) {
        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        System.out.println("Base Charge Only: " + calculator.calculateCharge(1000.0));
        System.out.println("Charge with Distance (5km): " + calculator.calculateCharge(1000.0, 5.0));
        System.out.println("Charge with Distance & Weight (5km, 2kg): " + calculator.calculateCharge(1000.0, 5.0, 2.0));
        System.out.println("Charge with Express Delivery: " + calculator.calculateCharge(1000.0, true));

        
    }
}
