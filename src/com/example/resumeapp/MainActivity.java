package com.example.resumeapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button b1 = (Button)findViewById(R.id.b1);
		b1.setOnClickListener(new OnClickListener(){
		public void onClick(View v){
			Intent i = new Intent(getBaseContext(),Activity2.class);
			startActivity(i);
			
			
		 
				// TODO Auto-generated method stub
				
		 }
		});
		}
		}

	
	

