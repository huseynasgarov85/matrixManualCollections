package mentorAnnotation;

@MyClassAnnotation()
public class Annotation {
    @MyFieldAnnotation(size = 1)
    private Integer size;

    @MyFieldAnnotation(value = "")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @MyMethodAnnotation(max = 3)
    public static void myAnnotation(){
        System.out.println("method runing");
    }

    @Override
    public String toString() {
        return "Annotation{" +
                "size=" + size +
                ", value='" + value + '\'' +
                '}';
    }
}
