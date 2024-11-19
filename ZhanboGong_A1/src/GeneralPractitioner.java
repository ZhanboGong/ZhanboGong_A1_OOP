/**
 * The GeneralPractitioner class inherits from the abstract class HealthProfessional
 * The attribute visiting service status belonging to General Practitioner is extended
 * It provides empty and parameter constructors, as well as getters and setters to validate and read data.
 * Override the printInformation method
 */
public class GeneralPractitioner extends HealthProfessional {
    // Represents the visiting service status of the General Practitioner(Private properties)
    private boolean visitingServiceStatus;
    // Describe the type of the doctor as "General Practitioner"
    private final String professionalType = "General Practitioner";
    // No-argument constructors
    public GeneralPractitioner()
    {
        super();
    }

    /**
     * A parameter constructor that initializes basic information and creates objects
     *
     * @param id: Represents the ID of the General Practitioner
     * @param name: Represents the name of the General Practitioner
     * @param officeAddress: Represents the office address of the General Practitioner
     * @param visitingServiceStatus: Represents the visiting service status of the General Practitioner
     */
    public GeneralPractitioner(int id, String name, String officeAddress, boolean visitingServiceStatus)
    {
        super(id, name, officeAddress);
        this.visitingServiceStatus = visitingServiceStatus;
    }

    /**
     * Override the abstract method printInformation to print information about the General Practitioner object
     */
    @Override
    public void printInformation()
    {
        System.out.println("================================");
        System.out.println("Health Professional Information");
        System.out.println("ID: " + getId());
        System.out.println("Type: " + professionalType);
        System.out.println("Name: " + getName());
        System.out.println("Office Address: " + getOfficeAddress());
        System.out.println("Visiting Service Statue: " + visitingServiceStatus);
        System.out.println("================================");
        System.out.println("The printing is complete. Check the printing information!");
        System.out.println();
    }

    // Used to get a general practitioner visiting service
    public boolean isVisitingService() {
        return visitingServiceStatus;
    }

    /**
     * Update and verify that the state is the same as before
     *
     * @param visitingServiceStatus: General practitioner visiting service status
     */
    public void setVisitingService(boolean visitingServiceStatus) {
        if(this.visitingServiceStatus == visitingServiceStatus){
            System.out.println("This state is already " + visitingServiceStatus);
        }
        else{
            this.visitingServiceStatus = visitingServiceStatus;
            System.out.println("The status is successfully set to " + visitingServiceStatus);
        }
    }

    // Used to get a doctor professional type(general practitioner)
    public String getProfessionalType(){
        return professionalType;
    }

    /**
     * Override the toString method
     *
     * @return Doctor ID and name
     */
    @Override
    public String toString(){
        return "ID: " + getId() + "|" + "Name：" + getName();
    }
}
