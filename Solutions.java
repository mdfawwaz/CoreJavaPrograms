package projectOne;

public class Solutions {
` {
		System.out.println( "Integer is : " + num);
		
		int[] values = {1000, 900, 500, 400, 100, 90, 10, 9, 5, 4, 1};
		String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		StringBuilder roman = new StringBuilder();
		
		for(int i=0;i<values.length; i++) {
			while(num>=values[i])
			{
				num -= values[i];
				roman.append(romans[i]);
			}
		}
		
		System.out.println("Roman Numeral of " + num + " is" + roman.toString());
	}
	public static void main (String args[]) {
		System.out.println(toHinduArabic("II"));	
		System.out.println(toHinduArabic("XXVII"));
		
		
	
	
	
	
	
	
	}
	private static char[] toHinduArabic(String string) {
		// TODO Auto-generated method stub
		return null;
	}}