package LinkedList.singlyLinkedList;

public class insertionInSortedList {

    static Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("Null");
    }

    Node insertInSortedList(Node head, int data){
        Node newNode = new Node(data);
        Node current = head;
        Node temp = null;

        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        insertionInSortedList list = new insertionInSortedList();
        list.head = new Node(1);
        list.head.next = new Node(4);
        list.head.next.next = new Node(6);
        list.head.next.next.next = new Node(11);

        list.print(list.head);
        list.print(list.insertInSortedList(list.head, 7));
    }
}
