public class GeneralPractitioner extends HealthProfessional{
    private Boolean responseQuickly;
    private Boolean canWorkAtNight;

    public GeneralPractitioner() {

    }

    public GeneralPractitioner(Integer id, String name, Integer age, Boolean responseQuickly, Boolean canWorkAtNight) {
        super(id, name, age);
        this.responseQuickly = responseQuickly;
        this.canWorkAtNight = canWorkAtNight;
    }

    @Override
    public void work() {
        System.out.printf("General Practitioner is working\r\n");
    }



    @Override
    public void printBaseData() {
        super.printBaseData();
        System.out.printf("General Practitioner can Response Quickly:%s and Work At Night:%s.\r\n",
                responseQuickly ?"yes":"no",
                canWorkAtNight?"yes":"no");
    }

    public Boolean getResponseQuickly() {
        return responseQuickly;
    }

    public Boolean getCanWorkAtNight() {
        return canWorkAtNight;
    }

    public void setResponseQuickly(Boolean responseQuickly) {
        this.responseQuickly = responseQuickly;
    }

    public void setCanWorkAtNight(Boolean canWorkAtNight) {
        this.canWorkAtNight = canWorkAtNight;
    }

    @Override
    public String toString() {
        return String.format("General Practitioner id:%d name:%s",this.id,this.name);
    }
}
