package testPackage;

public class Sample {
	
	public static void main(String[] args) {
		
		int a=20;
		System.out.println(a + "\n");
		
		int b=++a;                   // pre increment (first value incremented & then assigned.)
		System.out.println(b);
		System.out.println(a+ "\n");     // here value of a=21 will be used for further
		
		int c=a++;                     // post increment(first value assigned & then incremented)
		System.out.println(c);
		System.out.println(a+"\n");
		
		int d=--a;                     // pre decrement (first value decremented & then assigned)
		System.out.println(d);
		System.out.println(a+"\n");
		
		int e=a--;                    // post decrement (first value assigned & then decremented)
		System.out.println(e);
		System.out.println(a+"\n");
	}

}
