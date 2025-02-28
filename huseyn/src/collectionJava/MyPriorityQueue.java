package collectionJava;

public class MyPriorityQueue {
    private int index;
    private int polIndex;
    public Integer defaultCapacity = 10;
    public Integer[] array = new Integer[defaultCapacity];


    public void fillArray(Integer value) {
        if (index >= array.length) {
            Integer[] newArr = new Integer[array.length + array.length / 2];
            for (int i = 0; i < array.length; i++) {
                newArr[i] = array[i];
            }
            array = newArr;
        }
        array[index++] = value;
        int temp;
        for (int i = 0; i < index -1 ; i++) {
            for (int j = 0; j < index - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public int polArray() {
        return array[polIndex++];
    }
}
