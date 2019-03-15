package se07;

public class WhileKeyControlExample {

	public static void main(String[] args) {
		boolean run = true;
		int speed = 0;
		int keyCod = 0;
		
		while(run) {
			if(keyCode!=13 && keycode!=10) {
				System.out.println("-------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("-------------------");
				System.out.println("선택: ");
			}
			
			keyCod = System.out.println();
			
			if (keyCode == 49) {
				speed++
				System.out.println("현재속도=" + speed);
			} else if (keyCode == 50) {
				speed-;
				System.out.println("현재속도=" + speed);
			} else if (keyCode == 51) {
				rin = false;
			}
		}
			 System.out.println("프로그램종료");
	}

}
