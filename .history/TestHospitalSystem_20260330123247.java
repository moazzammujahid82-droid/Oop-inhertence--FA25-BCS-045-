/**
 * Test class containing main() method
 * Demonstrates inheritance, constructor chaining, method overriding, and
 * polymorphism
 */
public class TestHospitalSystem {
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║     HOSPITAL MANAGEMENT SYSTEM - INHERITANCE DEMO          ║");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");

        // =================================================================
        // PART 1: Creating objects of all classes in the hierarchy
        // =================================================================

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("PART 1: CREATING OBJECTS (Demonstrating Constructor Chaining)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        // 1. Create HospitalMember object (Parent class)
        System.out.println(">>> Creating HospitalMember object:");
        HospitalMember member = new HospitalMember("Alice Johnson", 1001);
        System.out.println();

        // 2. Create Doctor object (Child class)
        System.out.println(">>> Creating Doctor object:");
        Doctor doctor = new Doctor("Robert Smith", 2001, "Cardiology", 10);
        System.out.println();

        // 3. Create Surgeon object (Grandchild class)
        System.out.println(">>> Creating Surgeon object:");
        Surgeon surgeon = new Surgeon("Sarah Chen", 3001, "Neurosurgery", 15,
                "Brain Surgery", 5);
        System.out.println();

        // =================================================================
        // PART 2: Testing parent class methods work correctly
        // =================================================================

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("PART 2: PARENT CLASS METHODS (HospitalMember)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        System.out.println("--- Testing HospitalMember object ---");
        member.checkIn();
        member.displayInfo();
        int yearsToRetire = member.calculateYearsUntilRetirement(45);
        System.out.println("Years until retirement: " + yearsToRetire);
        System.out.println("toString(): " + member.toString());
        System.out.println();

        // =================================================================
        // PART 3: Testing inherited methods in child class
        // =================================================================

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("PART 3: INHERITED METHODS IN CHILD CLASS (Doctor)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        System.out.println("--- Testing inherited methods from HospitalMember ---");
        doctor.checkIn(); // Inherited from HospitalMember

        System.out.println("\n--- Testing Doctor's own methods ---");
        doctor.diagnosePatient("John Doe");
        double consultationFee = doctor.calculateConsultationFee();
        System.out.println("Consultation fee: $" + consultationFee);

        System.out.println("\n--- Testing overridden displayInfo() ---");
        doctor.displayInfo(); // Overridden in Doctor - calls super.displayInfo() first

        System.out.println("\ntoString(): " + doctor.toString());
        System.out.println();

        // =================================================================
        // PART 4: Testing inherited methods in grandchild class
        // =================================================================

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("PART 4: INHERITED METHODS IN GRANDCHILD CLASS (Surgeon)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        System.out.println("--- Testing inherited methods from HospitalMember ---");
        surgeon.checkIn(); // Inherited from HospitalMember

        System.out.println("\n--- Testing inherited methods from Doctor ---");
        surgeon.diagnosePatient("Jane Smith"); // Inherited from Doctor
        double surgeonConsultationFee = surgeon.calculateConsultationFee();
        System.out.println("Consultation fee (inherited calculation): $" + surgeonConsultationFee);

        System.out.println("\n--- Testing Surgeon's own methods ---");
        surgeon.performSurgery("Mike Brown");
        double surgeryCost = surgeon.calculateSurgeryCost(3);
        System.out.println("Surgery cost for 3 hours: $" + String.format("%.2f", surgeryCost));

        System.out.println("\n--- Testing overridden displayInfo() ---");
        surgeon.display(); // Overridden in Surgeon - calls super.displayInfo() first

        System.out.println("\ntoString(): " + surgeon.toString());
        System.out.println();

        // =================================================================
        // PART 5: Demonstrating polymorphism and method overriding differences
        // =================================================================

        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("PART 5: POLYMORPHISM DEMO (Method Overriding Differences)");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        // Using parent references to hold child objects
        HospitalMember polyDoctor = new Doctor("Emily Davis", 2002, "Pediatrics", 8);
        HospitalMember polySurgeon = new Surgeon("Michael Lee", 3002, "Orthopedics", 12, "Joint Replacement", 3);

        System.out.println("--- Polymorphic displayInfo() calls ---");
        System.out.println("HospitalMember reference holding Doctor object:");
        polyDoctor.display(); // Calls Doctor's displayInfo()

        System.out.println("\nHospitalMember reference holding Surgeon object:");
        polySurgeon.display(); // Calls Surgeon's displayInfo()

        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("PART 6: SUMMARY OF BEHAVIORAL DIFFERENCES");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

        System.out.println("1. HOSPITALMEMBER (Base):");
        System.out.println("   - Basic check-in functionality");
        System.out.println("   - Generic display showing only name and ID");
        System.out.println();

        System.out.println("2. DOCTOR (Derived):");
        System.out.println("   - Inherits check-in from HospitalMember");
        System.out.println("   - Adds specialization and experience");
        System.out.println("   - Overrides displayInfo() to show doctor-specific info");
        System.out.println("   - Adds diagnosePatient() method");
        System.out.println("   - Adds calculateConsultationFee() method");
        System.out.println();

        System.out.println("3. SURGEON (Further Derived):");
        System.out.println("   - Inherits check-in from HospitalMember");
        System.out.println("   - Inherits diagnosePatient() from Doctor");
        System.out.println("   - Adds surgeryType and operationRoomNumber");
        System.out.println("   - Overrides displayInfo() to show surgeon-specific info");
        System.out.println("   - Adds performSurgery() method");
        System.out.println("   - Adds calculateSurgeryCost() method");
        System.out.println();

    }
}