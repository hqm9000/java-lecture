package se03;

public class IfElseIfExample {

	public static void main(String[] args) {
		int scor = 75;
		
		if(scor>=90) {
			System.out.println("점수가 100~90 입니다");
			System.out.println("등급은 A 입니다.");
		}else if(scor>=80) {
			System.out.println("점수가 80~89 입니다");
			System.out.println("등급은 B 입니다.");
	}	 else if(scor>=80) {
		 System.out.println("점수가 70~79 입니다");
		 System.out.println("등급은 C 입니다.");

		}
	}
}