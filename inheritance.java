package prernabhardwaj;
class Mycalculation{
	int z;
	public void addition (int x,int y)
	{
		z=x+y;
		System.out.println("sum of given number is"+z);
		
	}
	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers:"+z);
		}
		}


public class Inheritance extends Mycalculation  {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers:"+z);
		}


	public static void main(String[] args) {
		int x = 20, y= 10;
		Inheritance obj = new Inheritance();
	obj.addition(x, y);
		obj.Subtraction(x, y);
		obj.multiplication(x, y);
		}


		

	}
