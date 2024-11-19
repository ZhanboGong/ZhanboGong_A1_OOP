import java.util.ArrayList;

/**
 * The Surgeon class inherits from the abstract class HealthProfessional, the SurgicalArrangement interface is implemented
 * The attribute visiting service status belonging to Surgeon is extended
 * It provides empty and parameter constructors, as well as getters and setters to validate and read data.
 * Override the printInformation method and the methods in interfaces
 */
public class Surgeon extends HealthProfessional implements SurgicalArrangement{
    // It is used to store surgical records
    private final ArrayList<String> surgerys = new ArrayList<>();
    // Unique identifiers for surgical records to facilitate automatic incrementing
    private int surgeryID = 1;
    // Describe the type of the doctor as "Surgeon"
    private final String professionalType = "Surgeon";
    // Represents the surgical field of the Surgeon(Private properties)
    private String surgicalField;
    // No-argument constructors
    public Surgeon()
    {
        super();
    }

    /**
     *
     * @param id: Represents the ID of the Surgeon
     * @param name: Represents the name of the Surgeon
     * @param officeAddress: Represents the office address of the Surgeon
     * @param surgicalField: Represents the surgical field of the Surgeon
     */
    public Surgeon(int id, String name, String officeAddress, String surgicalField)
    {
        super(id, name, officeAddress);
        setSurgicalField(surgicalField);
    }

    /**
     * Override the recordSurgery method in the Surgical Arrangement interface
     * @param patient： patient name
     * @param date: date of surgery
     * @param address: address of surgery
     */
    @Override
    public void recordSurgery(String patient, String date, String address){
        String surgeryRecord = surgeryID++ + ":" + patient + " underwent surgery in the " + address + " on " + date + ".";
        surgerys.add(surgeryRecord);
        System.out.println("The surgery record was added successfully!");
    }

    /**
     * Override the cancelSurgery method in the Surgical Arrangement interface
     * @param surgeryID： A unique identifier that identifies the surgery
     */
    @Override
    public void cancelSurgery(String surgeryID){
        boolean findingStatus = false;
        for(int i = 0; i < surgerys.size(); i++){
            if(surgerys.get(i).split(":")[0].equals(surgeryID)){
                surgerys.remove(i);
                findingStatus = true;
                System.out.println("The surgical record with ID " + surgeryID + " has been deleted");
                break;
            }
        }
        if(!findingStatus){
            System.out.println("Sorry, no operation record with id " +  surgeryID  + " was found");
        }
    }

    /**
     * Override the getSurgeryInformation method in the Surgical Arrangement interface
     * @param surgeryID： A unique identifier that identifies the surgery
     */
    @Override
    public void getSurgeryInformation(String surgeryID){
        boolean findingStatus = false;
        for(int i = 0; i < surgerys.size(); i++){
            if(surgerys.get(i).split(":")[0].equals(surgeryID)){
                System.out.println(surgerys.get(i));
                findingStatus = true;
                break;
            }
        }
        if(!findingStatus){
            System.out.println("Sorry, no operation record with id " +  surgeryID  + " was found");
        }
    }

    /**
     * Override the abstract method printInformation to print information about the Surgeon object
     */
    @Override
    public void printInformation()
    {
        System.out.println("================================");
        System.out.println("Health Professional Information(Surgeon)");
        System.out.println("ID: " + getId());
        System.out.println("Type: " + professionalType);
        System.out.println("Name: " + getName());
        System.out.println("Office Address: " + getOfficeAddress());
        System.out.println("Surgical Field: " + surgicalField);
        System.out.println("================================");
        System.out.println("The printing is complete. Check the printing information!");
        System.out.println();
    }

    // Used to get a Surgeon surgical field
    public String getSurgicalField() {
        return surgicalField;
    }

    /**
     * Used to set the new surgical field and verify that the surgical field is not null and empty
     * @param surgicalField: Represents the surgical field of the Surgeon
     */
    public void setSurgicalField(String surgicalField) {
        if(surgicalField == null || surgicalField.trim().isEmpty()){
            if(this.surgicalField == null){
                System.out.println("Wrong Input: Surgical Field cannot be empty and null! The current surgical field is set to 'To be set'");
                this.surgicalField = "To be set";
            }
            else{
                System.out.println("Wrong Input: Surgical Field cannot be empty and null! Surgical Field update failed, current surgical field is " + this.surgicalField);
            }
        }
        else{
            this.surgicalField = surgicalField;
            System.out.println("The Surgical Field is successfully set to " + surgicalField);
        }
    }

    // Used to get the professional type(Surgeon)
    public String getProfessionalType(){
        return professionalType;
    }

    /**
     * Override the toString method
     * @return surgeon id and surgeon name
     */
    @Override
    public String toString(){
        return "ID: " + getId() + "|" + "Name：" + getName();
    }
}
