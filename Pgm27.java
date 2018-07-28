package guvi_set5;
import java.util.*;
public class Pgm27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int flag=0;
while(n!=0)
{
	if(n%10==0) {
		flag=1;
		break;
	}
	else
	{
		n++;
	}
}
if(flag==1)
	System.out.println(n);
	}

}
