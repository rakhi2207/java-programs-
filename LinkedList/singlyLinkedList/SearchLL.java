package LinkedList.singlyLinkedList;

public class SearchLL {

    private  Node head;
    private static class Node{
        protected int data;
        protected Node next;

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

    int searchElement(int target){
        Node current = head;
        if(head == null){
            return -1;
        }
        if(head.data == target){
            return 1;
        }
        int count = 2;
        boolean flag = false;
        while(current != null){
            if(current.data == target){
                count++;
                flag = true;
            }
            current = current.next;
        }
        if(flag == false){
            return -1;
        }

        return count;
    }

    public static void main(String[] args) {
        SearchLL sll = new SearchLL();
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
        System.out.println(sll.searchElement(60));
    }
}
