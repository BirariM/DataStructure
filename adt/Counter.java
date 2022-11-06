package adt;

public class Counter {

	    private String name = null;
		private int count;
		
		public Counter()
		{
			this.count = 0;
		}
		
		public Counter(String str)
		{
			this.name = str;
		}
		
		public int getCounter()
		{
			return count;
		}
		
		public void increment() {
			count++;
		}
		
		public String toString() {
			return name +": "+count;
		}
	
}
