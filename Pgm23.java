package guvi_set5;
import java.util.*;
public class Pgm23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int arr[]=new int[10];
for(int i=0;i<10;i++)
{
	arr[i]=sc.nextInt();
}
int min=arr[0];
for(int i=0;i<10;i++)
{
	if(min>arr[i])
	{
		min=arr[i];
	}
}
System.out.println(min);
	}

}
