package com.example.zhengshaopeng;

import com.example.photo.R;
import com.example.zhaoliusheng.ZhongxinActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class Sequare extends Activity {//广场1
	ImageView imageview;
	ImageView imageview2;
	ToggleButton toggle;
	Switch switcher;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.square);

		imageview = (ImageView) findViewById(R.id.sequare_imageview);

		imageview.setOnClickListener(onClick);
		imageview2 = (ImageView) findViewById(R.id.sequare_rightarrow);

		imageview2.setOnClickListener(onClick);
	}
		OnClickListener onClick = new OnClickListener() {

			@Override
			public void onClick(View v) {

				switch (v.getId()) {
				// 广场Square跳转广场SequareTwo
				case R.id.sequare_imageview:
					Intent intent = new Intent(Sequare.this, ZhongxinActivity.class);//广场到ZhongxinActivity
					startActivity(intent);
					break;
				case R.id.sequare_rightarrow:
					Intent intent1 = new Intent(Sequare.this, SequareTwo.class);
					startActivity(intent1);
					break;
				}
			}

		};
	}

