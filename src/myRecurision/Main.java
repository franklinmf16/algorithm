package myRecurision;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Node fistNode = MyLinkedList.createLinkedList(Arrays.asList(1, 2, 3));
        Node twoNode = MyLinkedList.createLinkedList(Arrays.asList(1,2));

        System.out.println(fistNode.getValue());

        Node getNode = MyLinkedList.getLastNode(fistNode);
        System.out.println(getNode.getValue());

        Node previousNode = MyLinkedList.getPreviousNode(twoNode);
        System.out.println(previousNode.getValue());

        MyLinkedList.printLinkedList(fistNode);
        Node changedNode = MyLinkedList.change(fistNode);
        MyLinkedList.printLinkedList(changedNode);
        Node secondChanges = MyLinkedList.changeVersionTwo(changedNode);
        MyLinkedList.printLinkedList(secondChanges);








    }
}
