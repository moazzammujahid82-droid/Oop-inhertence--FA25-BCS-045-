public class Surgeon extends Doctor {

    private String surgeryType;
    private int operationRoomNumber;

    public Surgeon() {
        super();
        this.surgeryType = "unknown";
        this.operationRoomNumber = 0;
    }

    public Surgeon(String name, int id, String specialty, int yearsOfExperience, String surgeryType,
            int operationRoomNumber) {
        super(name, id, specialty, yearsOfExperience);
        this.surgeryType = surgeryType;
        this.operationRoomNumber = operationRoomNumber;
    }

}
