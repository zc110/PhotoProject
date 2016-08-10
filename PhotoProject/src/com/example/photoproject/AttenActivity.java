package com.example.photoproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



public class AttenActivity extends Activity{
	 private ListView lv;
	    private List<Map<String, Object>> data;
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_attention);
	        lv = (ListView)findViewById(R.id.listview_attention);
	        //获取将要绑定的数据设置到data中
	        data = getData();
	        MyAdapter adapter = new MyAdapter(this);
	        lv.setAdapter(adapter);
	    }
	    
	    private List<Map<String, Object>> getData()
	    {
	        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
	        Map<String, Object> map;
	        for(int i=0;i<10;i++)
	        {
	            map = new HashMap<String, Object>();
	            map.put("imageBackground", R.id.schoolImage);
				map.put("imageHead", R.id.head);
				map.put("name", "Leo");
				map.put("time", "2天前");
				map.put("text",  "那年夏天，我们\n最后一次走过校园的林荫大道， \n走向野心勃勃欲不可预知的未来");
				map.put("lastCard", R.drawable.lastactivity);
	            list.add(map);
	        }
	        return list;
	    }
	    
	    //ViewHolder静态类
	    static 	class ViewHodler{
			public ImageView imageBackground,imageHead,lastCard;
			public TextView name,time,text;
			
		}
	    
	    public class MyAdapter extends BaseAdapter
	    {    
	        private LayoutInflater mInflater = null;
	        private MyAdapter(Context context)
	        {
	            //根据context上下文加载布局，这里的是Demo17Activity本身，即this
	            this.mInflater = LayoutInflater.from(context);
	        }

	        @Override
	        public int getCount() {
	            //How many items are in the data set represented by this Adapter.
	            //在此适配器中所代表的数据集中的条目数
	            return data.size();
	        }

	        @Override
	        public Object getItem(int position) {
	            // Get the data item associated with the specified position in the data set.
	            //获取数据集中与指定索引对应的数据项
	            return position;
	        }

	        @Override
	        public long getItemId(int position) {
	            //Get the row id associated with the specified position in the list.
	            //获取在列表中与指定索引对应的行id
	            return position;
	        }
	        
	        //Get a View that displays the data at the specified position in the data set.
	        //获取一个在数据集中指定索引的视图来显示数据
	        @Override
	        public View getView(int position, View convertView, ViewGroup parent) {
	        	ViewHodler holder = null;
	            //如果缓存convertView为空，则需要创建View
	            if(convertView == null)
	            {
	                holder = new ViewHodler();
	                //根据自定义的Item布局加载布局
	                convertView = mInflater.inflate(R.layout.activity_attention_two, null);
	                holder.imageBackground = (ImageView)convertView.findViewById(R.id.schoolImage); 
	                holder.imageHead= (ImageView)convertView.findViewById(R.id.head); 
	                holder.name = (TextView)convertView.findViewById(R.id.name); 
	                holder.time = (TextView)convertView.findViewById(R.id.time); 
	                holder.text = (TextView)convertView.findViewById(R.id.text); 
	                holder.lastCard= (ImageView)convertView.findViewById(R.id.nextCard); 
	                
	                //将设置好的布局保存到缓存中，并将其设置在Tag里，以便后面方便取出Tag
	                convertView.setTag(holder);
	            }else
	            {
	                holder = (ViewHodler)convertView.getTag();
	            }
	            holder.imageBackground.setBackgroundResource((Integer)data.get(position).get("imageBackground")); 
	            holder.imageHead.setBackgroundResource((Integer)data.get(position).get("imageHead")); 
	            holder.name.setText((String)data.get(position).get("name")); 
	            holder.time.setText((String)data.get(position).get("time"));
	            holder.text.setText((String)data.get(position).get("text"));
	            holder.lastCard.setBackgroundResource((Integer)data.get(position).get("lastCard")); 
	            return convertView;
	        }
	        
	    }
}
