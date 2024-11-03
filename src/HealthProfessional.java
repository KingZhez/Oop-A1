public abstract class HealthProfessional {
    protected Integer id;
    protected String name;

    protected Integer age;

    public HealthProfessional() {
    }

    public HealthProfessional(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    protected void printBaseData(){
        System.out.printf("id:%d name:%s age:%d  ",this.id,this.name,this.age);
    }

    public abstract void work();

    @Override
    public String toString() {
        return "HealthProfessional{id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
