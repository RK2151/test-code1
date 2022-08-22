package testPackage;

public class Test1 {
	
	static float pi; // static global
	int b;            // non static global   

	static 
	{
		pi =3.14f;
	
		System.out.println("Static Block....");
	}
	
	Test1() {
		System.out.println("This is constructor");
	}
	
	{	
		
		b=40;
		System.out.println("NON-static Block.....");
	}
	
	
	public void m1() {
		System.out.println("Non-static method");
	}
	
	public static void m2() {
		System.out.println(5 * 5 * pi);
		System.out.println("Static method");
	}

	
	public static void main(String[] args) {
		
		Test1 t = new Test1(); //// object for non static method/Block....this will call 1-non static block 2-constructor 3- non static method
		t.m1();
		System.out.println("main method");
		  
		
		
		m2();



}
}