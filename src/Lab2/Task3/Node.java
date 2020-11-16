package Lab2.Task3;

public class Node<V> {
    private V value; // generic variable with node value
    private Node next; // link for next node
    private Node previous; // link for previous node

    //constructors
    public Node() {
    }

    public  Node(V value, Node next, Node previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    //getters and setters
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}