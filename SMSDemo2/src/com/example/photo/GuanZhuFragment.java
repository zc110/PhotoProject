package com.example.photo;

import java.util.ArrayList;
import java.util.List;



import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class GuanZhuFragment extends Fragment {
	ListView listView;
	ImageView imageview,image_fanhui;
	SlidingMenu mSlidingMenu;
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.activity_attention, container,false);
		View mainView=inflater.inflate(R.layout.activity_gerenzhongxin, null,false);
		listView = (ListView) v.findViewById(R.id.listview_attention);
		getData();
		mSlidingMenu=(SlidingMenu) mainView.findViewById(R.id.id_menu);
		
		image_fanhui=(ImageView)v.findViewById(R.id.openActivity);
		image_fanhui.setOnClickListener(l);
		
		imageview=(ImageView)v.findViewById(R.id.imageview_guanzhu);
		imageview.setOnClickListener(l);
		return v;
		
	}
	OnClickListener l=new OnClickListener() {
		public void onClick(View v) {
			switch(v.getId()){
			case R.id.imageview_guanzhu: 
				Intent intent=new Intent(getActivity(),LeoActivity.class);
				startActivity(intent);
				break;
			case R.id.openActivity:
				mSlidingMenu.toggle();	
				break;
			case R.id.textview_guanzhu:
				
				mSlidingMenu.closeMenu();
				break;
			default:
				break;
			}
		}
	};
	public void toggleMenu(View view){
		mSlidingMenu.toggle();
	}
	public void getData() {
			List<PhotoInfo> list = new ArrayList<PhotoInfo>();
				
			PhotoInfo photoinfo = new PhotoInfo();
			photoinfo.setImageBackground(R.drawable.xiaoyuanfengjing);
			photoinfo.setImageHead(R.drawable.yuanhead);
			photoinfo.setName("Leo");
			photoinfo.setTime("2天前");
			photoinfo.setText("那年夏天，我们\n最后" + " 一次走过校园的林荫大道， "
					+ " \n走向野心勃勃欲不可知的未来");
			photoinfo.setLastCard(R.drawable.lastactivity);
			list.add(photoinfo);
			
			PhotoInfo photoinfo1 = new PhotoInfo();
			photoinfo1.setImageBackground(R.drawable.xiaoyuanfengjing);
			photoinfo1.setImageHead(R.drawable.yuanhead);
			photoinfo1.setName("Leo");
			photoinfo1.setTime("2天前");
			photoinfo1.setText("那年夏天，我们\n最后" + " 一次走过校园的林荫大道， "
					+ " \n走向野心勃勃欲不可知的未来");
			photoinfo1.setLastCard(R.drawable.lastactivity);
			list.add(photoinfo1);
			
			
			MyAdapter myAdapter = new MyAdapter(
					R.layout.activity_attention_two, list, getActivity());
			listView.setAdapter(myAdapter);
		}
	

}
