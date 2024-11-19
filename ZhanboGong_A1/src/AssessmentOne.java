import java.util.ArrayList;

/**
 * This class demonstrates the management of appointments
 * Including creation, printing and deletion
 * Test the code in the main method
 *
 */
public class AssessmentOne {
    //
    private static final ArrayList<Appointment> appointments = new ArrayList<>();
    // Set the initial ID of Appointment to 1 and increment it each time a new Appointment is created
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
        // Part 5
        createAppointment("Zhanbo Gong", "1234567890", "11:00am-12:00am", generalPractitioner1);
        createAppointment("Bob", "2134658700", "3:00pm-4:00pm", generalPractitioner2);
        createAppointment("Jacob", "1387703323", "9:00am-10:00am", surgeon1);
        createAppointment("Li Tian", "1517777323", "5:00pm-6:00pm", surgeon2);
        printExistingAppointments();
        cancelBooking("1387703323");
        printExistingAppointments();
        System.out.println("------------------------------");

        // Other testing scripts
        /*
        surgeon1.recordSurgery("Jacob", "2024-12-12", "Building-No.6-South-404");
        surgeon1.recordSurgery("Alice", "2024-12-13", "Building-No.6-South-404");
        surgeon1.getSurgeryInformation("1");
        surgeon1.cancelSurgery("1");
        surgeon1.getSurgeryInformation("1");
         */

    }

    /**
     * Created appointment, and validation of the data entered is included in the Appointment class
     *
     * @param name: Represents the patient name in the Appointment
     * @param mobilePhone: Represents the patient mobile phone in the Appointment
     * @param timeSlot: Represents the time slot of the Appointment
     * @param healthProfessional: Represents the health professional of the Appointment
     */
    public static void createAppointment(String name, String mobilePhone, String timeSlot, HealthProfessional healthProfessional){
        Appointment appointment = new Appointment(appointmentIDCount++, name, mobilePhone, timeSlot,healthProfessional);
        appointments.add(appointment);
    }

    /**
     * Print all appointments' information
     */
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

    public static void printExistingAppointments(int appointmentID){
        boolean findingStatus = false;
        for(int i = appointments.size() - 1; i >= 0; i--){
            if(appointments.get(i).getAppointmentID() == appointmentID){
                appointments.get(i).printInformation();
                findingStatus = true;
                break;
            }
        }
        if(!findingStatus){
            System.out.println("Sorry, we can't find the reservation with the corresponding information. Please confirm your information again.");
        }
    }

    /**
     * Find all reservations with the same phone number and delete them.
     *
     * @param mobilePhone: Represents the patient mobile phone in the Appointment
     */
    public static void cancelBooking(String mobilePhone){
        boolean findingStatus = false;
        for(int i = appointments.size() - 1; i >= 0; i--){
            if(appointments.get(i).getMobilePhone().equals(mobilePhone)){
                Appointment appointment = appointments.get(i);
                appointments.remove(i);
                findingStatus = true;
                System.out.println("The appointment with ID " + appointment.getAppointmentID() + " and phone number " + mobilePhone + " has been deleted");
            }
        }
        if(!findingStatus){
            System.out.println("Sorry, we can't find the reservation with the corresponding information. Please confirm your information again.");
        }
    }

    public static int getAppointmentIDCount() {
        return appointmentIDCount;
    }

    public static void setAppointmentIDCount(int appointmentIDCount) {
        AssessmentOne.appointmentIDCount = appointmentIDCount;
    }
}
