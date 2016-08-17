package com.example.photo;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class Activity_jianxing_denglu extends Activity{
	TextView textview_shouye_denglu;
	TextView textview_shouye_zhuce;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jianxing_denglu_layout);
		shouyedenglu();
	}
	public void shouyedenglu(){
		textview_shouye_denglu=(TextView) findViewById(R.id.text_shouye_denglu);
		textview_shouye_denglu.setOnClickListener(clickListener);
		textview_shouye_zhuce=(TextView) findViewById(R.id.text_shouye_zhuce);
		textview_shouye_zhuce.setOnClickListener(clickListener);
	}
	OnClickListener clickListener=new OnClickListener() {
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.text_shouye_denglu:
				shouye_denglu_tianzhuan();
				break;
			case R.id.text_shouye_zhuce:
				zhuce();
				break;
			default:
				break;
			}
		}
	};
	public void shouye_denglu_tianzhuan(){
		Intent intent=new Intent(this,Activity_shoujidenglu.class);
		startActivity(intent);
	}
	public void zhuce(){
		Intent intent=new Intent(this,YouxiangzhuceActivity.class);
		startActivity(intent);
	}
}