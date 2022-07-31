import java.util.*;
class baseclass
{
	int num1;
	void baseshow()
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter num1");
		//num1=nextInt();
		System.out.println("num1 is:" +num1);
	}
}
class derive extends baseclass
{
	public static void main(String[] args)
	{
		int num2;
	//void baseshow2()
		void product()
	{
		//Scanner sc=new Scannner(System.in);
		//System.out.println("Enter the num2");
		//num2=sc.nextInt();
		//System.out.println("num2 is:" +num2);
		System.out.println("Product = " + (num1*num2));
	}
	//void product()
	void deriveshow()
	{
		//System.out.println("Product of numbers are:" +num1*num2);
		System.out.println("num2 = " +num2);
	}
	}
}
class InheritanceDemo
{
public static void main(String args[])
{
derive d=new derive();
d.num1=20;
d.baseshow();
d.num2=10;
d.deriveshow();
d.product();
}
}	