public final class UniversityPolicy {
    public static final String UNIVERSITY_NAME = "University of Kelaniya";
    public static final double BONUS_RATE = 0.1; 

    public static void showPolicyHeader() {
        System.out.println("--- " + UNIVERSITY_NAME + " Payment Policy ---");
    }

    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }

    
}