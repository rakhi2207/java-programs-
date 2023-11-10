package LinkedList.singlyLinkedList;

public class detectLoop {
        static Node head;
        static class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        void printList(Node head){

            while(head != null){
                System.out.print(head.data + " -> ");
                head = head.next;
            }
            System.out.println("Null");
        }

        boolean detectLoop(Node head){
            Node fastPtr = head;
            Node slowPtr = head;

            while(fastPtr != null && fastPtr.next != null){
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;

                if(fastPtr == slowPtr){
                    removeLoop(slowPtr);
                    return true;
                }
            }
            return false;
        }

        void removeLoop(Node slowPtr){
            Node current = head;
            while(current.next != slowPtr.next){
                current  = current.next;
                slowPtr = slowPtr.next;
            }

            slowPtr.next = null;
            printList(head);
        }

    public static void main(String[] args) {
        detectLoop dl = new detectLoop();
         dl.head = new Node(15);
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        dl.head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n3;

        System.out.println(dl.detectLoop(dl.head));
    }
}
