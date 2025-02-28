package collectionJava;

public class Node<E> {
    E item;
    Node<E> next;
    Node<E> previos;

    public Node(Node<E> previos, E item, Node<E> next) {
        this.item = item;
        this.next = next;
        this.previos = previos;
    }
}
