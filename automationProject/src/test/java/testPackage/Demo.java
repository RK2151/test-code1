package testPackage;

public class Demo {
	
	public static void xyz() {
		int a = 25;
		System.out.println(a + "\n");

		
		int b = a--;  // for post decrement (first value assigned & then decremented)
		
		System.out.println(b);  
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Demo.xyz();
	}
}

	
	 
