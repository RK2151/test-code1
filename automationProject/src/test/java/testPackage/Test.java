package testPackage;

public class Test {
	
	static                                        // static block
	{
		System.out.println("Static Block....");
	}
	{                                             // non static block
		System.out.println("NON-static Block.....");
	}
	Test(){                                           // constructor
		System.out.println("This is constructor");
	}
	
	public void m1() {                             // non static method
		System.out.println("Non-static method");
	}
	
	public static void m2() {                     // static method
		System.out.println("Static method");
	}

	
	public static void main(String[] args) {
		Test t = new Test();  // object for non static method / non static block
		t.m1();
		
		Test.m2();
	}


}
