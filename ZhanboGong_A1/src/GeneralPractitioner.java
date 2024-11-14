public class GeneralPractitioner extends HealthProfessional {
    private boolean visitingServiceStatus;
    private final String professionalType = "General Practitioner";
    public GeneralPractitioner()
    {
        super();
    }
    public GeneralPractitioner(int id, String name, String officeAddress, boolean visitingServiceStatus)
    {
        super(id, name, officeAddress);
        this.visitingServiceStatus = visitingServiceStatus;
    }

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

    public boolean isVisitingService() {
        return visitingServiceStatus;
    }

    public void setVisitingService(boolean visitingServiceStatus) {
        this.visitingServiceStatus = visitingServiceStatus;
        System.out.println("The Visiting Service Status is successfully set to " + visitingServiceStatus);
    }

    public String getProfessionalType(){
        return professionalType;
    }

    @Override
    public String toString(){
        return "ID: " + getId() + "|" + "Name：" + getName();
    }
}
