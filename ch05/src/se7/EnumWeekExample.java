package se7;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;break;
		case 2:
			today = Week.MONDAY;break;
		case 3:
			today = Week.TUESDAY;break;
		case 4:
			today = Week.WEDNEDAY;break;
		case 5:
			today = Week.THURSDAY;break;
		case 6:
			today = Week.FRIDAY;break;
		case 7:
			today = Week.SATURDAY;break;
	}
	
	System.out.println("오늘요일 = " + today);
	
	if(today == Week.SUNDAY) {
		System.out.println("일요일에는 축구를 합니다.");
	} else {
		System.out.println("열심히 자바 공부 합니다");
		}
	SimpleDateFormat
	format1 =
			new SimpleDateFormat ("yyy-MM-dd(E) HH:mm:ss");
	SimpleDateFormat format2 = 
			new SimpleDateFormat ("yyy년MM월dd일(E요일)");
	}
}
