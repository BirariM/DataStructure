package stack;

public class RevrseStrngMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * RevrseStrng t; t = new RevrseStrng(5);
		 * 
		 * t.push('H'); t.push('E'); t.push('L'); t.push('L'); t.push('0'); t.push('0');
		 * 
		 * System.out.println(t.pop()); System.out.println(t.pop());
		 * System.out.println(t.pop()); System.out.println(t.pop());
		 * System.out.println(t.pop()); System.out.println(t.pop());
		 */
			
	  System.out.println(reverseString("Hello"));
	  
		
	}
	public static String reverseString(String str) {
		int strlength = str.length();
		RevrseStrng m = new RevrseStrng(strlength);
		
		for(int i=0; i<str.length(); i++) {
			char temp = str.charAt(i);
			m.push(temp);
		}
		String result="";
		while(!m.isEmpty()) {
			char x = m.pop();
			result = result + x;
		}
		return result;
	
	}

}
