package adt;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1;
		c1 = new Counter();
		c1 = new Counter("mayur");
		c1.increment();
		c1.increment();
		c1.increment();
		c1.increment();
		c1.increment();
		c1.increment();
		c1.increment();
		System.out.println(c1.getCounter());
		System.out.println(c1.toString());
	}

}
