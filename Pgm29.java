package guvi_set5;
import java.util.*;
public class Pgm29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int p=Math.abs(n-m);
if(p%2==0)
	System.out.println("even");
else
	System.out.println("odd");
	}

}
