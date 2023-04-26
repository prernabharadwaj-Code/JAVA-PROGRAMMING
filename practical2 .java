//write  a program to find out the sum of command line arguments ////
package prernabhardwaj;

public class commandline {

	public static void main(String[] args) {
		int sum=0; String data=""; if(args.length>0)
		{
		for(int i=0;i<args.length;i++)
		{
		data=args[i];

		sum=sum+Integer.parseInt(data);
		}
		
		System.out.println(sum);
		}
		else
		{
			System.out.println("you did not pass any command line argument");
		}
		}
		
