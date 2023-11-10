package LinkedList.singlyLinkedList;

public class InsertAtBegin {
    private Node head;

    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    private void InsertBegin(int data){
        Node newNode = new Node(data);
        Node temp = head;

        if(head == null){
            head.next = newNode;
        }

        head = newNode;
        newNode.next = temp;

    }

    public static void main(String[] args) {
        InsertAtBegin iab = new InsertAtBegin();
        iab.head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);

        iab.head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        iab.print();

        System.out.println();
        System.out.println("Inserting the Node At the Begin of the Above Singly Linked List");
        iab.InsertBegin(60);
        iab.print();



    }
}
