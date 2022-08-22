package testPackage;

public class Test5 {
	
	public float div() {
		int a= 25;
		int b= 5;
		
		float c=a/b;
		
		return c;
		
		
	}
	
	public static void main(String[] args) {
		Test5 t5 = new Test5();
		float ans = t5.div();
		
		System.out.println(ans*2);
	}

}
