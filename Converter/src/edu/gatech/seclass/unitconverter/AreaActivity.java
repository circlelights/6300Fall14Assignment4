package edu.gatech.seclass.unitconverter;

public class AreaActivity {
	
	
	//Method to convert Meters to Feet
	public static String MetersToFeet(double meters) {
		double Feet = meters * 3.28084;
		return String.valueOf(Feet);
	}

	//Method to convert Feet to Meters
	public static String FeetToMeters(double feet) {
		double Meters = feet / 3.28084;
		return String.valueOf(Meters);
	}
}
