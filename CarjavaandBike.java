class Car extends Vehicle {
    private int numberOfDays;
    private double dailyRate;

    public Car(String vehicleNumber, String brand, int numberOfDays, double dailyRate) {
        super(vehicleNumber, brand);
        this.numberOfDays = numberOfDays;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost() {
        super.calculateRentalCost();
        return numberOfDays * dailyRate;
    }
}

class Bike extends Vehicle {
    private int numberOfHours;
    private double hourlyRate;

    public Bike(String vehicleNumber, String brand, int numberOfHours, double hourlyRate) {
        super(vehicleNumber, brand);
        this.numberOfHours = numberOfHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateRentalCost() {
        super.calculateRentalCost();
        return numberOfHours * hourlyRate;
    }
}