package guvi_set5;
import java.util.*;
public class Pgm26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
for(int i=2;i<n/2;i++)
{
		if(n%i==0)
		{ 
			count++;
			break;
		}
}
if(count==0)
	System.out.println("Yes");
else
	System.out.println("No");
	}

}
