package com.example.zhaoliusheng;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import com.example.photo.R;
import com.example.zhangcuang.AttentionActivity;
import com.example.zhengshaopeng.PhotoMain;
import com.example.zhengshaopeng.Sequare;

public class ZhongxinActivity extends FragmentActivity {
	TextView text_geren;
	TextView text_guangchang;
	TextView text_guanzhu;
	TextView text_shezhi;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_zhongxin);
		text_geren = (TextView) findViewById(R.id.textview_geren);
		text_geren.setOnClickListener(clickListener);

		text_guangchang = (TextView) findViewById(R.id.textview_guangchang);
		text_guangchang.setOnClickListener(clickListener);

		text_guanzhu = (TextView) findViewById(R.id.textview_guanzhu);
		text_guanzhu.setOnClickListener(clickListener);

		text_shezhi = (TextView) findViewById(R.id.textview_shezhi);
		text_shezhi.setOnClickListener(clickListener);
	}

	OnClickListener clickListener = new OnClickListener() {
		public void onClick(View v) {
			
			switch (v.getId()) {
			case R.id.textview_geren:
				Intent intent = new Intent(ZhongxinActivity.this, PhotoMain.class);// ZhongxinActivity到PhotoMain
				startActivity(intent);
				text_geren.setBackgroundColor(getResources().getColor(
						R.color.hongse));
				break;

			case R.id.textview_guangchang:
				Intent intent1 = new Intent(ZhongxinActivity.this, Sequare.class);// ZhongxinActivity到广场
				startActivity(intent1);
				text_guangchang.setBackgroundColor(getResources().getColor(
						R.color.hongse));
				break;
			case R.id.textview_guanzhu:
				Intent intent2 = new Intent(ZhongxinActivity.this,
						AttentionActivity.class);// ZhongxinActivity到广场
				startActivity(intent2);
				text_guanzhu.setBackgroundColor(getResources().getColor(
						R.color.hongse));
				break;
			case R.id.textview_shezhi:
				Intent intent3 = new Intent(ZhongxinActivity.this, ShezhiActivity.class);// ZhongxinActivity到广场
				startActivity(intent3);
				text_shezhi.setBackgroundColor(getResources().getColor(
						R.color.hongse));
				break;
			default:
				break;
			}
		}
	};
}
