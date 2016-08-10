package com.example.zhaoxin;


import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.photo.R;


@SuppressLint("NewApi")
public class MyFaragment_shezhi extends FragmentActivity {
			ViewPager viewpager;
			ArrayList<Fragment> fragmentList;
			MyAdapter_shezhi myAdapter;
			RelativeLayout layout;
			ImageView imageview;
			
		@SuppressLint("NewApi")
		public void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.layout_fragment);
			getData();
			myAdapter=new MyAdapter_shezhi(getSupportFragmentManager(), fragmentList);
			viewpager=(ViewPager)findViewById(R.id.fragment_mine);
			viewpager.setAdapter(myAdapter);
			//layout=(RelativeLayout) getFragmentManager().findFragmentById(R.id.fragment1).getView().findViewById(R.id.shezhi_relativelayout);
			//layout.setOnClickListener(clickListener);
			//imageview=(ImageView)getFragmentManager().findFragmentById(R.id.fragment2).getView().findViewById(R.id.image_fanhui_gerenzhongxin);
			//imageview.setOnClickListener(clickListener2);
		}
		public void getData(){
			fragmentList=new ArrayList<Fragment>();
			Fragment_main1 fragment1=new Fragment_main1();
			fragmentList.add(fragment1);
			Fragment_main2 fragment2=new Fragment_main2();
			fragmentList.add(fragment2);
		}
		OnClickListener clickListener=new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch (v.getId()) {
				case R.id.shezhi_relativelayout:
					viewpager.setCurrentItem(1);
					break;

				default:
					break;
				}
			}
		};
		OnClickListener clickListener2=new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				switch (v.getId()) {
				case R.id.image_fanhui_gerenzhongxin:
					viewpager.setCurrentItem(0);
					break;

				default:
					break;
				}
			}
		};
}
