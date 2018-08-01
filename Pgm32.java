package guvi_set5;
import java.util.*;
public class Pgm32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
boolean bool=false;
for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		bool=true;
	else
	continue;
}
if(bool)
	System.out.println("yes");
else
	System.out.println("no");
	}

}
