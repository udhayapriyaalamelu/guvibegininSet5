package guvi_set5;
import java.util.*;
public class Pgm18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
	arr[i]=sc.nextInt();
}
boolean bool=false;;
for(int i=0;i<n;i++)
{
	if(k>arr[i])
	{
		bool=true;
	}
	else
		bool=false;
	break;
}
if(bool)
	System.out.println("Yes");
else
	System.out.println("No");
	}

}
