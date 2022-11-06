package queue;

public class Queue {
	
	public int maxSize;
	public long queArr[];
	public int front,rear,nItems;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queArr = new long[maxSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}	
	
	public void insert(int j) {
		if(rear == maxSize-1) {
			rear = -1;
		}
		rear++;
		nItems++;
		queArr[rear] = j;
	}
	
	public long remove() {
		long temp = queArr[front];
		front++;
		if(front ==  maxSize) {
			front = 0;
		}
		nItems--;
		return temp ;
	}
	
	public long peekFront() {
		return queArr[front];
	}
	
	public boolean isEmpty() {
		return (nItems == maxSize);
	}
	
	public void view() {
		System.out.print("[");
		for(int i =0; i<queArr.length; i++) {
			System.out.print(queArr[i]+"->");
		}
		System.out.print("]");
	}
	
	
}
