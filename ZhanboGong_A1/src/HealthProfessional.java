public abstract class HealthProfessional {
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
    public abstract void printInformation();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id < 0){
            System.out.println("Wrong Input: The ID must be a positive integer!");
        }
        else{
            this.id = id;
            System.out.println("The ID is successfully set to " + id);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            System.out.println("Wrong Input: Name cannot be empty and null!");
        }
        else{
            this.name = name;
            System.out.println("The name is successfully set to " + name);
        }
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        if(officeAddress == null || officeAddress.trim().isEmpty()){
            System.out.println("Wrong Input: Office Address cannot be empty and null");
        }
        else{
            this.officeAddress = officeAddress;
            System.out.println("The Office Address is successfully set to " + officeAddress);
        }
    }
}
