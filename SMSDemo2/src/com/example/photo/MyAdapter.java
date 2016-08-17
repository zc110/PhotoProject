package com.example.photo;

import java.util.List;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	int ItemId;
	LayoutInflater inflater;
	List<PhotoInfo> list;
	Context context;

	public MyAdapter(int itemId, List<PhotoInfo> list, Context context) {
		super();
		this.ItemId = itemId;
		inflater = LayoutInflater.from(context);
		this.list = list;
		this.context = context;
	}

	public int getCount() {
		return list.size();
	}


	public Object getItem(int position) {
		return list.get(position);
	}


	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			convertView = inflater.inflate(ItemId, null);
		}
		ImageView imageBackground = (ImageView) convertView
				.findViewById(R.id.schoolImage);
		ImageView ImageHead = (ImageView) convertView.findViewById(R.id.head);
		TextView name = (TextView) convertView.findViewById(R.id.name);
		TextView time = (TextView) convertView.findViewById(R.id.time);
		TextView text = (TextView) convertView.findViewById(R.id.text);
		ImageView lastCard = (ImageView) convertView
				.findViewById(R.id.nextCard);

		PhotoInfo photoinfo = list.get(position);
		imageBackground.setImageDrawable(context.getResources().getDrawable(
				photoinfo.getImageBackground()));
		ImageHead.setImageDrawable(context.getResources().getDrawable(
				photoinfo.getImageHead()));
		name.setText(photoinfo.getName());
		time.setText(photoinfo.getTime());
		text.setText(photoinfo.getText());
		lastCard.setImageDrawable(context.getResources().getDrawable(
				photoinfo.getLastCard()));

		return convertView;
	}
}

