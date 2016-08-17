package com.example.photo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;



import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;
import cn.smssdk.utils.SMSLog;


public class Activity_shoujidenglu extends Activity{
	ImageView imageview_fanhui_shouyedenglu;
	EditText edit_shoujihao;
	EditText edit_yanzhengma;
	ImageView imageview_huoquyanzhengma;
	TextView text_jinrumimadenglu;
	ImageView imageView_denglu;
	
	
	//获取国家

	private HashMap<Character, ArrayList<String[]>> first;    //第一层数组
	ArrayList<String[]> second;   //第二层数组
	String countyList="国家列表：\n";
	
	// 填写从短信SDK应用后台注册得到的APPKEY 

	private static String APPKEY ="1623846047e00";//"69d6705af33d";0d786a4efe92bfab3d5717b9bc30a10d
	// 填写从短信SDK应用后台注册得到的APPSECRET
	
	private static String APPSECRET ="358d9c4c209c0a7dec3a70adaeb64c05";
	public String phString;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shoujidenglu_layout);
		getData();
		SMSSDK.initSDK(this,APPKEY,APPSECRET,false);
	EventHandler eh=new EventHandler(){
			
			@Override
			public void afterEvent(int event, int result, Object data) {
				Message msg = new Message();
				msg.arg1 = event;
				msg.arg2 = result;
				msg.obj = data;
				mHandler.sendMessage(msg);
			}
			
		};
		SMSSDK.registerEventHandler(eh);
		
	}

	
	public void getData(){
		text_jinrumimadenglu=(TextView) findViewById(R.id.text_jinruyouxiangdenglu);
		text_jinrumimadenglu.setOnClickListener(clickListener);
		imageview_fanhui_shouyedenglu=(ImageView) findViewById(R.id.image_shoujidenglu_fanhui);
		imageview_fanhui_shouyedenglu.setOnClickListener(clickListener);
		edit_yanzhengma=(EditText) findViewById(R.id.edit_yanzhengma);
		edit_shoujihao=(EditText) findViewById(R.id.edit_shoujihaoma);
		imageview_huoquyanzhengma=(ImageView) findViewById(R.id.image_huoqyyanzhengma);
		imageview_huoquyanzhengma.setOnClickListener(clickListener);
		imageView_denglu=(ImageView) findViewById(R.id.shoujidenglu_denglu);
		imageView_denglu.setOnClickListener(clickListener);
	}
	
	OnClickListener clickListener=new OnClickListener() {
		
		@SuppressWarnings("unused")
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.image_shoujidenglu_fanhui:
				fanhui_shouye_denglu();
				break;
			case R.id.text_jinruyouxiangdenglu:
				jinrumimadenglu();
				break;
			case R.id.shoujidenglu_denglu:
				SMSSDK.submitVerificationCode("86", phString, edit_yanzhengma.getText().toString());
				
				
				break;
			case R.id.image_huoqyyanzhengma:
				if(!TextUtils.isEmpty(edit_shoujihao.getText().toString())){
					SMSSDK.getVerificationCode("86",edit_shoujihao.getText().toString());   
					//SMSSDK.getVoiceVerifyCode("86",phonEditText.getText().toString());
					
					phString=edit_shoujihao.getText().toString();
				}else {
					Toast.makeText(Activity_shoujidenglu.this, "电话不能为空", 1).show();
				}
					
				
				
				break;
			
			default:
				break;
			}
		}
		};
		public void denglu(){
			Intent intent=new Intent(this,MainActivity.class);
			startActivity(intent);
		}
		public void fanhui_shouye_denglu(){//跳转到首页登录
			Intent intent=new Intent(this,Activity_jianxing_denglu.class);
			startActivity(intent);
		}
		public void jinrumimadenglu(){//跳转到密码登录
			Intent intent=new Intent(this,Activity_mimadenglu.class);
			startActivity(intent);
		}
		@SuppressLint("HandlerLeak")
		Handler mHandler = new Handler(){
			public void handleMessage(Message msg) {

				// TODO Auto-generated method stub
				super.handleMessage(msg);
				int event = msg.arg1;
				int result = msg.arg2;
				Object data = msg.obj;
				Log.e("event", "event="+event);
//				System.out.println("--------result---0"+event+"--------*"+result+"--------"+data);
				
				if (result == SMSSDK.RESULT_COMPLETE) {
					if (event == SMSSDK.EVENT_GET_VERIFICATION_CODE) {
					        	Toast.makeText(getApplicationContext(), "发送验证码成功", Toast.LENGTH_SHORT).show();
					}else if (event == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) {//提交验证码成功
								denglu();
								Toast.makeText(getApplicationContext(), "验证成功", Toast.LENGTH_SHORT).show();
					} else if (event ==SMSSDK.EVENT_GET_SUPPORTED_COUNTRIES){
								System.out.println("国家数据：");
								System.out.println("国家数据："+SMSSDK.getGroupedCountryList());
								String ct = data.toString();
					//			tv.setText(ct);
								first = SMSSDK.getGroupedCountryList();
								System.out.println("第一层数组："+first);
								Set set=first.keySet();
								for(Object obj : set){
					//				System.out.println("键:"+obj+"  值:"+first.get(obj));  
									second=first.get(obj);
									System.out.println("第二层数组："+second);
									for(int i = 0;i<second.toArray().length;i++){
										String[] thirst =second.get(i);
										System.out.println("第三层数组："+thirst);
										System.out.println("单个国家字符："+thirst[0]+"和"+thirst[1]);
										String str=thirst[0]+"----------"+thirst[1]+"；\n";
										countyList = countyList+str;
										System.out.println("----"+countyList);
									}
							
						}
						//tv.setText(countyList);
					}
			} else {
				int status = 0;	
				try {
					((Throwable) data).printStackTrace();
					Throwable throwable = (Throwable) data;

					JSONObject object = new JSONObject(throwable.getMessage());
					String des = object.optString("detail");
					status = object.optInt("status");
					if (!TextUtils.isEmpty(des)) {
						Toast.makeText(Activity_shoujidenglu.this, des, Toast.LENGTH_SHORT).show();
						return;
					}
				} catch (Exception e) {
					SMSLog.getInstance().w(e);
				}
		}
			
			};
		};
		
		protected void onDestroy() {
			super.onDestroy();
			SMSSDK.unregisterAllEventHandler();
		};
		
	}