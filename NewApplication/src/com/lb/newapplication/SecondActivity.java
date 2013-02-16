package com.lb.newapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
 
public class SecondActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	System.out.print("Entered Oncreate *******************");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);
 
      
        Button btnClose = (Button) findViewById(R.id.btnClose);
 
        // Binding Click event to Button
    btnClose.setOnClickListener(new View.OnClickListener() {
        	
          public void onClick(View arg0) {
                //Closing SecondScreen Activity
        	  Intent nextScreen = new Intent(getApplicationContext(), MainActivity.class);
				// starting new activity
				startActivity(nextScreen);
            }
       });
 
    } 
}