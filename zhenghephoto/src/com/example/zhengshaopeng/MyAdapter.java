package com.example.zhengshaopeng;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MyAdapter extends BaseAdapter {//myAdapter
	Context context;
	int resourceId;
	List<Map<String, Object>> lists;
	int[] viewId;
	String[] keys;
	LayoutInflater inflater;

	public MyAdapter() {

	}

	public MyAdapter(Context context, int resourceId,
			List<Map<String, Object>> lists, int[] viewId, String[] keys) {
		this.context = context;
		this.lists = lists;
		this.keys = keys;
		this.viewId = viewId;
		this.resourceId = resourceId;
		inflater = LayoutInflater.from(context);
	}

	public int getCount() {
		return lists.size();

	}

	public Object getItem(int position) {

		return lists.get(position);
	}

	public long getItemId(int position) {

		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = inflater.inflate(resourceId, null);
		}
		for (int i = 0; i < keys.length; i++) {

			View view = convertView.findViewById(viewId[i]);
			if (view instanceof ImageView) {
				ImageView imageview = (ImageView) view;
				int imageviewId = (Integer) lists.get(position).get(keys[i]);
				imageview.setImageDrawable(context.getResources().getDrawable(
						imageviewId));
			}
			if (view instanceof TextView){
				TextView textView=(TextView) view;
				Map<String,Object> map=lists.get(position);
				String text=map.get(keys[i]).toString();
				textView.setText(text);
			}
			
		}
		return convertView;
	}
}
