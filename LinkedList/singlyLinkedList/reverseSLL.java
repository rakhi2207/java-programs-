package LinkedList.singlyLinkedList;

public class reverseSLL {
    private Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void print(Node node){

        while (node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("Null");
    }

    Node reversLinkedList(Node node){
        Node prev = null;
        Node next = null;
        Node current = node;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    public static void main(String[] args) {
        reverseSLL list = new reverseSLL();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        list.print(list.head);
//        list.reversLinkedList(head);
        list.print(list.reversLinkedList(list.head));
    }
}
