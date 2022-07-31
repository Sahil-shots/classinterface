import java.util.*;
class hashes
{
	public static void main(String[] args)
	{
		HashSet<Integer> s =new HashSet();
		s.add(50);
		s.add(10);
		s.add(60);
		System.out.println("The size of hashsets are:"+s.size());
		System.out.println(s);
		//s.remove(
		
		
		
		if(s.contains(10))
		{
			System.out.println("Present");
		}
		else
		{	
			System.out.println("not present");
		}
		s.remove(50);
		System.out.println("The size of hashsets are:"+s.size());
	}
}