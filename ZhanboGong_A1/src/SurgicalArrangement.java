/**
 * This interface defines the relevant methods for recording the surgery
 * This includes recording the operation, deleting the operation record, and viewing the operation record
 */
public interface SurgicalArrangement {

    /**
     * Record the basic information of the operation
     *
     * @param patient： patient name
     * @param date: date of surgery
     * @param address: address of surgery
     */
    public void recordSurgery(String patient, String date, String address);

    /**
     * Deletion of surgical records
     *
     * @param surgeryID： A unique identifier that identifies the surgery
     */
    public void cancelSurgery(String surgeryID);

    /**
     * View surgical records
     *
     * @param surgeryID： A unique identifier that identifies the surgery
     */
    public void getSurgeryInformation(String surgeryID);

}