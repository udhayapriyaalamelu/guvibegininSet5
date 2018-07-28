package guvi_set5;
import java.util.*;
public class Pgm22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
char ch[]=s1.toCharArray();
int n=1;
for(int i=0;i<ch.length;i++)
{
	if(ch[i]=='1'||ch[i]=='0')
	{
		continue;
	}
	else {
		n=0;break;
	}
}
if(n==0)
	System.out.println("No");
else
	System.out.println("Yes");
	}

}
