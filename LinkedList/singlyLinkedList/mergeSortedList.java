package LinkedList.singlyLinkedList;

public class mergeSortedList {

    private static Node head;
    private static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    void print(Node node){
        while(node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println("Null");
    }

    Node mergeList(Node list1, Node list2){
        Node dummy = new Node(0);
        Node temp = dummy;

        while(list1 != null && list2 != null){

            if(list1.data <= list2.data){
                temp.next = list1;
                list1 = list1.next;
            }else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if(list1 == null){
            temp.next = list2;
        }
        if(list2 == null){
            temp.next = list1;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        mergeSortedList ans = new mergeSortedList();


        //First List
        Node head1 = new Node(10);
        Node l1 = new Node(40);
        Node l2 = new Node(50);
        Node l3 = new Node(70);
        Node l4 = new Node(80);

        head1.next = l1;
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        //Second List
        Node head2 = new Node(20);
        Node n1 = new Node(30);
        Node n2 = new Node(60);
        Node n3 = new Node(70);
        Node n4 = new Node(90);

        head2.next = l1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ans.print(head1);
        ans.print(head2);
        ans.print(ans.mergeList(head1, head2));


    }
}
