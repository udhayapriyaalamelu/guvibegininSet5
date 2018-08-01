package guvi_set5;
import java.util.*;
public class Pgm36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int f=0;
for(int i=2;i<num;i++)
{
	if(num%i==0)
		f=1;
}
if(f==1)
	System.out.println("Yes");
else
	System.out.println("No");
	}

}
