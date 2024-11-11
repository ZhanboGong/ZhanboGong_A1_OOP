public class Appointment {
    private String name;
    private String mobilePhone;
    private String timeSlot;
    private HealthProfessional healthProfessional;

    public Appointment()
    {

    }
    public Appointment(String name, String mobilePhone, String timeSlot, HealthProfessional healthProfessional) {
        this.name = name;
        this.mobilePhone = mobilePhone;
        this.timeSlot = timeSlot;
        this.healthProfessional = healthProfessional;
    }

    public void printInformation()
    {
        System.out.println("================================");
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
        this.name = name;
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
}
