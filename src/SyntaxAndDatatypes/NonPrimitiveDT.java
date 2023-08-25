package SyntaxAndDatatypes;

public class NonPrimitiveDT {
	public static void main(String[] args) {
		String str = "Back To Basics";
		
		//In non primitive we get a lot of predefined methods which are of great use
		//just type the DT name and add . in the end, you will se a big list
		
		int n = str.length();
		System.out.println("String length : "+ n);
		
		System.out.println(str.charAt(3)); 
		
		//in this Interger is a class. So there are many predefined methods are already written
		Integer num = 65346;
		System.out.println("Num type : " + num.TYPE);
	}
}
