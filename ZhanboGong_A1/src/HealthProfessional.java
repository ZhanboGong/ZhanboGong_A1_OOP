/**
 * The parent abstract class HealthProfessional
 * Contains the basic attributes id, name and office address
 * It provides empty and parameter constructors, as well as getters and setters to validate and read data.
 * Contains an abstract method, printInformation, for subclasses to override
 */
public abstract class HealthProfessional {
    // Represents the ID of the Health Professional(Private properties)
    private int id;
    // Represents the name of the Health Professional(Private properties)
    private String name;
    // Represents the office address of the Health Professional(Private properties)
    private String officeAddress;
    // No-argument constructors
    public HealthProfessional()
    {}

    /**
     * A parameter constructor that initializes basic information and creates objects
     *
     * @param id: Represents the ID of the Health Professional
     * @param name: Represents the name of the Health Professional
     * @param officeAddress: Represents the office address of the Health Professional
     */
    public HealthProfessional(int id, String name, String officeAddress)
    {
        setId(id);
        setName(name);
        setOfficeAddress(officeAddress);
    }

    /**
     * The abstract method can be overridden by subclasses to print information about Health Professional
     */
    public abstract void printInformation();

    // Used to get a health professional id
    public int getId() {
        return id;
    }

    /**
     * Used to set the new id and verify that the id is not null and is a positive integer
     *
     * @param id: Health professional id
     */
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

    // Used to get a health professional name
    public String getName() {
        return name;
    }

    /**
     * Used to set the new name and verify that the name is not null and empty
     *
     * @param name: Health professional name
     */
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

    // Used to get a health professional office address
    public String getOfficeAddress() {
        return officeAddress;
    }

    /**
     * Used to set the new office address and verify that the office address is not null and empty
     *
     * @param officeAddress: Health professional office address
     */
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
