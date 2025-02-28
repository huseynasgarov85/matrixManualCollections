package collectionJava;

public class MyStack {
    private int index;
    public Integer defaultCapacity = 10;
    public Object[] array = new Object[defaultCapacity];
    public void fillArray(Integer value) {
        if (index >= array.length) {
            Object[] newArr = new Object[array.length + array.length / 2];
            for (int i = 0; i < array.length; i++) {
                newArr[i] = array[i];
            }
            array = newArr;
        }
        array[index++] = value;
    }
    public void popArray() {
        if (index >= 0)
            System.out.println(array[--index]);
    }
}
