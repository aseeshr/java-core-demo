package com.test.client;

import java.util.Scanner;

public class SwitchcCase {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Please choose day between 1 to 7");
		int day = sc.nextInt();
		String dayString;
		switch (day) {
		case 1: dayString = "Sunday";

			break;
		case 2: dayString = "Monday";

			break;
		case 3: dayString = "Tuesday";

			break;
		case 4: dayString = "Wednesday";

			break;
		case 5: dayString = "Thursday";

			break;
		case 6: dayString = "Friday";

			break;
		case 7: dayString = "Saturday";

			break;

		default:
			 dayString = "Invalid Day";
			break;
		}
		System.out.println(dayString);
	}
}
