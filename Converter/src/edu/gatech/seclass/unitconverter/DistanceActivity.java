package edu.gatech.seclass.unitconverter;

public class DistanceActivity {

	//Method to convert Kilometers to Miles	
	public static String kmToMiles(double km) {
		double miles = km / 1.609;
		return String.valueOf(miles);
	}

	//Method to convert Miles to Kilometers
	public static String milesToKm(double miles) {
		double km = miles * 1.609;
		return String.valueOf(km);
	}
}
