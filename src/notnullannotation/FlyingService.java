package notnullannotation;

public class FlyingService {
    @NotNullAnnotation(check = 5)
    private String name;
    @NotNullAnnotation(check=7)
    private String passportFin;
    private  String age;

    public FlyingService(String name, String passportFin, String age) {
        this.name = name;
        this.passportFin = passportFin;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportFin() {
        return passportFin;
    }

    public void setPassportFin(String passportFin) {
        this.passportFin = passportFin;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "FlyingService{" +
                "name='" + name + '\'' +
                ", passportFin='" + passportFin + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
