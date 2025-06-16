import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		
		if (a * d == b * c || a * c == b * d || a * b == c * d || b * d == a * c || c * d == a * b || b * c == a * d){
            System.out.println("Possible");
        }
        else{
            System.out.println("Impossible");
        }
	}
}
