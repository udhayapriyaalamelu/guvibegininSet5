package guvi_set5;
import java.util.*;
public class Pgm39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int h=n*m;
double f=Math.sqrt(h);
int flag=0;
for(int i=1;i<=h/2;i++)
{
	int p=i*i;
	if(p==h)
	{
		System.out.println("yes");
		flag=1;
		break;
	}
	
	
}
if(flag==0)
System.out.println("no");
	}

}
