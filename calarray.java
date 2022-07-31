//Calculate the average marks from an array containing marks of all students in Physics using for each loop
import java.util.*;
class calarray
{
	public static void main(String[] args)
	{
		/**int[] marks ={80,20,30,90};
		int sum=0,avg=0,total;
		for(int element:marks)
		{
		sum=sum+element;
		avg=sum/marks.length;
		}
		//total=marks.length;
		
		System.out.println("The sum of array is"+sum);
			System.out.println("average"+avg);*/
			
			
//WAP to add two matrices of size 2*3
	/**int[][] flats = {{1,2,3},
					{4,5,6}};
	int[][] flats2 = {{8,9,2},
						{3,1,0}};
	int[][] result = {{0,0,0},
						{0,0,0}};
	
	
	for(int i=0;i<flats.length;i++)//row number of times
	{
		for(int j=0;j<flats[i].length;j++)//column number of times
		{
			result[i][j]=flats[i][j]+flats[i][j];
			//System.out.format("Setting value for i=%d ad j=%d/n",i,j);
			System.out.print(result[i][j] +" ");
			//System.out.println(result[i][j]);
		}
		System.out.println("");
	}*/
	
//WAP to reverse an array
int[] num={1,2,3,4,5,6};
for(int i=0;i<num.length;i++)
{
	System.out.println(num[i]);
}

	for(int i=num.length-1;i>=0;i--)
	{
		System.out.println("After reverse"+num[i]);
	}
	
	
	
	
	
	
	}	
}