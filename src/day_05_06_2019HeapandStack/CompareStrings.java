package day_05_06_2019HeapandStack;

public class CompareStrings {

	public static void main(String[] args) {
		
		String str = new String("Techtorial");
		String string = "Techtorial";
		String ss= new String("Techtorial");
		str = string;
		String s5 = "Techtorial";
		boolean isTrue=str.equals(string);
		System.out.println(isTrue);
		
		isTrue =ss==str;
		System.out.println(isTrue);
		
		
		isTrue =str==str;
		System.out.println(isTrue);
		
		s5 =str;
		isTrue= s5==str;
		System.out.println(isTrue);
		
		
		//Create 15 string objects (do both simple assignment and using constructor)
		//Compare those with comparison operator and .equals method.
		//Compare 10 objects with == comparison operator and make them be equal.
	}
}
