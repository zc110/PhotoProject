package com.example.zhaoxin;

import com.example.photo.R;
import com.example.zhaoliusheng.ZhongxinActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_shoujidenglu extends Activity{
	ImageView imageview_fanhui_shouyedenglu;
	EditText edit_shoujihao;
	EditText edit_yanzhengma;
	ImageView imageview_huoquyanzhengma;
	TextView text_jinrumimadenglu;
	ImageView imageView_denglu;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shoujidenglu_layout);
		getData();
	}
	public void getData(){
		text_jinrumimadenglu=(TextView) findViewById(R.id.text_jinruyouxiangdenglu);
		text_jinrumimadenglu.setOnClickListener(clickListener);
		imageview_fanhui_shouyedenglu=(ImageView) findViewById(R.id.image_shoujidenglu_fanhui);
		imageview_fanhui_shouyedenglu.setOnClickListener(clickListener);
		edit_yanzhengma=(EditText) findViewById(R.id.edit_yanzhengma);
		edit_shoujihao=(EditText) findViewById(R.id.edit_shoujihaoma);
		imageview_huoquyanzhengma=(ImageView) findViewById(R.id.image_huoqyyanzhengma);
		imageview_huoquyanzhengma.setOnClickListener(clickListener);
		imageView_denglu=(ImageView) findViewById(R.id.shoujidenglu_denglu);
		imageView_denglu.setOnClickListener(clickListener);
	}
	OnClickListener clickListener=new OnClickListener() {
		
		@SuppressWarnings("unused")
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.image_shoujidenglu_fanhui:
				fanhui_shouye_denglu();
				break;
			case R.id.text_jinruyouxiangdenglu:
				jinrumimadenglu();
				break;
			case R.id.shoujidenglu_denglu:
				denglu();
				break;
			case R.id.image_huoqyyanzhengma:
				String str=edit_shoujihao.getText().toString();
				if(str.equals("15683831953")&&str!=null){
				edit_yanzhengma.setText("4521");
				return;}
				if(str.equals("")){
					Toast.makeText(Activity_shoujidenglu.this, "手机号不能为空", Toast.LENGTH_SHORT).show();
					return;
				}if(str.length()!=11){
					Toast.makeText(Activity_shoujidenglu.this, "请输入正确的手机号", Toast.LENGTH_SHORT).show();
					return;
				}
					
				
				
				break;
			default:
				break;
			}
		}
	};
	public void denglu(){
		Intent intent=new Intent(this,ZhongxinActivity.class);
		startActivity(intent);
	}
	public void fanhui_shouye_denglu(){//返回首页界面
		Intent intent=new Intent(this,Activity_jianxing_denglu.class);
		startActivity(intent);
	}
	public void jinrumimadenglu(){//进入邮箱登录界面
		Intent intent=new Intent(this,Activity_mimadenglu.class);
		startActivity(intent);
	}
}
