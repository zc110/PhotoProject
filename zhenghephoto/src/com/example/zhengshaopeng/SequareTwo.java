package com.example.zhengshaopeng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.photo.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.GridView;
import android.widget.ImageView;

public class SequareTwo extends Activity {// 广场2
	GridView gridView;
	List<Map<String, Object>> lists = new ArrayList<Map<String, Object>>();
	String[] keys = { "picture", "str" };
	int[] viewId = { R.id.fengjing_imageview, R.id.textView_fengjing };
	MyAdapter myAdapter;
	ImageView imageview1;
	ImageView imageview2;
	ImageView imageview3;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sequare_two);
		gridView = (GridView) findViewById(R.id.gridview_SequareTwo);
		getData();
		myAdapter = new MyAdapter(this, R.layout.fengjing, lists, viewId, keys);
		gridView.setAdapter(myAdapter);

		imageview2 = (ImageView) findViewById(R.id.sequaretwo_imageview);

		imageview2.setOnClickListener(onClick);
	}

	OnClickListener onClick = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub

		}
	};

	public void getData() {
		Map<String, Object> map = new HashMap<String, Object>();
		for (int i = 0; i < 10; i++) {
			map.put("picture", R.drawable.fengjing_one);
			map.put("str", "Leo");
			lists.add(map);
		}
	}

}
