package guvi_set5;
import java.util.*;
public class Pgm30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
		if (n % 2 == 0)
    System.out.println("OK");
else if (n % 2 < 2.5)
    n = n - n% 2;
else
    n = n + (2 - n % 2);
System.out.println(n);
	}

}
