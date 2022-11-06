package queue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue g;
		g = new Queue(3);
		g.insert(10);
		g.insert(20);
		g.insert(30);
		g.insert(40);
		g.insert(50);
		
		g.view();
	}

}
