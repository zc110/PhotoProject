package com.example.photo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class MessAge extends Activity{//��Ϣ֪ͨ
ImageView image;
ImageView  message;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_message);
	backSheZhi();//�������ý���
	}
	public void backSheZhi(){
	
	message=(ImageView)findViewById(R.id.message);
	message.setOnClickListener(new OnClickListener() {	
		public void onClick(View v) {
			finish();
		}
	});	
	}
}
