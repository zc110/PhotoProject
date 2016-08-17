package com.example.photo;

import java.util.ArrayList;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends FragmentActivity{
	TextView text_geren,text_guangchang,text_guanzhu,text_shezhi;
	private SlidingMenu mSlidingMenu;
	MyFragmentAdapter mAdapter;
	ViewPager viewpager;
	ArrayList<Fragment> fragmentList;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gerenzhongxin);
		getData();
		mAdapter=new MyFragmentAdapter(getSupportFragmentManager(), fragmentList);
		viewpager=(ViewPager)findViewById(R.id.viewpager_view);
		viewpager.setAdapter(mAdapter);
		mSlidingMenu=(SlidingMenu) findViewById(R.id.id_menu);
		text_geren=(TextView)findViewById(R.id.textview_geren);
		text_geren.setOnClickListener(clickListener);
		
		text_guangchang=(TextView)findViewById(R.id.textview_guangchang);
		text_guangchang.setOnClickListener(clickListener);
		
		text_guanzhu=(TextView)findViewById(R.id.textview_guanzhu);
		text_guanzhu.setOnClickListener(clickListener);
		
		text_shezhi=(TextView)findViewById(R.id.textview_shezhi);
		text_shezhi.setOnClickListener(clickListener);
	}
	private void getData() {
		fragmentList=new ArrayList<Fragment>();
		GerenFragment geren=new GerenFragment();
		fragmentList.add(geren);
		GuangchangFragment guangchang=new GuangchangFragment();
		fragmentList.add(guangchang);
		GuanZhuFragment guanzhu=new GuanZhuFragment();
		fragmentList.add(guanzhu);
		ShezhiFragment shezhi=new ShezhiFragment();
		fragmentList.add(shezhi);
		
	}
	public void toggleMenu(View view){
		mSlidingMenu.toggle();
	}
	OnClickListener clickListener=new OnClickListener() {
		public void onClick(View v) {
			switch(v.getId()){
				case R.id.textview_geren:
					viewpager.setCurrentItem(0);
					mSlidingMenu.toggle();
					break;		
				case R.id.textview_guangchang:
					viewpager.setCurrentItem(1);
					mSlidingMenu.toggle();
					break;
				case R.id.textview_guanzhu:
					viewpager.setCurrentItem(2);
					mSlidingMenu.toggle();
					break;
				case R.id.textview_shezhi:
					viewpager.setCurrentItem(3);
					mSlidingMenu.toggle();
					break;
				
				default:
					break;
			}		
		}
	};
	
}
