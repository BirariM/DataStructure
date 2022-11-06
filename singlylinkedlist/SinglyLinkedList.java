package singlylinkedlist;

public class SinglyLinkedList {

	public Node first;
	public Node last;
	
	public SinglyLinkedList() {
		
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int data) {
		
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
		
	}
	
	public Node deleteFirst() {
		
	}
	
	public void displayList() {
		
	}
	
	public void insertLast(int data) {
		Node current  = first;
		while(current.next ! = null ) {
			
		}
	}
	
	
}
