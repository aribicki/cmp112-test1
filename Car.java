public class Car {               //creates public class
	public String make;      // creates an object parameter "make"
	public int year;          // creates a object praameter int "year"

/* ----------------------------------------------------------------- */

Car () {                    // creates object car
	make = "Unknown";   // sets make to unknown
	year = 2015;      // sets year to 2015
	}                 

Car (String thisMake) {  // creates a constructor that utilizes a string
	this(); // allows the object to call upon the method
	make = thisMake; // sets the make to the inputed make
	}

Car (String thisMake, int thisYear) { // creates another constructor that utlizes a string and int
	make = thisMake; // sets the inputed make to declare it as the make
	year = thisYear; // sets the inputed int to declare it as the year 
	}

public String toString() { //creates  a public string that will be used print out result
	String desc = "Make: " + make + " Year: " + year; // adds the results together into a line
	return desc; // returns the information make of the car and year. 
	}
}
