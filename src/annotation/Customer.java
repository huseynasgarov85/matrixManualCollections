package annotation;

public class Customer {
    private String name;
    private String age;
    @Length(min=6,max=8)
    private String finCode;

    public Customer(String name, String age, String finCode) {
        this.name = name;
        this.age = age;
        this.finCode = finCode;
    }

    public String getFinCode() {
        return finCode;
    }

    public void setFinCode(String finCode) {
        this.finCode = finCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", finCode='" + finCode + '\'' +
                '}';
    }
}
