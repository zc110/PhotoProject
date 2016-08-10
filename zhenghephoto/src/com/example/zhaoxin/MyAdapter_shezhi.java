package com.example.zhaoxin;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter_shezhi extends FragmentPagerAdapter{
	ArrayList<Fragment> Fragmentlist;
	
	public MyAdapter_shezhi(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}
	public MyAdapter_shezhi(FragmentManager fm,ArrayList<Fragment> Fragmentlist){
		super(fm);
		this. Fragmentlist=Fragmentlist;
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return Fragmentlist.get(arg0);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return Fragmentlist.size();
	}
	
}
