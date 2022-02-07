/* strictfp is a keyword in java used for restricting floating-point calculations and 
 ensuring same result on every platform while performing operations in the floating-point variable.
 strictfp is a modifier which is only used with class, interface and methods only.
 */





package dateandapi;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
/* strictfp public class DateandAPI {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
	}

}

import java.util.*;
strictfp public class DateandAPI {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis() +" milliseconds since 1970."); //it will return total milliseconds from 1/1/1970 till present time.
		System.out.println(System.currentTimeMillis()/1000/60 + " minutes since 1970.");//it will return total minutes
	}

}
import java.util.*;
strictfp public class DateandAPI {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
	}

}
import java.util.*;
strictfp public class DateandAPI {
	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Date d = new Date("7/8/2021"); // mm/dd/yyyy. format
		System.out.println(d);
	}

}


import java.util.*;
strictfp public class DateandAPI {
	public static void main(String[] args) {
   GregorianCalendar gc = new GregorianCalendar();
   System.out.println(gc.getInstance());
   System.out.println(gc.YEAR);
	}

}
// This was all about the class based date and time presentation.


strictfp public class DateandAPI {
	public static void main(String[] args) {
   LocalDate d= LocalDate.now();
   System.out.println(d); // yyyy-mm-dd format
   LocalTime d1= LocalTime.now();
   System.out.println(d1);
   LocalDateTime d2= LocalDateTime.now();
   System.out.println(d2);
	
	}

}
*/
import java.time.format.*;
@SuppressWarnings("unused")
strictfp public class DateandAPI {
	public static void main(String[] args) {
   LocalDate d= LocalDate.now();
   System.out.println(d); // yyyy-mm-dd format
   LocalTime d1= LocalTime.now();
   System.out.println(d1);
   LocalDateTime d2= LocalDateTime.now();
   System.out.println(d2);
	DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println(df.format(d2)); //it will print the current date in given order.
	}

}
