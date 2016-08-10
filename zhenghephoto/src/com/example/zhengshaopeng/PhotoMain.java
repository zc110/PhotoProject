package com.example.zhengshaopeng;

import com.example.photo.R;
import com.example.zhaoliusheng.ZhongxinActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class PhotoMain extends Activity{//个人
	ImageView imageview;
	ImageView imageview2;
	TextView textview;
		public void onCreate(Bundle savedInstanceState){
			super.onCreate(savedInstanceState);
			setContentView(R.layout.photo_main);
			imageview=(ImageView)findViewById(R.id.photomain_imageview);
			imageview.setOnClickListener(onClick);
			imageview2=(ImageView)findViewById(R.id.imagview);
			imageview2.setOnClickListener(onClick);
			textview=(TextView)findViewById(R.id.geduo);
			textview.setOnClickListener(onClick);
		}
OnClickListener onClick=new OnClickListener(){

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.photomain_imageview:
		Intent intent=new Intent(PhotoMain.this,ZhongxinActivity.class);
		startActivity(intent);
		break;
		
		}
	}
	
};
}
		
