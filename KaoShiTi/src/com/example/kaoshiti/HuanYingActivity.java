package com.example.kaoshiti;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;



public class HuanYingActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_huan_ying);
	    TiaoZhuan();
	
	}
	
	
	
	
	
	  @SuppressWarnings("static-access")
	public void TiaoZhuan() {
		
		  Thread thread=new Thread();
		  try {
			thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Intent intent = new Intent();
		 intent.setClass(this, DengLuActivity.class);
		
		
		startActivity(intent);
	}


}
