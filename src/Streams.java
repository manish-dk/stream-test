import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Streams {
	public static void method() {
		List<String> myStrings = Arrays.asList("1", "2", "a", "123");

		int sum = myStrings.stream().filter(word -> word.length() < 3).filter(word -> {
			try {
				Integer.parseInt(word);
				return true;
			} catch (NumberFormatException e) {
				return false;
			}
		}).map(word -> Integer.parseInt(word) * 10).reduce(0, (current, total) -> total + current);
		System.out.println(sum);

	}
	
	public void largest(String [] strArray) {
		List<String> strList = Arrays.asList(strArray);
		strList.stream().filter(word -> word.charAt(0)!= 'D')
								.map(word -> {
									if(word.charAt(0)=='A') {
										int a =Integer.parseInt(word.substring(1))*2;
										return a;
									}
									if(word.charAt(0)=='B') {
										int a =Integer.parseInt(word.substring(1))+100;
										return a;
									}
									if(word.charAt(0)=='C') {
										int a = Integer.parseInt(word.substring(1))-100;
										return a;
									}
									return 0;
								}).filter(a -> a%5 != 0).reduce((first,second) -> {
									if(first > second) {
										second = first;
										
									}
									return second;
								}).ifPresent(System.out::print);
	}

}
