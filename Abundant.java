package projectOne;
import java.util.Scanner;

public class Abundant {

	public static void main(String args[])
	{
		System

		if (myabundant(num))
			return 1;
		else if (myperfect(num))
			return 0;
		else if (mydeficient(num))
			return -1;
	}
	
	public static int myabundant(int n) {
		int sum=0;
		for (int i=1;i<n;i++)
		{
			if(n%i==0) {
				sum+=i;
			}
		}
		
		if(sum>n) 
		{}		
	}
	
	public static boolean myperfect(int n) {
		int pos=1;
		int sum=0;
		for (int i=1;i<n;i++)
		{
			if(n%i==0) {
				sum+=i;
			}
		}
		
		if(sum>n) {
			return 1;
		}
		
	}
	
	
	public static boolean mydeficient(int n) {
		int pos=1;
		int sum=0;
		for (int i=1;i<n;i++)
		{
			if(n%i==0) {
				sum+=i;
			}
		}
		
		if(sum>n) {
			return 1;
		}
		
	}
	
}
