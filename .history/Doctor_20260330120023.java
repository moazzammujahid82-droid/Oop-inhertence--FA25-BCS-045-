public class Doctor extends HospitalMember {

    private String specialty;
    private int yearsOfExperience;

    public Doctor() {
        super();
        this.specialty = "unknown";
        this.yearsOfExperience = 0;
    }

    public Doctor(String name, int id) {
        super(name, id);
        this.specialty = "unknown";
        this.yearsOfExperience = 0;
    }

    public Doctor(String name, int id, String specialty, int yearsOfExperience) {
        super(name, id);
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getSpecialty() {
        return specialty;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void display() {
        super.display();
        System.out.println("Specialty: " + specialty);
        System.out.println("Years of Experience: " + yearsOfExperience);
    }

    public String toString() {
        return super.toString() + ", Doctor{specialty='" + specialty + "', yearsOfExperience=" + yearsOfExperience
                + "}";
    }

}
