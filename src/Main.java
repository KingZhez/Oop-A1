import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    private static final List<Appointment> list = new ArrayList<>();

    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        DentistryPractitioner d1 = new DentistryPractitioner(1, "D1", 30, true);
        DentistryPractitioner d2 = new DentistryPractitioner(2, "D2", 24, false);
        GeneralPractitioner g3 = new GeneralPractitioner(3, "G3", 27, true, true);
        GeneralPractitioner g4 = new GeneralPractitioner(4, "G4", 45, false, false);
        GeneralPractitioner g5 = new GeneralPractitioner(5, "G5", 49, false, false);
        d1.printBaseData();
        d2.printBaseData();
        g3.printBaseData();
        g4.printBaseData();
        g5.printBaseData();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        createAppointment("Mike1", "1234", 12, "08:00", d1);
        createAppointment("A33", "1237", 33, "09:00", d2);
        createAppointment("D88", "1210", 13, "10:00", g4);
        createAppointment("U2", "1213", 66, "16:00", g5);
        printExistingAppointments();
        cancelBooking("1213");
        cancelBooking("aaa");
        System.out.println("------------------------------");
    }

    private static void cancelBooking(String phone) {
        Iterator<Appointment> iterator = list.iterator();
        while (iterator.hasNext()) {
            Appointment next = iterator.next();
            if (next.getPhone().equals(phone)){
                iterator.remove();
                System.out.printf("The patient %s cancel the appointment.\r\n",phone);
                return;
            }
        }
        System.out.printf("The patient with mobile phone number %s was not found.\r\n",phone);
    }

    private static void printExistingAppointments() {
        for (Appointment appointment : list) {
            appointment.print();
        }
    }

    private static Appointment createAppointment(String patientName, String phone, Integer age, String dateFromTo, HealthProfessional doctor) {
        Appointment appointment = new Appointment(patientName, phone, age, dateFromTo, doctor);
        list.add(appointment);
        return appointment;
    }
}