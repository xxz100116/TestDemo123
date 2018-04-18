package com.example.aidlservicedemo;

import android.os.Bundle;
import android.app.Activity;


public class MainActivity extends Activity  {
private  TextView   mTextview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mTextview=new Textview(this);
		mTextview.setText("12334");
	}

	

}
