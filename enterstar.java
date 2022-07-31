import java.io.*;
import java.util.*;
public class enterstar
	{
	public static void main(String[] args)
			{
				System.out.println("How many Stars would you like to print");
				Scanner scan=new Scanner(System.in);
				int num=scan.nextInt();
				for (int i=0;i<num;i++)
				{
						for(int j=0;j<i;j++)
						{System.out.print("*");}
					System.out.println();
				}	
				
				
				
				
				for (int i=num-1;i>0;i--)
				{
						for(int j=0;j<i;j++)
						{System.out.print(i);}
					
				System.out.println();
				}
			}
		
	}
	