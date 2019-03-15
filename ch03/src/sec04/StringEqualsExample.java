package sec04;

import javax.print.DocFlavor.STRING;

public class StringEqualsExample {
	public static void main(String[] args) {
		STRING strVar1 = "신민철";
		string strVar2 = "신민철";
		string strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1 .equals(strVar2));
		System.out.println(strVar1 .equals(strVar3));
	}

}
