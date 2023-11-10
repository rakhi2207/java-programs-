package LinkedList.singlyLinkedList;

public class TraversingSLL {

    private Node head = null;
    public static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        //Creating the Node
        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);

//        Chaining the node.
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

//        Printing the node.
        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;

        }
    }
}
