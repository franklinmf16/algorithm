package myRecurision;

import java.util.List;

public class MyLinkedList {

    public static Node createLinkedList(List<Integer> data){

        if (data.isEmpty()){
            return null;
        }

        Integer value = data.get(0);
        Node firstNode = new Node(value);
        firstNode.setPointer(createLinkedList(data.subList(1,data.size())));
        return firstNode;
    }

    /**
     *
     * @param firstNode
     * @return last node that is not null as a first node
     */
    public static Node getLastNode(Node firstNode){
        while (firstNode.getPointer()!= null){
            firstNode = firstNode.getPointer();
        }
        return firstNode;
    }

    public static Node getPreviousNode(Node firstNode){
        if (firstNode.getPointer()==null){
            return null;
        }

        while (firstNode.getPointer().getPointer()!= null){
            firstNode = firstNode.getPointer();
        }
        return firstNode;
    }

    public static Node change(Node firstNode){

        if (firstNode.getPointer() == null){
            return firstNode;
        }

        Node previousNode = getPreviousNode(firstNode);
        Node theNode = previousNode.getPointer();
        theNode.setPointer(previousNode);
        previousNode.setPointer(null);
        change(firstNode);
        return theNode;

    }


    public static Node changeVersionTwo(Node firstNode){
        if (firstNode == null){
            return null;
        }

        if (firstNode.getPointer() == null){
            return firstNode;
        }

        Node newNode = changeVersionTwo(firstNode.getPointer());
        firstNode.getPointer().setPointer(firstNode);
        firstNode.setPointer(null);
        return newNode;
    }

    public static void printLinkedList(Node firstNode){
        while (firstNode != null){
            System.out.println(firstNode.getValue());
            firstNode = firstNode.getPointer();
        }
    }


//    public static Node change(Node firstNode){
//
//        Node previousNode = firstNode;
//        getLastNode(firstNode).
//
//    }

}
