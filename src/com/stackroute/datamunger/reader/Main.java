package com.stackroute.datamunger.reader;

import java.util.regex.Pattern;

public class Main {

	public static void main(String a[]) {
		System.out.println(Pattern.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}|[0-1][0-9]/[0-3][0-9]/[0-9]{4}|[0-3][0-9]-[a-z]{3}-[0-9]{2}|[0-3][0-9]-[a-z]{3}-[0-9]{4}|[0-3][0-9]-[a-z]*-[0-9]{2}|[0-3][0-9]-[a-z]*-[0-9]{4}|[0-9]{4}/[0-1][0-9]/[0-3][0-9]|[0-9]{4}-[0-1][0-9]-[0-3][0-9]", "1999-12-31"));
		
	}

	private void m1() {
		// checking for date format dd/mm/yyyy
		System.out.println(Pattern.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}", "31/12/2999"));

		// checking for date format mm/dd/yyyy
		System.out.println(Pattern.matches("[0-1][0-9]/[0-3][0-9]/[0-9]{4}", "12/31/2999"));

		// checking for date format dd-mon-yy
		System.out.println(Pattern.matches("[0-3][0-9]-[a-z]{3}-[0-9]{2}", "31-dec-99"));

		// checking for date format dd-mon-yyyy
		System.out.println(Pattern.matches("[0-3][0-9]-[a-z]{3}-[0-9]{4}", "31-dec-1999"));

		// checking for date format dd-month-yy
		System.out.println(Pattern.matches("[0-3][0-9]-[a-z]*-[0-9]{2}", "31-june-99"));

		// checking for date format dd-month-yyyy
		System.out.println(Pattern.matches("[0-3][0-9]-[a-z]*-[0-9]{4}", "31-june-1999"));

		// checking for date format yyyy-mm-dd
		System.out.println(Pattern.matches("[0-9]{4}/[0-1][0-9]/[0-3][0-9]", "1999/12/31"));
	}

}
