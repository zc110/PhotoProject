package com.example.photo;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PersonActivity extends Activity {
	Button button;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_person);
		button=(Button)findViewById(R.id.button_xieyi);
		button.setOnClickListener(l);
	}
	OnClickListener l=new OnClickListener(){
		public void onClick(View v) {
			finish();
			
		}
	};
}
