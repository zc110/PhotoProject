package com.example.yijiajun;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
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

public class YouxiangzhuceActivity extends Activity {
	Button button;
	EditText editText_youxiangzhanghao;
	EditText editText_shezhimima;
	TextView youxiang_shoujizhuce;
	DatabaseHelper databaseHelper;
	SQLiteDatabase sqliteDatabase;
	ImageView imageview_fanhui;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_youxiangzhuce);
		getId();
	}

	OnClickListener onClickListener = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.youxiang_zhuce:
				huoquyanzhengma();
				break;
			case R.id.shoujizhuce:
				tiaozhuan();
				break;
			case R.id.youxiangzhuce_fanhui:
				shouye();
				break;
			default:
				break;
			}
		}

	};

	@SuppressLint("NewApi")
	public void huoquyanzhengma() {
		String youxiang = editText_youxiangzhanghao.getText().toString();
		String mima = editText_shezhimima.getText().toString();

		if (youxiang.equals("")) {

			Toast.makeText(YouxiangzhuceActivity.this, "请输入邮箱",
					Toast.LENGTH_SHORT).show();
			return;
		} else if (mima.equals("")) {
			Toast.makeText(YouxiangzhuceActivity.this, "请输入密码",
					Toast.LENGTH_SHORT).show();
		} else {
			Toast.makeText(YouxiangzhuceActivity.this, "注册成功",
					Toast.LENGTH_SHORT).show();
			add();
			shouye();
			return;
		}

	}

	public void getId() {
		button = (Button) findViewById(R.id.youxiang_zhuce);
		button.setOnClickListener(onClickListener);
		editText_youxiangzhanghao = (EditText) findViewById(R.id.youxiang_zhanghao);
		editText_shezhimima = (EditText) findViewById(R.id.youxiang_shezhimima);
		youxiang_shoujizhuce = (TextView) findViewById(R.id.shoujizhuce);
		youxiang_shoujizhuce.setOnClickListener(onClickListener);
		imageview_fanhui=(ImageView)findViewById(R.id.youxiangzhuce_fanhui);
		imageview_fanhui.setOnClickListener(onClickListener);
		this.getDir("user", Context.MODE_PRIVATE);

	}

	public void tiaozhuan() {
		Intent intent = new Intent(YouxiangzhuceActivity.this,
				ShoujizhuceActivity.class);
		startActivity(intent);
		
	}
	public void shouye(){
		Intent intent= new Intent(YouxiangzhuceActivity.this,
				Activity_jianxing_denglu.class);
		startActivity(intent);
	}

	public void creatsql() {// 创建数据库
		databaseHelper = new DatabaseHelper(this, "Youxiang", null, 1);
		sqliteDatabase = databaseHelper.getWritableDatabase();
	}

	public void add() {
		creatsql();
		String youxiang = editText_youxiangzhanghao.getText().toString();
		String mima = editText_shezhimima.getText().toString();
		ContentValues cv = new ContentValues();
		cv.put("usename", youxiang);
		cv.put("password", mima);
		sqliteDatabase.insert("youxiang", null, cv);

	}
}
