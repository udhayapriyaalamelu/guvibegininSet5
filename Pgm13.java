package guvi_set5;
import java.util.*;
public class Pgm13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum=0;
while(num!=0)
{
	int n=num%10;
	sum=sum+n;
	num/=10;
}
System.out.println(sum);
	}

}
