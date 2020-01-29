package com.Khushboo.misc;

public class SwitchDemo {

	public static void main(String[] args) {

		String inputDay = args[0];
		System.out.println("Entered Day: " + inputDay);
		
		Days convertedInput = mappingDaysToEnum(inputDay);
		System.out.println("Converted Input: " + convertedInput);

		
		switch (convertedInput) {
		case MONDAY:
			System.out.println("Working Day.");
			break;

		case TUESDAY:
			System.out.println("Working Day.");
			break;
 
		case WEDNESDAY:
			System.out.println("Working Day.");
			break;

		case THURSDAY:
			System.out.println("Working Day.");
			break;

		case FRIDAY:
			System.out.println("Working Day.");
			break;

		case SATURDAY:
			System.out.println("Holiday.");
			break;

		case SUNDAY:
			System.out.println("Holiday.");
			break;

		default:
			System.out.println("Please provide the right value");
			break;
		}
	}

	private static Days mappingDaysToEnum(String day) {

		Days days = Days.MONDAY;
		String dayAgain = day.toLowerCase();
		
		switch (dayAgain) {
		case "mon":
			days = Days.MONDAY;
			break;
			
		case "tue":
			days = Days.TUESDAY;
			break;
			
		case "sat":
			days = Days.SATURDAY;
			break;
			
		case "sun":
			days = Days.SUNDAY;
			break;
			
		default:
			days = null;
			break;
		}
		
		return days;
	}

	enum Days{
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
}
