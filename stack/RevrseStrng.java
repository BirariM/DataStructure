package stack;

public class RevrseStrng {
	
	public int MaxSize;
	public char StackArr[];
	public int top;
	
	public RevrseStrng(int size) {
		this.MaxSize = size;
		this.StackArr = new char[MaxSize];
		this.top = -1;
	}
	
	public void push(char ch) {
		if(isFull())
			System.out.println("Stack is full");
			else {
			top++;
			StackArr[top] = ch;
		}
	}
	public char pop() {
		if(isEmpty())
			return '1';
		else {
		int temp = top;
		top--;
		return StackArr[temp];
		}
	}
	public boolean isEmpty() {
		
		return (top==-1);
	}
	public boolean isFull() {
		return (top == MaxSize-1);
	}
	
	
	
}
