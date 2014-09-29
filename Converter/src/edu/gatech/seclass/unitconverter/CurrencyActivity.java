package edu.gatech.seclass.unitconverter;

public class CurrencyActivity {
	
	//Method to convert Euros to Dollars
	public static String EurosToDollars(double euros) {
		double Dollars = euros / 0.79;
		return String.valueOf(Dollars);
	}

	//Method to convert Dollars to Euros
	public static String DollarsToEuros(double dollars) {
		double euros = dollars * 1.27;
		return String.valueOf(euros);
	}
}
