package projectOne;
import java.util.*;
import java.util.Scanner;
public class amicable {
		public static void main(String args[]) {
			int sumNum1=0, sumNum2=0;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter n1-");
			int num1=sc.nextInt();
			System.out.println("Enter n2-");
			int num2=sc.nextInt();
			
			for(int j=1;j<num1;j++) {
				if(num1%j==0)
					sumNum1+=j;
			}
			
			for(int i=1;i<num2;i++) {
				if(num2%i==0)
					sumNum2+=i;
			}
			
			if(sumNum1==num2 && sumNum2==num1)
				System.out.println("Amicable Pair");
			else    
				System.out.println("Not Amicable");
		}

}