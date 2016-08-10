package com.example.photoproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class AttentionActivity extends Activity {

	ListView listView;
	//SimpleAdapter simpleAdapter;
	//BaseAdapter baseAdapter ;
	//private ArrayList<String> list = new ArrayList<String>();
	// ArrayAdapter arrayAdapter;// ����������
	List<Map<String, Object>> listData = new ArrayList<Map<String, Object>>();

	@SuppressWarnings("unused")
	private String[] keys = { "imageBackground", "imageHead", "name", "time",
			"text", "lastCard" };
	private int viewId[] = { R.id.schoolImage, R.id.head, R.id.name, R.id.time,
			R.id.text, R.id.nextCard };

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attention);
		getData();
		
		turnNextLeo();
	}

	public void getData() {
		listView = (ListView) findViewById(R.id.listview_attention);
		// arrayAdapter=new
		// ArrayAdapter(AttentionActivity.this,R.layout.activity_attention_two,keys,viewId,list);//����һ��item����
		// listView.setAdapter(arrayAdapter);
	

		for (int i = 0; i < 8; i++) {
			@SuppressWarnings("unused")
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("imageBackground", R.id.schoolImage);
			map.put("imageHead", R.id.head);
			map.put("name", "Leo");
			map.put("time", "2天前");
			map.put("text",  "那年夏天，我们\n最后一次走过校园的林荫大道， \n走向野心勃勃欲不可预知的未来");
			map.put("lastCard", R.drawable.lastactivity);
			listData.add(map);
			myAdapter adapter=new myAdapter(this);
			listView.setAdapter(adapter);
		}

	}

	public void turnNextLeo() {
		//listView = (ListView) findViewById(R.id.listview_attention);
		listView.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
				if (listView.getTag(position).equals(R.id.nextCard)) {
					Intent intent = new Intent(AttentionActivity.this,
							LeoActivity.class);	
					startActivity(intent);   
	            }   
				}
			

			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}

		});

	}
	
 static 	class ViewHodler{
		public ImageView imageBackground,imageHead,lastCard;
		public TextView name,time,text;
		
	}
	
 public class myAdapter  extends BaseAdapter{

		  private LayoutInflater mInflater = null; 
         private myAdapter(Context context) 
        { 
            this.mInflater = LayoutInflater.from(context); 
        } 
		
		
		public int getCount() {
			// TODO Auto-generated method stub
			return listData.size() ;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			 ViewHodler holder = null; 
            //�������convertViewΪ�գ�����Ҫ����View 
            if(convertView == null) 
            { 
                holder = new ViewHodler(); 
               
                convertView = mInflater.inflate(R.layout.activity_attention_two, null); 
                holder.imageBackground = (ImageView)convertView.findViewById(R.id.schoolImage); 
                holder.imageHead= (ImageView)convertView.findViewById(R.id.head); 
                holder.name = (TextView)convertView.findViewById(R.id.name); 
                holder.time = (TextView)convertView.findViewById(R.id.time); 
                holder.text = (TextView)convertView.findViewById(R.id.text); 
                holder.lastCard= (ImageView)convertView.findViewById(R.id.nextCard); 
                //�����úõĲ��ֱ��浽�����У�������������Tag��Ա���淽��ȡ��Tag 
                convertView.setTag(holder); 
            }else 
            
            { 
                holder = (ViewHodler)convertView.getTag();
            }
            holder.imageBackground.setBackgroundResource((Integer)listData.get(position).get("imageBackground")); 
            holder.imageHead.setBackgroundResource((Integer)listData.get(position).get("imageHead")); 
            holder.name.setText((String)listData.get(position).get("name")); 
            holder.time.setText((String)listData.get(position).get("time"));
            holder.text.setText((String)listData.get(position).get("text"));
            holder.lastCard.setBackgroundResource((Integer)listData.get(position).get("lastCard")); 
           
            return convertView; 
		}
		
	}
}
