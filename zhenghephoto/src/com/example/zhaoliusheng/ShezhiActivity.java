package com.example.zhaoliusheng;

import com.example.photo.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class ShezhiActivity extends Activity{
	ImageView imageview;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shezhi);
		imageview=(ImageView)findViewById(R.id.imageview_shezhi);
		imageview.setOnClickListener(clickListener);
	}
	OnClickListener clickListener=new OnClickListener(){
		public void onClick(View v) {
			Intent intent=new Intent(ShezhiActivity.this,ZhongxinActivity.class);
			startActivity(intent);
		}
	};
}
