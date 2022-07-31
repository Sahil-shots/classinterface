import java.util.*;
class vectordemo
{
	public static void main(String[] args)
	{
		Vector v= new Vector();
		System.out.println(v.capacity());
		for(int i=0;i<=10;i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		//Enumeration Elements(18);
		//v.MoreElements(15,18);
		v.addElement(904);
		System.out.println(v.capacity());
		System.out.println("after updation the elements are"+v);
	}
	
}