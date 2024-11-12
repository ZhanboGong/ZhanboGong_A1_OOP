public class AssessmentOne {
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
}
