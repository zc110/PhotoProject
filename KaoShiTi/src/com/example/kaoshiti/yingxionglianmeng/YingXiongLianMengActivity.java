package com.example.kaoshiti.yingxionglianmeng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import com.example.kaoshiti.R;

public class YingXiongLianMengActivity  extends Activity{
GridView gridView; 
SimpleAdapter adapter;
List<Map<String,Object>> list;
Button button_xin_lang;
Button button_wei_xin;
 Button  button_teng_xun;
 private String[] name={"huonan","gailun","zhaoxin","huangzi","bulong","wuqi","ruiwen","nanqing"};
 private int[] imgId={R.drawable.huonan,R.drawable.gailun,R.drawable.zhaoxin,R.drawable.huangzi,R.drawable.bulong,R.drawable.wuqi,R.drawable.ruiwen,R.drawable.nanqiang};
   @Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_ying_xiong);
	gridView =(GridView )findViewById(R.id.gridview);
	FaTu();
   
	
   }
	
   public void FaTu(){
	   list=new ArrayList<Map<String,Object>>();
	  for(int i=0;i<9;i++){
		  Map<String,Object> map=new HashMap<String,Object>();
	 map.put("name",name[i]);
	 map.put("imgId",imgId[i]);
	  list.add(map);
	  }
   SimpleAdapter adapter=new SimpleAdapter(this, list, R.layout.activity_ying_xiong, name, imgId);  
   gridView.setAdapter(adapter);
   }
	
   
   public void TiaoZhuan(){
	  
   }
   
}
