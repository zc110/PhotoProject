package com.example.yijiajun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.photo.R;
import com.example.zhaoxin.Activity_jianxing_denglu;
import com.example.zhaoxin.Activity_mimadenglu;

public class ShoujizhuceActivity extends Activity {
	ImageView imageview;
	Button button_huoquyanzhengma;
	EditText editText_shoujihaoma;
	EditText editText_yanzhengma;
	Button button_zhuce;
	TextView textView_youxiangdenglu;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shoujizhuce);
		getId();
	}

	OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.shoujizhuece_huoquyanzhengma:
				huoquyanzhengma();
				break;
			case R.id.shoujizhece_zhuce:
				zhuce();
				break;
			case R.id.shoujizhuce_youxiangdenglu:
				tiaozhuangdaoyouxiangdenglu();
				break;
			case R.id.shoujizhuce_fanhui:
				shouye();
				break;
			default:
				break;
			}
		}
	};

	public void getId() {
		editText_shoujihaoma = (EditText) findViewById(R.id.shoujizhuce_shoujihaoma);
		editText_yanzhengma = (EditText) findViewById(R.id.shoujizhece_yanzhengma);
		button_huoquyanzhengma = (Button) findViewById(R.id.shoujizhuece_huoquyanzhengma);
		button_huoquyanzhengma.setOnClickListener(onClickListener);
		button_zhuce = (Button) findViewById(R.id.shoujizhece_zhuce);
		button_zhuce.setOnClickListener(onClickListener);
		textView_youxiangdenglu=(TextView)findViewById(R.id.shoujizhuce_youxiangdenglu);
		textView_youxiangdenglu.setOnClickListener(onClickListener);
		imageview=(ImageView)findViewById(R.id.shoujizhuce_fanhui);
		imageview.setOnClickListener(onClickListener);
	}

	public void huoquyanzhengma() {

		String str_shoujihaoma = editText_shoujihaoma.getText().toString();
		String str_yanzhengma = editText_yanzhengma.getText().toString();
		
		if (str_shoujihaoma.equals("")) {
			Toast.makeText(ShoujizhuceActivity.this, "手机号码不能为空",
					Toast.LENGTH_SHORT).show();
		} else if (str_shoujihaoma.length() != 11) {
			Toast.makeText(ShoujizhuceActivity.this, "请输入正确的手机号码",
					Toast.LENGTH_SHORT).show();
		} else if (str_yanzhengma.equals("")) {
			Toast.makeText(ShoujizhuceActivity.this, "验证码不能为空",
					Toast.LENGTH_SHORT).show();
		}
	}
public void tiaozhuangdaoyouxiangdenglu(){
	Intent intent=new Intent(ShoujizhuceActivity.this,Activity_mimadenglu.class);
	startActivity(intent);
}
	public void zhuce() {
		String str_shoujihaoma = editText_shoujihaoma.getText().toString();
		String str_yanzhengma = editText_yanzhengma.getText().toString();

		if (str_shoujihaoma.equals("")) {
			Toast.makeText(ShoujizhuceActivity.this, "手机号码不能为空",
					Toast.LENGTH_SHORT).show();
		} else if (str_shoujihaoma.length() != 11) {
			Toast.makeText(ShoujizhuceActivity.this, "请输入正确的手机号码",
					Toast.LENGTH_SHORT).show();
		} else if (str_yanzhengma.equals("")) {
			Toast.makeText(ShoujizhuceActivity.this, "验证码不能为空",
					Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(ShoujizhuceActivity.this, "注册成功", Toast.LENGTH_SHORT)
					.show();
			shouye();
			return;
		}
	}
	public void shouye(){
		Intent intent= new Intent(ShoujizhuceActivity.this,
				Activity_jianxing_denglu.class);
		startActivity(intent);
	}
}
