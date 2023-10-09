package projectOne;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class julian {

		    public static void main(String[] args) throws ParseException {
	        String date = "2023-01-04";
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        Date d = sdf.parse(date);
	        double julianDate = d.getTime() / 86400000 + 2440587;
	        System.out.println(julianDate);
	    }
	}
