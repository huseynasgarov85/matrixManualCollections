package collectionJava;

public class MyLinkedList<E> {
    int size;
    Node<E> last;
    Node<E> first;


    public void addList(E element) {
        Node<E> l = last;
        Node<E> newNode = new Node<>(l, element, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        System.out.print(element+" ");
    }


}
