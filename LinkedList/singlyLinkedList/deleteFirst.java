package LinkedList.singlyLinkedList;

public class deleteFirst {

    private  static  Node head;
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
        System.out.println("Null");
    }

    Node deleteFirst(){
        Node current = head;
        if(head == null){
            return null;
        }
        head = head.next;
        current.next = null;
        return current;

    }

    public static void main(String[] args) {
        deleteFirst df = new deleteFirst();
        head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        df.print();
        df.deleteFirst();
        df.print();
        df.deleteFirst();
        df.print();
    }
}
