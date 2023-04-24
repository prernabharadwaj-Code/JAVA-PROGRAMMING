package prernabhardwaj;

public class overloading2 {
	void number (int a ,int b) {
		System.out.println( a+b);
	}
	void number (int a,int b,int c) {
		System.out.println(a+b+c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading2 obj=new overloading2();
		obj.number(2,3);

	}

}
