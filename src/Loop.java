import java.util.ArrayList;

public class Loop {
//	Given a String[] with strings in a random format
//	remove all strings longer than 2 in length
//	remove all string that would not parse as numbers
//	multiply remaining by 10
//	add them all together
//	print out the sum
	
	 ArrayList<String> strAL = new ArrayList<>();
	 int sum = 0;
	public  void method(String[] strArray) {
		
		for(String str:strArray) {
			if(str.length() < 3) {
				strAL.add(str);
			}
		}
	 
	
	try{
		for(String str:strAL) {
			sum += Integer.parseInt(str);
		}
		} catch(NumberFormatException e) {
			System.out.println("something");
		} 
	System.out.println(sum*10);
}
}
