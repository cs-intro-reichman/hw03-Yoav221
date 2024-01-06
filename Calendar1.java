/**
 * Prints the calendars of all the years in the 20th century.
 */

public class Calendar1 {
	// Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2; // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	static int SundaysCount = 0;
	static boolean isSunday;

	/**
	 * Prints the calendars of all the years in the 20th century. Also prints the
	 * number of Sundays that occured on the first day of the month during this
	 * period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999,
		// inclusive.
		// Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday,
		// prints "Sunday".
		// The following variable, used for debugging purposes, counts how many days
		// were advanced so far.
		int debugDaysCounter = 0;
		//// Write the necessary initialization code, and replace the condition
		//// of the while loop with the necessary condition
		while (true) {
			//// Write the body of the while
			advance();
			debugDaysCounter++;
			//// If you want to stop the loop after n days, replace the condition of the
			//// if statement with the condition (debugDaysCounter == n)
			if (debugDaysCounter == 365) {
				break;
			}
		}
		//// Write the necessary ending code here
	}

	// Advances the date (day, month, year) and the day-of-the-week.
	// If the month changes, sets the number of days in this month.
	// Side effects: changes the static variables dayOfMonth, month, year,
	// dayOfWeek, nDaysInMonth.
	private static void advance() {

		for (int y = year; y <= 1999; y++) {
			for (int m = month; m <= 12; m++) {
				for (int d = dayOfMonth; d <= nDaysInMonth(m, y); d++) {

					if (dayOfWeek == 1) {
						System.out.println(d + "/" + m + "/" + y + " Sunday");
					} else {
						System.out.println(d + "/" + m + "/" + y);
					}

					dayOfWeek++;
					if (dayOfWeek == 8) {
						dayOfWeek = 1;
					}
				}

			}

		}

	}

	// Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int y) {
		if ((y % 400 == 0) || (y % 100 != 0) && (y % 4 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		int daysNum = 31;

		switch (month) {
			case 1:
				daysNum = 31;
				break;
			case 2:
				if (isLeapYear(year)) {
					daysNum = 29;
				} else {
					daysNum = 28;
				}
				break;
			case 3:
				daysNum = 31;
				break;

			case 4:
				daysNum = 30;
				break;
			case 5:
				daysNum = 31;
				break;

			case 6:
				daysNum = 30;
				break;
			case 7:
				daysNum = 31;
				break;
			case 8:
				daysNum = 31;
				break;
			case 9:
				daysNum = 30;
				break;
			case 10:
				daysNum = 31;
				break;
			case 11:
				daysNum = 30;
				break;
			case 12:
				daysNum = 31;
				break;
		}

		return daysNum;
	}
}
