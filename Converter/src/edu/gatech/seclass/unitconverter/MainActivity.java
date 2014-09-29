package edu.gatech.seclass.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.*;


public class MainActivity extends Activity {
	



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
//		RadioGroup group=(RadioGroup)findViewById(R.id.radioGroup1);	
//	group.OnCheckedChangeListener(new OnCheckedChangeListener() {
//		
//		public void onCheckedChanged(RadioGroup group, int checkedId)
//		{
//			if(radioMiles.isChecked())
//			{
//		}
//		
//	}
//	}	
	//handleClick method to parse the double value and check which radio button was pressed
	//then call the relevant method
	public void handleClick(View view) {
		boolean checked = ((RadioButton) view).isChecked();
		
				
		EditText txt = (EditText) findViewById(R.id.editText1);
		double distance = Double.parseDouble(txt.getText().toString());
		
		switch(view.getId()) {
		case R.id.radioMiles:
			if(checked)
				txt.setText(DistanceActivity.kmToMiles(distance));
			break;
		case R.id.radioKilos:
			if(checked)
				txt.setText(DistanceActivity.milesToKm(distance));	
		}
		
	}
	
	//handleClick1 method to do the same as above for the Area class
	public void handleClick1(View view) {
		boolean checked = ((RadioButton) view).isChecked();
		
		EditText txt1 = (EditText) findViewById(R.id.editText2);
		double area = Double.parseDouble(txt1.getText().toString());
		
		switch(view.getId()) {
		case R.id.radioMiles:
			if(checked)
				txt1.setText(AreaActivity.MetersToFeet(area));
			break;
		case R.id.radioKilos:
			if(checked)
				txt1.setText(AreaActivity.FeetToMeters(area));
		}
		
	}

	//handleClick2 method to do the same as above for the Currency class
	public void handleClick2(View view) {
		boolean checked = ((RadioButton) view).isChecked();
		
		EditText txt2 = (EditText) findViewById(R.id.editText1);
		double currency = Double.parseDouble(txt2.getText().toString());
		
		switch(view.getId()) {
		case R.id.radioMiles:
			if(checked)
				txt2.setText(CurrencyActivity.EurosToDollars(currency));
			break;
		case R.id.radioKilos:
			if(checked)
				txt2.setText(CurrencyActivity.DollarsToEuros(currency));
		}
		
	}
	
	
	
}

