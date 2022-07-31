import java.util.*;
class arrayl
{
	public static void main(String[] args)
	{
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2,"M");
		System.out.println(l);
		l.add(1,"F");
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		l.remove("F");
		System.out.println(l);
		
		if(l.contains(15))
		{
			System.out.println("its present");
		}
		else
		{
			System.out.println("not present");
		}
		
		
		
		//l.add(4,"B");
		
		
		//System.out.println(l);

	
	}
	
	
}	