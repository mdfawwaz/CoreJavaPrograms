package projectOne;

public class toHinduArabic {
	public static int value(char i) {
		if(i=='I')
			return 1;
		if(i=='V')
		return 5;
		if(i=='X')
		return 10;
		if(i=='L')
		return 50;
		if(i=='C')
		return 100;
		if(i=='D')
			return 500;
		if(i=='M')
			return 1000;
		return -1;
	}
	
	public static int romanToDec (String x) {
		String val=x.toUpperCase();
		int sum=0;
		for(int i=val.length()-1;i>=0;i--) {
			
			int num=value(val.charAt(i));
		if(i+1<val.length()) {
			int nextNum=value(val.charAt(i+1));
			sum= (nextNum > num) ? (sum-=num) : (sum+=num);
		}
		else {
			sum+=num;
		}
		}
	return sum;
	}
	public static void main( String [] args) {
		System.out.println(romanToDec("XXXVII"));
		System.out.println(romanToDec("III"));
		System.out.println(romanToDec("LVIII"));
		System.out.println(romanToDec("CXXIII"));
		System.out.println(romanToDec("DCXLI"));
		System.out.println(romanToDec("CCCXLIII"));
		System.out.println(romanToDec("MMMDCCXXIV"));	
		System.out.println(romanToDec("MMMMMCDLXIX"));	
	}

}
