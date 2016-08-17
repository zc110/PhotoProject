package com.example.photo;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentAdapter extends FragmentPagerAdapter{
	ArrayList<Fragment> fragmentList;
	public MyFragmentAdapter(FragmentManager fm) {
		super(fm);
	}
	public MyFragmentAdapter(FragmentManager fm,ArrayList<Fragment> fragmentList) {
		super(fm);
		this.fragmentList=fragmentList;
	}
	public int getCount() {
		return fragmentList.size();
	}
	public Fragment getItem(int position) {
		return fragmentList.get(position);
	}
}
