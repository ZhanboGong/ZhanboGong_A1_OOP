public class Surgeon extends HealthProfessional{
    private String surgicalField;
    public Surgeon()
    {
        super();
    }
    public Surgeon(int id, String name, String officeAddress, String surgicalField)
    {
        super(id, name, officeAddress);
        this.surgicalField = surgicalField;
    }
    @Override
    public void printInformation()
    {
        System.out.println("================================");
        System.out.println("Health Professional Information");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Office Address: " + getOfficeAddress());
        System.out.println("Surgical Field: " + surgicalField);
        System.out.println("================================");
        System.out.println();
        System.out.println("The printing is complete. Check the printing information!");
    }

    public String getSurgicalField() {
        return surgicalField;
    }

    public void setSurgicalField(String surgicalField) {
        if(surgicalField == null || surgicalField.trim().isEmpty()){
            System.out.println("Wrong Input: Surgical Field cannot be empty and null!");
        }
        else{
            this.surgicalField = surgicalField;
            System.out.println("The Surgical Field is successfully set to " + surgicalField);
        }
    }
}
