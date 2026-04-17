public class Lab04Main {
    public static void main(String[] args) {
        StaffMember.showSystemName();
        UniversityPolicy.showPolicyHeader();
        System.out.println("University: " + UniversityPolicy.UNIVERSITY_NAME);
        System.out.println("------------------------------------------");

        Lecturer lec1 = new Lecturer("Dr. Aruna Silva", "L102", "Electronics", 4, 45000.0);
        Lecturer lec2 = new Lecturer("Dr. Deepani Perera", "L105", "Science", 2, 45000.0);
        LabAssistant ast1 = new LabAssistant("Nimal Perera", "A505", "Physics", 50, 1200.0);

        lec1.changeDepartment("Computing");

        StaffMember[] staffList = {lec1, lec2, ast1};
        double totalMonthlyPayment = 0;

        for (StaffMember member : staffList) {
            System.out.println("\n--- Staff Record ---");
            member.displayBasicDetails();
            
            double payment = member.calculateMonthlyPayment();
            double bonus = UniversityPolicy.calculateBonus(payment);
            double totalForMember = payment + bonus;
            
            totalMonthlyPayment += totalForMember;
            
            System.out.println("Monthly Payment (with bonus): " + totalForMember);
            member.showCommonNotice();
        }

        System.out.println("\n==========================================");
        System.out.println("Total Monthly Payroll: " + totalMonthlyPayment);
        System.out.println("Total Staff Count: " + StaffMember.getStaffCount());
        System.out.println("==========================================");
    }
}