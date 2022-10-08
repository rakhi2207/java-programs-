package LinkedList.singlyLinkedList;

public class InsertionAtposition {

    private static Node head;

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
        System.out.print("Null \n");
    }

    void insertAtPos(int data, int pos){
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }
        int count = 1;
        Node current = head;
        Node temp = head.next;
        while(count < pos - 1){
            current = current.next;
            temp = temp.next;
            count++;
        }
        current.next = newNode;
        newNode.next = temp;

    }


    public static void main(String[] args) {
        InsertionAtposition iop = new InsertionAtposition();
        head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);
        Node n3 = new Node(40);
        Node n4 = new Node(50);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        iop.print();
        iop.insertAtPos(60, 1);
        iop.print();



    }
}
