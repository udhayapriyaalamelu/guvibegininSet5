package guvi_set5;
import java.util.*;
public class Pgm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
	arr[i]=sc.nextInt();
}
int max=0;
for(int i=0;i<size;i++)
{
	if(max<arr[i])
	{
		max=arr[i];
	}
}
int min=arr[0];
for(int i=0;i<size;i++)
{
	if(min>arr[i])
	{
		min=arr[i];
	}
}
System.out.println(min+" "+max);
	}

}
