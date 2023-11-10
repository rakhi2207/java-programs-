package LinkedList.singlyLinkedList;

public class deletePos {

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

        while (current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    Node deleteAtPos(int pos){
        int count = 1;
        Node prev = null;
        Node current = head;

        while(count < pos){
            prev = current;
            current = current.next;
            count++;
        }
        prev.next = current.next;
        return prev;
    }

    public static void main(String[] args) {
        deletePos dp = new deletePos();
        dp.head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);

        dp.head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        dp.print();
        dp.deleteAtPos(3);
        dp.print();
    }
}
