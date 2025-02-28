package collectionJava;

import java.util.Arrays;

public class HashSetTask {
    private int size;
    private int index;
    private Integer defaultCapacity = 16;
    private Object[] array = new Object[defaultCapacity];
    Node last;
    Node first;

    public void fillInHashSet(Integer number) {
        Integer index = findIndex(number);
        Integer tempt = 0;
        Object[] arr = new Object[defaultCapacity];
        arr[tempt++] = index;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    nodeLinkedList(number);
                } else {
                    array[index] = number;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public Integer findIndex(Integer value) {
        return (defaultCapacity - 1) & (value ^ (value >>> defaultCapacity));
    }

    public void nodeLinkedList(Integer element) {
        Node l = last;
        Node newNode = new Node(l, element, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }
}
