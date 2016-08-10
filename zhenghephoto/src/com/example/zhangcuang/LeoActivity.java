package com.example.zhangcuang;

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

import com.example.photo.R;

public class LeoActivity extends Activity{
    ImageButton leo_back,turnActivity;
	
    List<View>  list;
    CheckBox checkBox;
  
    LayoutInflater inflater ; 
   @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_leo);
	backSingle();
	checkChange();
	turnCard();
   }
	//public void Back
	
   public void backSingle(){
		leo_back=(ImageButton)findViewById(R.id.leo_back);
		leo_back.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				@SuppressWarnings("unused")
				Intent intent=new Intent( LeoActivity.this,AttentionActivity.class);
				 startActivity(intent);
			}
		});
	}

   public void checkChange(){
	   checkBox=(CheckBox)findViewById(R.id.checkBox);
	   checkBox.setOnClickListener(new OnClickListener() {
		
		@SuppressLint("NewApi")
		@Override
		public void onClick(View v) {
			if(checkBox.isChecked()){
		    checkBox.setBackground(getResources().getDrawable(R.drawable.check));		
			
			}else{
				 checkBox.setBackground(getResources().getDrawable(R.drawable.notchecked));	
			}
			
		}
	});
   }
  
	
	public void turnCard(){
		turnActivity=(ImageButton)findViewById(R.id.turnActivity);
		turnActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent=new Intent( LeoActivity.this,CardActivity.class);
				 startActivity(intent);
				
			}
		});
	
	
	}
	
	
	

}
