package guvi_set5;
import java.util.*;
public class Pgm37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int i=1;i<=num;i++)
{
	if(num%i==0)
		System.out.print(i+" ");
}
	}

}
