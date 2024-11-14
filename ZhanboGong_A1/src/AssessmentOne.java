import java.util.ArrayList;

public class AssessmentOne {
    private static ArrayList<HealthProfessional> healthProfessionals = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    private static int appointmentIDCount = 1;
    public static void main(String[] args) {
        // Part 3 - Using classes and objects
        GeneralPractitioner generalPractitioner1 = new GeneralPractitioner(1, "John", "Building-No.6-North-301", true);
        GeneralPractitioner generalPractitioner2 = new GeneralPractitioner(2, "Mark", "Building-N0.6-North-303", false);
        GeneralPractitioner generalPractitioner3 = new GeneralPractitioner(3, "Caleb", "Building-No.6-South-302",true);
        Surgeon surgeon1 = new Surgeon(33, "Peter", "Building-No.2-East-401", "Orthopedic Surgery");
        Surgeon surgeon2 = new Surgeon(41, "Alice", "Building-No.2-West-404", "Neurosurgery");
        generalPractitioner1.printInformation();
        generalPractitioner2.printInformation();
        generalPractitioner3.printInformation();
        surgeon1.printInformation();
        surgeon2.printInformation();
        System.out.println("------------------------------");
    }
    public static void createAppointment(String name, String mobilePhone, String timeSlot, HealthProfessional healthProfessional){
        //判断是否符合标准
        Appointment appointment = new Appointment(appointmentIDCount++, name, mobilePhone, timeSlot,healthProfessional);
        appointments.add(appointment);
    }

    public static void printExistingAppointments(){
        if(appointments.isEmpty()){
            System.out.println("The appointment list is empty!");
        }
        else{
            for (Appointment appointment : appointments) {
                appointment.printInformation();
            }
        }
    }

    public static void cancelBooking(String mobilePhone){
        for(int i = appointments.size() - 1; i >= 0; i--){
            if(appointments.get(i).getMobilePhone().equals(mobilePhone)){
                Appointment appointment = appointments.get(i);
                appointments.remove(i);
                System.out.println("The appointment with ID " + appointment.getAppointmentID() + " and phone number " + mobilePhone + " has been deleted");
            }
            else{
                System.out.println("Sorry, we can't find the reservation with the corresponding information. Please confirm your information again.");
            }
        }
    }

    public static ArrayList<HealthProfessional> getHealthProfessionals() {
        return healthProfessionals;
    }

    public static void setHealthProfessionals(ArrayList<HealthProfessional> healthProfessionals) {
        AssessmentOne.healthProfessionals = healthProfessionals;
    }

    public static ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public static void setAppointments(ArrayList<Appointment> appointments) {
        AssessmentOne.appointments = appointments;
    }

    public static int getAppointmentIDCount() {
        return appointmentIDCount;
    }

    public static void setAppointmentIDCount(int appointmentIDCount) {
        AssessmentOne.appointmentIDCount = appointmentIDCount;
    }
}
