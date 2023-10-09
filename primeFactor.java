package projectOne;
import java.io.*;
import java.util.Scanner;

public class primeFactor {
	public static void main (String args[]) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number-");
		n=sc.nextInt();
		for(int i=2;i<n;i++) {
			while(n%i==0)
			{
				System.out.println(i+" ");
				n=n/i;
			}
		}
		
		
		}
		
		
		}
