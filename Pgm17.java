package guvi_set5;
import java.util.*;
public class Pgm17 {
public static void main(String []args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	int count=0;
	for(int i=0;i<n;i++)
	{
		if(k==arr[i])
		{
			count++;
		}
		else
		{
			continue; 
		}
	}
	System.out.println(count);
}
}
