public class DentistryPractitioner extends HealthProfessional{
    private Boolean correctTeeth;

    public DentistryPractitioner() {

    }

    public DentistryPractitioner(Integer id, String name, Integer age, Boolean correctTeeth) {
        super(id, name, age);
        this.correctTeeth = correctTeeth;

    }

    public Boolean getCorrectTeeth() {
        return correctTeeth;
    }

    public void setCorrectTeeth(Boolean correctTeeth) {
        this.correctTeeth = correctTeeth;
    }

    @Override
    public void work() {
        System.out.printf("Dentistry Practitioner is working\r\n");
    }

    @Override
    public void printBaseData() {
        super.printBaseData();
        System.out.printf("Dentistry Practitioner can correctTeeth:%s.\r\n",
                correctTeeth ?"yes":"no");
    }

    @Override
    public String toString() {
        return String.format("Dentistry Practitioner id:%d name:%s",this.id,this.name);
    }
}
