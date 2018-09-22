package week2.day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLearn {

	public static void main(String[] args) {
		
		
		String txt = "ABCDE1234A";
		String pattern = "[A-Z]{5}[0-9]{4}[A-Z]";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(txt);
		System.out.println(matcher.matches());
	}

}




