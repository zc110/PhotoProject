package com.example.photo;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ShezhiFragment extends Fragment {
	SlidingMenu mSlidingMenu;
	ImageView imageview,imageview1,imageview2;
	TextView text_message, text_help, text_above, text_tuichu,text_huancun,
	text_xieyi;

	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.activity_shezhi, container, false);
		View mainView = inflater.inflate(R.layout.activity_gerenzhongxin, null,
				false);
		mSlidingMenu = (SlidingMenu) mainView.findViewById(R.id.id_menu);
		imageview = (ImageView) v.findViewById(R.id.imageview_shezhi);
		imageview.setOnClickListener(clickListener);

		text_message = (TextView) v.findViewById(R.id.message);
		text_message.setOnClickListener(clickListener);

		text_help = (TextView) v.findViewById(R.id.person_help);
		text_help.setOnClickListener(clickListener);

		text_above = (TextView) v.findViewById(R.id.aboveJianXing);
		text_above.setOnClickListener(clickListener);

		text_tuichu = (TextView) v.findViewById(R.id.exit_denglu);
		text_tuichu.setOnClickListener(clickListener);
		
		text_huancun=(TextView)v.findViewById(R.id.qingchu);
		text_huancun.setOnClickListener(clickListener);
		
		text_xieyi=(TextView)v.findViewById(R.id.text_xieyi);
		text_xieyi.setOnClickListener(clickListener);
		
		imageview1 = (ImageView) v.findViewById(R.id.imageview1);
		imageview1.setOnClickListener(clickListener);
		imageview2 = (ImageView) v.findViewById(R.id.imageview2);
		imageview2.setOnClickListener(clickListener);
		return v;
	}

	public void toggleMenu(View view) {
		mSlidingMenu.toggle();
	}

	OnClickListener clickListener = new OnClickListener() {
		public void onClick(View v) {
			Intent intent;
			switch (v.getId()) {
			case R.id.imageview_shezhi:
				mSlidingMenu.toggle();
				break;
			case R.id.message:
				intent = new Intent(getActivity(), MessAge.class);
				startActivity(intent);
				break;
			case R.id.person_help:
				intent = new Intent(getActivity(), PersonHelp.class);
				startActivity(intent);
				break;
			case R.id.aboveJianXing:
				intent = new Intent(getActivity(), AboveJianXing.class);
				startActivity(intent);
				break;
			case R.id.exit_denglu:
				AlertDialog alert = new AlertDialog.Builder(getActivity()).create();

				alert.setTitle("退出？");
				alert.setMessage("真的要退出相册吗？");
				alert.setIcon(R.drawable.apptupian);
				alert.setButton(DialogInterface.BUTTON_NEGATIVE, "NO",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,int which) {
							}
						});
				alert.setButton(DialogInterface.BUTTON_POSITIVE, "YES",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,int which) {
								Intent intent=new Intent(getActivity(),Activity_jianxing_denglu.class);
								startActivity(intent);
							}
						});
				alert.show();
				break;
			case R.id.qingchu:
				intent = new Intent(getActivity(),ClearActivity.class);
				startActivity(intent);
				break;
			case R.id.text_xieyi:
				intent = new Intent(getActivity(),PersonActivity.class);
				startActivity(intent);
				break;
			case R.id.imageview1:
				imageview1.setImageResource(R.drawable.huigou);
				break;
			case R.id.imageview2:
				imageview2.setImageResource(R.drawable.huigou);
				break;
			default:
				break;
			}
		}
	};
}
