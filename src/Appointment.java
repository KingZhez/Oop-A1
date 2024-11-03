public class Appointment {
    private String patientName;
    private String phone;
    private Integer age;

    private String dateFromTo;
    private HealthProfessional doctor;

    public Appointment() {
    }

    public Appointment(String patientName, String phone, Integer age, String dateFromTo, HealthProfessional doctor) {
        this.patientName = patientName;
        this.phone = phone;
        this.dateFromTo = dateFromTo;
        this.age = age;
        this.doctor = doctor;
    }

    public void print(){
        System.out.printf("Patient Name:%s phone:%s age:%d will meet %s at %s.\r\n",
                this.patientName,this.phone,this.age,this.doctor,this.dateFromTo);
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPhone() {
        return phone;
    }

    public Integer getAge() {
        return age;
    }

    public String getDateFromTo() {
        return dateFromTo;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }
}
