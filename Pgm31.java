package guvi_set5;
import java.util.*;
public class Pgm31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s,s1="";
Scanner sc=new Scanner(System.in);
s=sc.nextLine();
int len=s.length();
int begin=0,i;
int end=len-1;
int middle=(begin+end)/2;
for(i=begin;i<=middle;i++)
{
if(s.charAt(begin)==s.charAt(end))
{
	begin++;
	end--;
}
else
{
	break;
}
}
if(i==middle+1)
	System.out.println("yes");
else
	System.out.println("no");

}
}