package com.example.photo;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class AboveJianXing extends Activity {// ���ڼ���
	ImageView backShiZhi;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_abovejianxing);
		turnSheZhi();// ��������ҳ��
	}
	public void turnSheZhi() {
		backShiZhi = (ImageView) findViewById(R.id.back_shezhi);
		backShiZhi.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

	}
}
