package LinkedList.singlyLinkedList;

public class InsrtionAtEnd {

    private Node head;
    private  static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    void InsertEnd(int data){
        Node newNode = new Node(data);
        Node current = head;
        if(head == null){
            head.next = newNode;
        }

        while(null != current.next){
            current = current.next;
        }

        current.next = newNode;
    }

        public static void main(String[] args) {
            InsrtionAtEnd iae = new InsrtionAtEnd();
            iae.head = new Node(10);
            Node n1 = new Node(20);
            Node n2 = new Node(30);
            Node n3 = new Node(40);
            Node n4 = new Node(50);

            iae.head.next = n1;
            n1.next = n2;
            n2.next = n3;
            n3.next = n4;
            iae.print();
            System.out.println();
            System.out.println("Inserting Data at End");
            iae.InsertEnd(60);
            iae.print();

    }
}

