public class Demo {
    public static void main(String[] args) {
        // Create objects of each class
        HospitalMember member = new HospitalMember("Alice", 101);
        Doctor doc = new Doctor("Bob", 102, "Cardiology", 10);
        Surgeon sur = new Surgeon("Charlie", 103, "Orthopedics", 15, "Joint Replacement", 5);

        System.out.println("--- Hospital Member ---");
        member.display();

        System.out.println("\n--- Doctor ---");
        doc.display();

        System.out.println("\n--- Surgeon ---");
        sur.display();

        // Demonstrate toString()
        System.out.println("\nString Representation:");
        System.out.println(sur.toString());

        // Demonstrate functional methods
        sur.performWork();
    }
}