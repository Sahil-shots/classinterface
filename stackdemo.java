import java.util.*;
class stackdemo
{
public static void main(String[] args)
{
	Stack s=new Stack();
	s.push("A");
	s.push("B");
	s.push("C");
	System.out.println((s));
	System.out.println(s.search(("A")));
	s.peek();
	System.out.println((s));
	s.pop();
	System.out.println((s));
	s.empty();
	System.out.println((s));
}
}