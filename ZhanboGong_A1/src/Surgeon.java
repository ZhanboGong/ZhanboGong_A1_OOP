import java.util.ArrayList;

public class Surgeon extends HealthProfessional implements SurgicalArrangement{
    private final ArrayList<String> surgerys = new ArrayList<>();
    private int surgeryID = 1;
    private final String professionalType = "Surgeon";
    private String surgicalField;
    public Surgeon()
    {
        super();
    }
    public Surgeon(int id, String name, String officeAddress, String surgicalField)
    {
        super(id, name, officeAddress);
        setSurgicalField(surgicalField);
    }

    @Override
    public void recordSurgery(String patient, String date, String address){
        String surgeryRecord = surgeryID++ + ":" + patient + " underwent surgery in the " + address + " on " + date + ".";
        surgerys.add(surgeryRecord);
        System.out.println("The surgery record was added successfully!");
    }

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

    public String getSurgicalField() {
        return surgicalField;
    }

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

    public String getProfessionalType(){
        return professionalType;
    }

    @Override
    public String toString(){
        return "ID: " + getId() + "|" + "Name：" + getName();
    }
}
