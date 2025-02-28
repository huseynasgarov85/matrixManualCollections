package lambdaExp;

public class Student {
   private Integer age;
   private Double score;
   private String  name;
   private Integer course;
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Student(Integer age, Double score, String name, Integer course) {
        this.age = age;
        this.score = score;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
