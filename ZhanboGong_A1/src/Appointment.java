/**
 * Appointment is used to represent basic information about an appointment
 * including the appointment id, patient name, patient phone number, appointment time, and doctor
 */
public class Appointment {
    // Represents the ID of the Appointment
    private int appointmentID;
    // Represents the patient name in the Appointment
    private String patientName;
    // Represents the patient mobile phone in the Appointment
    private String mobilePhone;
    // Represents the time slot of the Appointment
    private String timeSlot;
    // Represents the health professional of the Appointment
    private HealthProfessional healthProfessional;

    // No-argument constructors
    public Appointment() {}

    /**
     *
     * @param appointmentID: Represents the appointment id of the Appointment
     * @param patientName: Represents the patient name in the Appointment
     * @param mobilePhone: Represents the patient mobile phone in the Appointment
     * @param timeSlot: Represents the time slot of the Appointment
     * @param healthProfessional: Represents the health professional in the Appointment
     */
    public Appointment(int appointmentID, String patientName, String mobilePhone, String timeSlot, HealthProfessional healthProfessional) {
        this.appointmentID = appointmentID;
        setName(patientName);
        setMobilePhone(mobilePhone);
        setTimeSlot(timeSlot);
        setHealthProfessional(healthProfessional);
    }

    /**
     * print information about Appointment
     */
    public void printInformation()
    {
        System.out.println("================================");
        System.out.println("Appointment ID: " + appointmentID);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor: " + healthProfessional.getName());
        System.out.println("================================");
        System.out.println();
        System.out.println("The printing is complete. Check the printing information!");
    }

    // Used to get a patient name
    public String getName() {
        return patientName;
    }

    /**
     * Used to set the new name and verify that the name is not null and empty
     *
     * @param patientName: Represents the patient name in the Appointment
     */
    public void setName(String patientName) {
        if(patientName== null || patientName.trim().isEmpty()){
            if(this.patientName == null){
                System.out.println("Wrong Input: Patient Name cannot be empty and null! The current name is set to 'To be set'");
                this.patientName = "To be set";
            }
            else{
                System.out.println("Wrong Input: Name cannot be empty and null! Name update failed, current name is " + this.patientName);
            }
        }
        else{
            this.patientName = patientName;
            System.out.println("The name is successfully set to " + patientName);
        }
    }

    // Used to get a patient mobile phone
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Make sure the phone number conforms to the format (10 digits) and is not null or empty
     * @param mobilePhone: Represents the patient mobile phone in the Appointment
     */
    public void setMobilePhone(String mobilePhone) {
        if(mobilePhone == null || mobilePhone.trim().isEmpty()){
            System.out.println("Wrong Input: Mobile Phone cannot be empty and null!");
            return;
        }
        if(mobilePhone.trim().length() != 10){
            System.out.println("Wrong Input: Phone number format must conform to specifications (10 digits)!");
            return;
        }
        for(int i = 0; i < mobilePhone.length(); i++){
            if(!Character.isDigit(mobilePhone.charAt(i))){
                System.out.println("Wrong Input: Phone number must be positive integer!");
                return;
            }
        }
        this.mobilePhone = mobilePhone;
        System.out.println("The mobile phone number is successfully set to " + mobilePhone);
    }

    // Used to get a patient mobile phone
    public String getTimeSlot() {
        return timeSlot;
    }

    /**
     * Represents the time slot of the Appointment
     * @param timeSlot: Represents the time slot of the Appointment
     */
    public void setTimeSlot(String timeSlot) {
        if(timeSlot == null || timeSlot.trim().isEmpty()){
            System.out.println("Wrong Input: Time Slot cannot be empty and null!");
            return;
        }
        this.timeSlot = timeSlot;
        System.out.println("The Time Slot is successfully set to " + timeSlot);
    }

    // Used to get a HealthProfessional Object
    public HealthProfessional getHealthProfessional() {
        return healthProfessional;
    }

    /**
     * Used to set the new object and verify that the object is not null
     * @param healthProfessional: Represents the health professional in the Appointment
     */
    public void setHealthProfessional(HealthProfessional healthProfessional) {
        if(healthProfessional == null){
            System.out.println("Wrong Input: The medical staff lacks necessary information!");
        }
        else{
            this.healthProfessional = healthProfessional;
            System.out.println("The Health Professional is successfully set to " + healthProfessional.getName());
        }
    }

    // Used to get an appointment ID
    public int getAppointmentID(){
        return appointmentID;
    }

    /**
     * Override the toString method
     *
     * @return Appointment ID and patient name
     */
    @Override
    public String toString(){
        return "ID: " + appointmentID + " | " + "Patient Name: " + patientName + " | " + "Mobile Phone: " + mobilePhone;
    }
}
