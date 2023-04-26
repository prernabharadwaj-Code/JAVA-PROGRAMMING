package prernabhardwaj;
class Display {
	void  method1(){
		System.out.println("my name is prerna bhardwaj ");
	}
	 void  method2(){
		System.out.println("my name is anshika varshney ");
	}
}

public class Overriding1 extends Display  {
	void  method1(){
		System.out.println("my name is prerna tyagi");
	}
	 void  method2(){
		System.out.println("my name is prerna sharma ");
	}
	
	public static void main(String[] args) {
		Overriding1 obj=new Overriding1();
		Display d=new Overriding1();
		
		//Display d1=new Display();
		
		obj.method1();
		obj.method2();
		d.method1();
	d.method2();
		
		
		
	}

}
