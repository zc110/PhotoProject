package com.example.kaoshiti;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DengLuActivity extends Activity{
Button button_deng_lu;
Button button_zhu_ce;
    String []userName={"xiaoming","xiaohua","xiaoli",};
	int [] password={110,111,112};	
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_deng_lu);
	
	button_deng_lu=(Button)findViewById(R.id.button_deng_lu);
	button_deng_lu.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			DengLuJieMian();		
		}
	});
	
	button_zhu_ce=(Button)findViewById(R.id.button_zhu_ce);
	
	button_zhu_ce.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			zhuCe();
			
		}
	});
	
	}
	
	
	public void zhuCe(){	
		Intent intent=new Intent(this,ZhuCeActivity.class);
		startActivity(intent);
	}
    
	 public void dengLu(){
	Intent intent=new Intent(this,YingYongActivity.class);
	startActivity(intent);
	
	
}

	 public void DengLuJieMian(){
		EditText editTextName=(EditText) findViewById(R.id.edittext_yong_hu_shu_ru);
		 String textName=editTextName.getText().toString();
		 EditText editTextMiMa=(EditText) findViewById(R.id.edittext_mi_ma_shu_ru);
		 String textMiMa=editTextMiMa.getText().toString();
	 
		if(editTextName.getText().equals(textName)){
			Intent intent=new Intent(this,YingYongActivity.class);
		   Toast.makeText(this, "登录成功", Toast.LENGTH_LONG).show();
		}else{
			 Toast.makeText(this, "密码或用户名错误", Toast.LENGTH_LONG).show();
		}
		 
		 
		 
	 }
	 
	 
	 
}
