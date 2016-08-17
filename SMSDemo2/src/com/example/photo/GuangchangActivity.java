package com.example.photo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class GuangchangActivity extends Activity{
	ImageView image;
	ListView listview;
	SimpleAdapter simpleAdapter;
	List<Map<String,Object>> lists=new ArrayList<Map<String,Object>>();
	String[] keys={"img1","img2"};
	int[] viewIds={R.id.fuyetu1,R.id.fuyetu2};
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guangchang_fuye);
		listview=(ListView)findViewById(R.id.fuye_guang);
		image=(ImageView)findViewById(R.id.imageview_guangchang);
		image.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();	
			}
		});
		getData();
		simpleAdapter =new SimpleAdapter(this,lists,R.layout.guangchang_fuye_2,
				keys,viewIds);
		listview.setAdapter(simpleAdapter);
	}
	private void getData() {
		List<PhotoInfo> list = new ArrayList<PhotoInfo>();
		LayoutInflater inflater = (LayoutInflater)getSystemService(
				Context.LAYOUT_INFLATER_SERVICE);
		View headView = inflater.inflate(R.layout.activity_guangchang_head, null);
		listview.addHeaderView(headView);
		
		Map<String,Object> map=new HashMap<String,Object>();
		map.put("img1", R.drawable.tu4);
		map.put("img2", R.drawable.tu3);
		lists.add(map);
		
		map=new HashMap<String,Object>();
		map.put("img1", R.drawable.tu1);
		map.put("img2", R.drawable.tu2);
		lists.add(map);
		
		map=new HashMap<String,Object>();
		map.put("img1", R.drawable.tu3);
		map.put("img2", R.drawable.tu4);
		lists.add(map);
		
		map=new HashMap<String,Object>();
		map.put("img1", R.drawable.tu2);
		map.put("img2", R.drawable.tu1);
		lists.add(map);
	}
}
