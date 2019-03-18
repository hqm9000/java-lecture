package se7;

public class EnumMethodWeekExample {

	public static void main(String[] args) {
		//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week dat2 = Week.WEDNEDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueof() 메소드
		if(args.length == 1) {
			String strDAY = args[0];
			Week weeDay = Week.valueOf(strDAY);
			if(weeDAY == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			} else {
				System.out.println("평일 이군요");
			}
		}

		//values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}

}
