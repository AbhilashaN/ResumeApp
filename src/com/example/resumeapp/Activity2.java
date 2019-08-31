package com.example.resumeapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity2);
	

	Button b2 = (Button)findViewById(R.id.b2);
	b2.setOnClickListener(new OnClickListener() {
		
		
		public void onClick(View v) {
			finish();
			moveTaskToBack(true);}
			// TODO Auto-generated method stub
			
		});
	}
	
	}

