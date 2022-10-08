package LinkedList.singlyLinkedList;

public class LengthOfSLL {

    private Node head = null;
    private static  class Node{
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
            System.out.print(current.data +  " -> ");
            current = current.next;
        }
        System.out.print("NULL");
    }

    int length(){
        Node Current = head;
        int length = 0;
        while (Current != null){
            length++;
            Current = Current.next;
        }
        return length;
    }

    public static void main(String[] args) {
        LengthOfSLL sll = new LengthOfSLL();
        sll.head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);

        sll.head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        sll.print();
        System.out.println();
        System.out.println("Length Of the Given LL is " + sll.length());
    }
}
