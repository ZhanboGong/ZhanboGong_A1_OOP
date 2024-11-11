
public class GeneralPractitioner extends HealthProfessional {
    private boolean visitingServiceStatue;
    public GeneralPractitioner()
    {
        super();
    }
    public GeneralPractitioner(int id, String name, String officeAddress, boolean visitingServiceStatue)
    {
        super(id, name, officeAddress);
        this.visitingServiceStatue = visitingServiceStatue;
    }

    @Override
    public void printInformation()
    {
        System.out.println("================================");
        System.out.println("Health Professional Information");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Office Address: " + getOfficeAddress());
        System.out.println("Visiting Service Statue: " + visitingServiceStatue);
        System.out.println("================================");
        System.out.println();
        System.out.println("The printing is complete. Check the printing information!");
    }

    public boolean isVisitingService() {
        return visitingServiceStatue;
    }

    public void setVisitingService(boolean visitingServiceStatue) {
        this.visitingServiceStatue = visitingServiceStatue;
    }
}
