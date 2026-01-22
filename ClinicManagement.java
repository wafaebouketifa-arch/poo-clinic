public class ClinicManagement {
    public static void main(String[] args) {

        Patient p1 = new Patient(1, "Ahmed Ali", 25, "0551234567");
        Doctor d1 = new Doctor(1, "Dr. Salim", "Cardiology");

        Appointment a1 = new Appointment(p1, d1, "18/01/2026");

        System.out.println("=== Medical Clinic Management ===");
        p1.displayInfo();
        System.out.println();
        d1.displayInfo();
        System.out.println();
        a1.displayInfo();
    }
}