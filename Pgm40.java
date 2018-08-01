package guvi_set5;
import java.util.*;
public class Pgm40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
String s=Integer.toString(num);
char c[]=s.toCharArray();
for(int i=0;i<c.length;i++)
{
	if(c[i]%2!=0)
		System.out.print(c[i]+" ");
}
	}

}
