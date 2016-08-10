package com.example.zhaoxin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.photo.R;
import com.example.yijiajun.WangjimimaActivity;
import com.example.zhaoliusheng.ZhongxinActivity;

public class Activity_mimadenglu extends Activity{
	ImageView imageview_fanhui_shoujidenglu;
	EditText edit_shoujihao_mimadenglu;
	EditText edit_shurunima_mimadenglu;
	TextView textview_fanhuishoujidenglu;
	ImageView image_denglu_mimadenglu;
	TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
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
		//edit_shurunima_mimadenglu.setOnClickListener(clickListener);
		textView=(TextView)findViewById(R.id.textView_wangjimima);
		textView.setOnClickListener(clickListener);
		edit_shoujihao_mimadenglu=(EditText) findViewById(R.id.edit_shoujihaoma_mimadenglu);
		textview_fanhuishoujidenglu=(TextView) findViewById(R.id.text_fanhuishoujidenglu);
		textview_fanhuishoujidenglu.setOnClickListener(clickListener);
	}
	OnClickListener clickListener=new OnClickListener() {
		
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
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
			case R.id.textView_wangjimima://跳转到忘记密码
				Intent intent=new Intent(Activity_mimadenglu.this,WangjimimaActivity.class);
				startActivity(intent);
				break;
			/*case R.id.image_denglu_mimadenglu:
				String str=edit_shoujihao_mimadenglu.getText().toString();
				if(str.equals("")){
					Toast.makeText(Activity_mimadenglu.this, "手机号不能为空", Toast.LENGTH_SHORT).show();
					return;
				}if(str.length()!=11){
					Toast.makeText(Activity_mimadenglu.this, "请输入正确的手机号", Toast.LENGTH_SHORT).show();
					
				} 
				
				break;*/
			default:
				break;
			}
		}
	};
	public void denglu(){
		Intent intent=new Intent(this,ZhongxinActivity.class);
		startActivity(intent);
	}
	public void fanhui_shouye_denglu(){       //进入手机登录界面
		Intent intent=new Intent(this,Activity_shoujidenglu.class);
		startActivity(intent);
	}
}
