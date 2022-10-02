// using array deque in java //

package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
		
		
		ArrayDeque <Integer> ad = new ArrayDeque<>();
		
	ad.push(12);
	ad.push(23);
	ad.push(34);
	System.out.println(ad.pop());	
	System.out.println(ad.pop());

	}

}

// implementation of array deque in java //

package deque;

public class MyDeque<E> {

	Node<E> head,tail;
	
	public void addToHead(E data) {
		Node<E> toAdd = new Node <>(data);
		if(head==null) {
			head = tail = toAdd;
			return;
		}
		head.next = toAdd;
		toAdd.prev = head;
		head = toAdd;
	}
	
	
	public E removeLast() {
		if(head == null) {
			return null;
		}
		
		Node<E> toRemove = tail;
		tail = tail.next;
		tail.prev = null ;
		if(tail == null) {
			head = null;
		}
		return toRemove.data;
		
	}
	public static class Node<E>{
		E data;
		Node<E> next, prev;
		public Node(E Data) {
			this.data = data;
			this.next = this.prev = null;
		}	
	}
	
	
	
}
