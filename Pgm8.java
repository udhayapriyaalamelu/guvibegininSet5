package guvi_set5;
import java.util.*;
public class Pgm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++)
{
	arr[i]=sc.nextInt();
}
int sum=0;
for(int i=0;i<size;i++)
{
	sum+=arr[i];
}
System.out.println((int)sum/size);
	}

}
