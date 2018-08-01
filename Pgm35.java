package guvi_set5;
import java.util.*;
public class Pgm35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b;
        Scanner s=new Scanner(System.in);
        b=s.next();
       int y= b.length();
       char t[]=b.toCharArray();
       int l=y/2;
       if(y%2!=0)
       {   t[l]='*';
    	   System.out.println(t);
       }
       else
       {
    	   t[l]='*';
    	   t[l-1]='*';
    	   System.out.println(t);
       }
    	   
	}

}
