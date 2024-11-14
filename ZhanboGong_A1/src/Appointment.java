public class Appointment {
    private int appointmentID;
    private String name;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional healthProfessional;

    public Appointment()
    {

    }
    public Appointment(int appointmentID, String name, String mobilePhone, String timeSlot, HealthProfessional healthProfessional) {
        this.appointmentID = appointmentID;
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.healthProfessional = healthProfessional;
    }

    public void printInformation()
    {
        System.out.println("================================");
        System.out.println("Appointment ID " + appointmentID);
        System.out.println("Patient Name: " + name);
        System.out.println("Mobile Phone: " + mobilePhone);
        System.out.println("Doctor: " + healthProfessional.getName());
        System.out.println("================================");
        System.out.println();
        System.out.println("The printing is complete. Check the printing information!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            System.out.println("Wrong Input: name cannot be empty and null!");
        }
        else{
            System.out.println("The name is successfully set to " + name);
            this.name = name;
        }
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public HealthProfessional getHealthProfessional() {
        return healthProfessional;
    }

    public void setHealthProfessional(HealthProfessional healthProfessional) {
        this.healthProfessional = healthProfessional;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

}
