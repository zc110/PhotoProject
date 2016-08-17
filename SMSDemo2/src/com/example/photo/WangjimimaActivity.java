package com.example.photo;
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

public class WangjimimaActivity extends Activity {
	Button button_huoquyanzhengma;
	Button button_denglu;
	EditText editText_shoujihaoma;
	EditText editText_yanzhengma;
	EditText editText_chongzhimima;
	EditText editText_quedingmima;
	ImageView imageview_fanhui;
	TextView textview_youxiangdenglu;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wangjimima);
		getId();		
	}
	public void getId() {
		// �ҵ�id
		button_huoquyanzhengma = (Button) findViewById(R.id.wangjimima_huoquyanzhengma);
		button_denglu = (Button) findViewById(R.id.wangjimima_denglu);
		editText_shoujihaoma = (EditText) findViewById(R.id.wangjimima_shoujihaoma);
		editText_yanzhengma = (EditText) findViewById(R.id.wangjimima_yanzhengma);
		editText_chongzhimima = (EditText) findViewById(R.id.wangjimima_chongzhimima);
		editText_quedingmima = (EditText) findViewById(R.id.wangjimima_quedingmima);
		imageview_fanhui=(ImageView)findViewById(R.id.wangjimima_fanhui);
		textview_youxiangdenglu=(TextView)findViewById(R.id.wangjimima_youxiangdenglu);
		// ����¼�
		button_huoquyanzhengma.setOnClickListener(onclick);
		button_denglu.setOnClickListener(onclick);
		editText_shoujihaoma.setOnClickListener(onclick);
		editText_yanzhengma.setOnClickListener(onclick);
		editText_chongzhimima.setOnClickListener(onclick);
		editText_quedingmima.setOnClickListener(onclick);
		imageview_fanhui.setOnClickListener(onclick);
		textview_youxiangdenglu.setOnClickListener(onclick);
	}

	OnClickListener onclick = new OnClickListener() {
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.wangjimima_huoquyanzhengma:
				huoquyanzhengma();
				break;
			case R.id.wangjimima_denglu:
				denglu();
				break;
			case R.id.wangjimima_fanhui:
			
				fanhuishouye();
				break;
			case R.id.wangjimima_youxiangdenglu:
				youxiangdenglu();
				break;
			default:
				break;
			}
		}
	};

public void huoquyanzhengma(){
	String str_shoujihaoma = editText_shoujihaoma.getText().toString();
	String str_yanzhengma = editText_yanzhengma.getText().toString();
	
	if (str_shoujihaoma.equals("")) {
		Toast.makeText(WangjimimaActivity.this, "�ֻ����벻��Ϊ��",
				Toast.LENGTH_SHORT).show();
		return;
	} else if (str_shoujihaoma.length() != 11) {
		Toast.makeText(WangjimimaActivity.this, "��������ȷ���ֻ�����",
				Toast.LENGTH_SHORT).show();
		return;
	}else if(str_yanzhengma.equals("")){
		Toast.makeText(WangjimimaActivity.this, "��֤�벻��Ϊ��",
				Toast.LENGTH_SHORT).show();
		return;
		}
}

public void youxiangdenglu(){
	Intent intent=new Intent(WangjimimaActivity.this,Activity_mimadenglu.class);
	startActivity(intent);
}
public void fanhuishouye(){
	Intent intent=new Intent(WangjimimaActivity.this,Activity_jianxing_denglu.class);
	startActivity(intent);
}
public void dengluchengong(){
	Intent intent=new Intent(WangjimimaActivity.this,MainActivity.class);
	startActivity(intent);
}

	public boolean denglu() {
		String str_shoujihaoma = editText_shoujihaoma.getText().toString();
		String str_yanzhengma = editText_yanzhengma.getText().toString();
	
		String str_diyicimima = editText_chongzhimima.getText().toString();
		String str_diercimima = editText_quedingmima.getText().toString();
		if (str_shoujihaoma.equals("")) {
			Toast.makeText(WangjimimaActivity.this, "�ֻ����벻��Ϊ��",
					Toast.LENGTH_SHORT).show();
		} else if (str_shoujihaoma.length() != 11) {
			Toast.makeText(WangjimimaActivity.this, "��������ȷ���ֻ�����",
					Toast.LENGTH_SHORT).show();
		}else if(str_yanzhengma.equals("")){
			Toast.makeText(WangjimimaActivity.this, "��֤�벻��Ϊ��",
					Toast.LENGTH_SHORT).show();
		} else if (str_diyicimima.equals("") || str_diercimima.equals("")) {
			Toast.makeText(WangjimimaActivity.this, "���벻��Ϊ��",
					Toast.LENGTH_SHORT).show();
		} else if (str_diyicimima.equals(str_diercimima)) {
			Toast.makeText(WangjimimaActivity.this, "��¼�ɹ�", Toast.LENGTH_SHORT)
					.show();
			dengluchengong();
			return true;
		} else {
			Toast.makeText(WangjimimaActivity.this, "�������벻һ��������������",
					Toast.LENGTH_SHORT).show();
		}

		return true;
	}
	public void tiaozhuanyouxiangdenglu(){
		Intent intent=new Intent(WangjimimaActivity.this,Activity_mimadenglu.class);
		startActivity(intent);
	}
}
