public abstract class HealthProfessional {
    private int id;
    private String name;
    private String officeAddress;
    public HealthProfessional()
    {}
    public HealthProfessional(int id, String name, String officeAddress)
    {
        setId(id);
        setName(name);
        setOfficeAddress(officeAddress);
    }
    public abstract void printInformation();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id <= 0){
            if(this.id == 0){
                System.out.println("Wrong Input: The ID must be a positive integer! The current ID is set to 0");
            }
            else{
                System.out.println("Wrong Input: The ID must be a positive integer! ID update failed, current ID is " + this.id);
            }
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
            if(this.name == null){
                System.out.println("Wrong Input: Name cannot be empty and null! The current name is set to 'To be set'");
                this.name = "To be set";
            }
            else{
                System.out.println("Wrong Input: Name cannot be empty and null! Name update failed, current name is " + this.name);
            }
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
            if(this.officeAddress == null){
                System.out.println("Wrong Input: Office Address cannot be empty and null! The current office address is set to 'To be set'");
                this.officeAddress = "To be set";
            }
            else{
                System.out.println("Wrong Input: Office Address cannot be empty and null! Office Address update failed, current office address is " + this.officeAddress);
            }
        }
        else{
            this.officeAddress = officeAddress;
            System.out.println("The Office Address is successfully set to " + officeAddress);
        }
    }
}
