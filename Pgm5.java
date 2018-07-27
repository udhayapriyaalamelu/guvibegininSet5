package guvi_set5;
import java.util.*;
public class Pgm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int count=0;
while(num!=0)
{
	int num1=num%10;
	count++;
	num=num/10;
}
System.out.println(count);
	}

}
