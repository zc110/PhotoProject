package com.example.photo;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_mimadenglu extends Activity{
	ImageView imageview_fanhui_shoujidenglu;
	EditText edit_shoujihao_mimadenglu;
	EditText edit_shurunima_mimadenglu;
	TextView textview_fanhuishoujidenglu;
	ImageView image_denglu_mimadenglu;
	TextView textView;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_mimadenglu);
		getData();
	}
	public void getData(){
		image_denglu_mimadenglu=(ImageView) findViewById(R.id.image_denglu_mimadenglu);
		image_denglu_mimadenglu.setOnClickListener(clickListener);
		imageview_fanhui_shoujidenglu=(ImageView) findViewById(R.id.image_mimadenglu_fanhui);
		imageview_fanhui_shoujidenglu.setOnClickListener(clickListener);
		edit_shurunima_mimadenglu=(EditText) findViewById(R.id.edit_shurumima_mimadenglu);
		textView=(TextView)findViewById(R.id.textView_wangjimima);
		textView.setOnClickListener(clickListener);
		edit_shoujihao_mimadenglu=(EditText) findViewById(R.id.edit_shoujihaoma_mimadenglu);
		textview_fanhuishoujidenglu=(TextView) findViewById(R.id.text_fanhuishoujidenglu);
		textview_fanhuishoujidenglu.setOnClickListener(clickListener);
	}
	OnClickListener clickListener=new OnClickListener() {
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.image_mimadenglu_fanhui:
				fanhui_shouye_denglu();
				break;
			case R.id.text_fanhuishoujidenglu:
				fanhui_shouye_denglu();
				break;
			case R.id.image_denglu_mimadenglu:
				denglu();
				break;
			case R.id.textView_wangjimima:
				Intent intent=new Intent(Activity_mimadenglu.this,WangjimimaActivity.class);
				startActivity(intent);
				break;
			default:
				break;
			}
		}
	};
	public void denglu(){
		Intent intent=new Intent(this,com.example.photo.MainActivity.class);
		startActivity(intent);
	}
	public void fanhui_shouye_denglu(){ 
		Intent intent=new Intent(this,Activity_shoujidenglu.class);
		startActivity(intent);
	}
}
