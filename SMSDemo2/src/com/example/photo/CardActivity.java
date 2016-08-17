package com.example.photo;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


public class CardActivity extends Activity{
ImageButton  buttonBack;
	
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_photo_card);
		BackAttention();
	}

   public void BackAttention(){
	 buttonBack=(ImageButton)findViewById(R.id.card_back);
	 buttonBack.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {			
		Intent intent=new Intent(CardActivity.this, LeoActivity.class);
	    startActivity(intent);
			    
		}
	});
	
   
   }


}
