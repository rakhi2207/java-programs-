package LinkedList.singlyLinkedList;

public class deleteLast {

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
        while(current !=null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
    Node deleteLast(){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        deleteLast dl = new deleteLast();
        dl.head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);

        dl.head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        dl.print();
        dl.deleteLast();
        dl.print();
        dl.deleteLast();
        dl.print();
        dl.deleteLast();
        dl.print();
        dl.deleteLast();
        dl.print();
        dl.deleteLast();
        dl.print();
        dl.deleteLast();
        dl.print();
    }
}
