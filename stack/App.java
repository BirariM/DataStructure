package stack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s;
		s = new Stack(5);
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(50);
		
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
		
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
			//System.out.println(s.pop());
			System.out.println(s.isEmpty());
			System.out.println(s.isFull());
	
	}

}
