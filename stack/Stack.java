package stack;

public class Stack {

	private int MaxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size) {
		this.MaxSize = size;
		this.stackArray = new long[MaxSize];
		this.top = -1;
	}
	
	public void push(long j) {
		if(isFull())
			System.out.println("Stack is full ");
		else {
		top++;
		stackArray[top] = j;
		}
	}
	public long pop() {
		if(isEmpty())
			return -1;
		else {
		int temp = top;
		top--;
		return stackArray[temp];
		}
	}
	public long peak() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return (top == -1);
	}
	public boolean isFull() {
		return (top == MaxSize-1);
	}
	
	
}
