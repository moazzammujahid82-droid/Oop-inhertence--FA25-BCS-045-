public class HospitalMember {

    private String name;
    private int id;

    public HospitalMember() {
        this.name = "unknown";
        this.id = 0;
    }

    public HospitalMember(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}