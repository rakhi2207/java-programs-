/*
Removing the duplicates from the
 */
package LinkedList.singlyLinkedList;

public class removeDuplicates {

    private Node head;
    public static class Node{
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

    public Node RemoveDuplicates(Node head){
        Node temp = head;

        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        removeDuplicates list = new removeDuplicates();

        list.head = new Node(1);
        list.head.next = new Node(1);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(3);
        list.head.next.next.next.next = new Node(3);

        list.print(list.head);
        list.print(list.RemoveDuplicates(list.head));
    }
}
