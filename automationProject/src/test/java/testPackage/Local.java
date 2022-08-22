package testPackage;

public class Local {
	
	 static int x=400;    //global (static variable) can call in any method
     int y = 200;        // global (Non- Static variable) can call in only non-static method
	public void myMethod() {
		
		int a = 40100;      //local variable is limited only within the method
		int b = 100;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}

	public static void test() {
		System.out.println(x);
		
	}
	
	public static void main(String[] args) {
		Local v = new Local();
		v.myMethod();
		v.test();
		
		
	}
}
