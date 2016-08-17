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

public class ClearActivity extends Activity {
	ListView listview;
	ImageView image_huancun;
	SimpleAdapter simpleAdapter;// ����simpleAdapter
	// List<String> list=new ArrayList<String>();
	List<Map<String, Object>> listData = new ArrayList<Map<String, Object>>();

	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.activity_clear_huancun);
		image_huancun=(ImageView)findViewById(R.id.imageview_huancun);
		image_huancun.setOnClickListener(l);
		
		listview = (ListView) findViewById(R.id.listview_clear);// �ҵ�listview
		LayoutInflater lif = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);// ��ͼת����
		View headerView = lif.inflate(R.layout.activity_clear_head, null);// ����ͼת������layoutת����view
		listview.addHeaderView(headerView);// ��ӵ�listview����ȥ
		String[] keys = { "img", "text_qq", "text_qingli", "count", "btn" };
		int[] viewId = { R.id.head_qq, R.id.text_qq, R.id.qingli,
				R.id.count_mb, R.id.btn };

		simpleAdapter = new SimpleAdapter(ClearActivity.this, listData,
				R.layout.activity_clear_midle, keys, viewId);
		listview.setAdapter(simpleAdapter);// ����������
		getData();// ��ȡ����
	}
	OnClickListener l=new OnClickListener(){
		public void onClick(View v) {
			finish();		
		}
	};
	public void getData() {
		for (int i = 0; i < 30; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("img", R.drawable.qqtou);
			map.put("text_qq", "QQ");
			map.put("text_qingli", " ��������");
			map.put("count", "8MB");
			map.put("btn", "");
			listData.add(map);
		}
	}
}
