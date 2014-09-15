package jp.clockup.myradiobutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void checkMethod1(View radio){
		RadioButton radioButton = (RadioButton)radio;
		TextView textView = (TextView)findViewById(R.id.textView1);
		textView.setText(radioButton.getText().toString() + " SELECTED");
	}
	
	public void checkMethod2(View radio){
		RadioButton radioButton = (RadioButton)radio;
		TextView textView = (TextView)findViewById(R.id.textView2);
		textView.setText(radioButton.getText().toString() + " SELECTED");
	}
	
	public void buttonMethod(View button){
		// group1 information
		RadioGroup group1 = (RadioGroup)findViewById(R.id.radioGroup1);
		int selectedId1 = group1.getCheckedRadioButtonId();
		RadioButton radio1 = (RadioButton)group1.findViewById(selectedId1);
		// group2 information
		RadioGroup group2 = (RadioGroup)findViewById(R.id.radioGroup2);
		int selectedId2 = group2.getCheckedRadioButtonId();
		RadioButton radio2 = (RadioButton)group2.findViewById(selectedId2);
		// show informations
		TextView textView = (TextView)findViewById(R.id.textView3);
		textView.setText(radio1.getText().toString() + " SELECTED\n" + radio2.getText().toString() + " SELECTED");
	}
}
