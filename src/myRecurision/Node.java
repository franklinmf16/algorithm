package myRecurision;

public class Node {
    private final int value;
    private Node pointer;

    public Node(int value) {
        this.value = value;
        this.pointer = null;
    }

    public int getValue() {
        return value;
    }

    public Node getPointer() {
        return pointer;
    }

    public void setPointer(Node pointer) {
        this.pointer = pointer;
    }
}
