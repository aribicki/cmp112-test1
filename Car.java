public class Car {
	public String make;
	public int year;

/* ----------------------------------------------------------------- */

Car () {
	make = "Unknown";
	year = 2015;
	}

Car (String thisMake) {
	this();
	make = thisMake;
	}

Car (String thisMake, int thisYear) {
	make = thisMake;
	year = thisYear;
	}

public String toString() {
	String desc = "Make: " + make + " Year: " + year;
	return desc;
	}
}
