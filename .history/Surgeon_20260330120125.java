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

    public String getSurgeryType() {
        return surgeryType;
    }

    public int getOperationRoomNumber() {
        return operationRoomNumber;
    }

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }

    public void setOperationRoomNumber(int operationRoomNumber) {
        this.operationRoomNumber = operationRoomNumber;
    }

    public void display() {
        super.display();
        System.out.println("Surgery Type: " + surgeryType);
        System.out.println("Operation Room Number: " + operationRoomNumber);
    }

    public String toString() {
        return super.toString() + ", Surgeon{surgeryType='" + surgeryType + "', operationRoomNumber="
                + operationRoomNumber + "}";
    }
}
