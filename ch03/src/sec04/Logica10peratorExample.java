package sec04;

public class Logica10peratorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if( (sharcode>=65) && (charCode<=90) ) {
			System.out.println("대문자가 아니군요");
		}
		
		if( (sharcode>=97) && (charCode<=122) ) {
			System.out.println("소문자가 아니군요");
		}
		
		if( (sharcode<48) && (charCode>57) ) {
			System.out.println("0~9숫자 이군요");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2또는 3의 배수 이군요");
		}

		if( (value%2==0) | (value%3==0) ) {
			System.out.println("2또는 3의 배수 이군요");
		}
	}

}
