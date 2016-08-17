package com.example.photo;

import java.util.List;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageButton;

public class LeoActivity extends Activity{
    ImageButton leo_back,turnActivity,imbutton;
    List<View>  list;
    CheckBox checkBox;
    LayoutInflater inflater ; 
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_leo);
	imbutton=(ImageButton)findViewById(R.id.imagebutton);
	imbutton.setOnClickListener(clickListener);
	leo_back=(ImageButton)findViewById(R.id.leo_back);
	leo_back.setOnClickListener(clickListener);
	checkBox=(CheckBox)findViewById(R.id.checkBox);
	checkBox.setOnClickListener(clickListener);
	turnActivity=(ImageButton)findViewById(R.id.turnActivity);
	turnActivity.setOnClickListener(clickListener);
   }
	@SuppressLint("NewApi")
	OnClickListener clickListener=new OnClickListener() {
			public void onClick(View v) {
				Intent intent;
				switch(v.getId()){
				case R.id.imagebutton:
					//intent=new Intent(LeoActivity.this,XuanmobanActivity.class);
					//startActivity(intent);
					break;
				case R.id.leo_back:
					finish();
					break;
				case R.id.checkBox:
					if(checkBox.isChecked()){
					    checkBox.setBackground(getResources().getDrawable(R.drawable.check));		
						}else{
						checkBox.setBackground(getResources().getDrawable(R.drawable.notchecked));	
						}
					break;
				case R.id.turnActivity:
					intent=new Intent( LeoActivity.this,CardActivity.class);
					startActivity(intent);
					break;
				default:
					break;
			    }
			}
	};	
}
