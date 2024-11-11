public class HealthProfessional {
    private int id;
    private String name;
    private String officeAddress;
    public HealthProfessional()
    {}
    public HealthProfessional(int id, String name, String officeAddress)
    {
        this.id = id;
        this.name = name;
        this.officeAddress = officeAddress;
    }
    public void printInformation()
    {
        System.out.println("================================");
        System.out.println("Health Professional Information");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Office Address: " + officeAddress);
        System.out.println("================================");
        System.out.println();
        System.out.println("The printing is complete. Check the printing information!");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }
}
