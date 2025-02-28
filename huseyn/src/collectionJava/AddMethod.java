package collectionJava;

public class AddMethod<T> {
    private int size;
    private Object[] array;
    private Integer defaultCapacity = 10;
    public Integer getSize() {
        return size;
    }

    public AddMethod(Integer capacity) {
        capacity = capacity == null ? defaultCapacity : capacity;
        array = new Object[capacity];
    }


    public void addElements(T numbers) {
        if (size == array.length) {
            Object[] arr = new Object[size + (size / 2)];
            for (int i = 0; i < array.length; i++) {
                arr[i] = array[i];
            }
            array = arr;
        }
        array[size++] = numbers;
    }

    public void printArr() {
        for (Object s : array) {
            System.out.print(s + " ");
        }
    }
}
