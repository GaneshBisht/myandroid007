package com.lb.newapplication;



import com.google.analytics.tracking.android.GoogleAnalytics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {
	

	
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	System.out.print("Entered Oncreate *******************");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    
 
       
        Button button1 = (Button) findViewById(R.id.button1);
       // Button Button2 =(button) findViewById(R.id.button2);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);
        Button button7 = (Button) findViewById(R.id.button7);
        Button button8 = (Button) findViewById(R.id.button8);
       // Button button9 = (Button) findViewById(R.id.button9);

        //Listening to button event
        button1.setOnClickListener(new View.OnClickListener() {
 
        	public void onClick(View arg0) {
				//Starting a new Intent
				Intent nextScreen = new Intent(getApplicationContext(), SecondActivity.class);
				// starting new activity
				startActivity(nextScreen);
 
            }
        });
        
        
        //Listening to button event
        button2.setOnClickListener(new View.OnClickListener() {
 
        	public void onClick(View arg0) {
				//Starting a new Intent
				Intent nextScreen = new Intent(getApplicationContext(), ThirdActivity.class);
				// starting new activity
				startActivity(nextScreen);
 
            }
        });
        
        
        button3.setOnClickListener(new View.OnClickListener() {
        	 
        	public void onClick(View arg0) {
				//Starting a new Intent
				Intent nextScreen = new Intent(getApplicationContext(), FourthActivity.class);
				// starting new activity
				startActivity(nextScreen);
 
            }
        });
        
        
        button4.setOnClickListener(new View.OnClickListener() {
        	 
        	public void onClick(View arg0) {
				//Starting a new Intent
				Intent nextScreen = new Intent(getApplicationContext(), FifthActivity.class);
				// starting new activity
				startActivity(nextScreen);
 
            }
        });
        
        
        button5.setOnClickListener(new View.OnClickListener() {
        	 
        	public void onClick(View arg0) {
				//Starting a new Intent
				Intent nextScreen = new Intent(getApplicationContext(), SixthActivity.class);
				// starting new activity
				startActivity(nextScreen);
 
            }
        });
        
        
        button6.setOnClickListener(new View.OnClickListener() {
        	 
        	public void onClick(View arg0) {
				//Starting a new Intent
				Intent nextScreen = new Intent(getApplicationContext(), SeventhActivity.class);
				// starting new activity
				startActivity(nextScreen);
 
            }
        });
        
        
        button7.setOnClickListener(new View.OnClickListener() {
        	 
        	public void onClick(View arg0) {
				//Starting a new Intent
				Intent nextScreen = new Intent(getApplicationContext(), EightActivity.class);
				// starting new activity
				startActivity(nextScreen);
 
            }
        });
        
        
        button8.setOnClickListener(new View.OnClickListener() {
        	 
        	public void onClick(View arg0) {
				//Starting a new Intent
				Intent nextScreen = new Intent(getApplicationContext(), NineActivity.class);
				// starting new activity
				startActivity(nextScreen);
 
            }
        });
        
        
        
   
    
    
    
    
    
    }
 // Initiating Menu XML file (menu.xml)
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.layout.menu, menu);
        return true;
    }
    
    
    public boolean onOptionsItemSelected(MenuItem item)
    {
        
        switch (item.getItemId())
        {
        case R.id.menu_bookmark:
        	
            Toast.makeText(MainActivity.this, "Bookmark is Selected", Toast.LENGTH_SHORT).show();
            return true;
        case R.id.menu_save:
        	Toast.makeText(MainActivity.this, "Save is Selected", Toast.LENGTH_SHORT).show();
            return true;
        case R.id.menu_search:
        	Toast.makeText(MainActivity.this, "Search is Selected", Toast.LENGTH_SHORT).show();
            return true;
        case R.id.menu_share:
        	Toast.makeText(MainActivity.this, "Share is Selected", Toast.LENGTH_SHORT).show();
            return true;
        case R.id.menu_delete:
        	Toast.makeText(MainActivity.this, "Delete is Selected", Toast.LENGTH_SHORT).show();
            return true;
        case R.id.menu_preferences:
        	Toast.makeText(MainActivity.this, "Preferences is Selected", Toast.LENGTH_SHORT).show();
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
    

    
}