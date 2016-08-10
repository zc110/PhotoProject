package com.example.zhangcuang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.photo.R;
import com.example.zhaoliusheng.ZhongxinActivity;



public class AttentionActivity extends Activity {
ImageButton	openActivity,openSinmple;
	ListView listView;
	SimpleAdapter simpleAdapter;
	private ArrayList<String> list = new ArrayList<String>();
	// ArrayAdapter arrayAdapter;// 声明适配器
	List<Map<String, Object>> listData = new ArrayList<Map<String, Object>>();

	@SuppressWarnings("unused")
	private String[] keys = { "imageBackground", "imageHead", "name", "time",
			"text", "lastCard" };
	private int viewId[] = { R.id.schoolImage, R.id.head, R.id.name, R.id.time,
			R.id.text, R.id.nextCard };

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attention);
		getData();
		turnNextLeo();
		backZhongXin();
		turnLeo();
	}

	public void backZhongXin(){
		openActivity=(ImageButton)findViewById(R.id.openActivity);
		openActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				@SuppressWarnings("unused")
				Intent intent=new Intent(AttentionActivity.this,ZhongxinActivity.class);
				 startActivity(intent);
			}
		});
	}
	public void turnLeo(){
		openSinmple=(ImageButton)findViewById(R.id.openSinmple);
		openSinmple.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				@SuppressWarnings("unused")
				Intent intent=new Intent(AttentionActivity.this,CardActivity.class);
				 startActivity(intent);
			}
		});
	}
	
	
	
	public void getData() {
		listView = (ListView) findViewById(R.id.listview_attention);
		// arrayAdapter=new
		// ArrayAdapter(AttentionActivity.this,R.layout.activity_attention_two,keys,viewId,list);//传入一个item布局
		// listView.setAdapter(arrayAdapter);
		for (int i = 0; i < 8; i++) {
			@SuppressWarnings("unused")
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("imageBackground", R.id.schoolImage);
			map.put("imageHead", R.id.head);
			map.put("name", "Leo");
			map.put("time", "2天前");
			map.put("text", "那年夏天，我们\n最后" + " 一次走过校园的林荫大道， "
					+ " \n走向野心勃勃欲不可知的未来");
			map.put("lastCard", R.drawable.lastactivity);
			listData.add(map);
			simpleAdapter = new SimpleAdapter(AttentionActivity.this,
					listData, R.layout.activity_attention_two, keys, viewId);
			listView.setAdapter(simpleAdapter);
		}
	}

	public void turnNextLeo() {
		// listView = (ListView) findViewById(R.id.listview_attention);
		listView.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				@SuppressWarnings("unused")
				ImageButton nextCard = (ImageButton) findViewById(R.id.nextCard);
				if (listView.getTag(position).equals("nextCard")) {
					Intent intent = new Intent(AttentionActivity.this,
							LeoActivity.class);
					startActivity(intent);
				}
			}

			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}

		});

	}
}
