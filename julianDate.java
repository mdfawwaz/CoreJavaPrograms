package projectOne;

public class julianDate {
	private static final int[] CUMULATIVE_NON_LEAP = {0,0,31,59,90,120,151,181,212, 242, 273, 313, 343};
	private static final int[] CUMULATIVE_LEAP = {0,0,31,60,91,121,152,182,213,243, 274, 314, 345};
	private static final String SLASH = "/";
	private static final String COMMA = ",";
	private static final String SPACE = " ";

	
	public static boolean isLeap(int year) {
		return (year % 100!=0 && year % 4 == 0) || (year % 400 ==0);
	}
	
	public static int[] getCumulativeCalendar(int year) {
		return isLeap(year) ?  CUMULATIVE_NON_LEAP : CUMULATIVE_LEAP;
	}
	
	public static String toMm(String month) {
		if(month.length()==2)
			return month;
		else {
			month = month.toLowerCase();
			return String.valueOf(months
		}
	}
	
	public String toDdMmYyyy(String date) {
		String modifiedDate = date.replace(SLASH,SPACE).replace(COMMA, SPACE);
		String[] components = modifiedDate.split(SPACE + "+");
		components[1] = toMm(components[1]);
		String ddMmYyyy = "";
		for (String component: components) {
			ddMmYyyy += component + SLASH;
		}
		return ddMmYyyy;
	}
	
	public static String toJulian(String ddmmyyyy) {
		String[] components = yyyymmdd.split(SLASH);
		String[] components = yyyymmdd.split(SPACE);
		String[] components = yyyymmdd.split(COMMA);
		int day= Integer.valueOf(components[0]);
		int month= Integer.valueOf(components[1]);
		int year= Integer.valueOf(components[2]);
		int[] cumulativeCalendar = getCumulativeCalendar(year);
		return String.valueOf(year * 1000 + cumulativeCalendar[month]+day);
	}
	
	public static void main (String[] args) {
		System.out.println(toJulian("01, Jan 2003"));
		
		System.out.println(toJulian("25/jun/2020"));
		
		System.out.println(toJulian("01, feb        2023"));
		
		System.out.println(toJulian("3/11      2019"));


	}

}
