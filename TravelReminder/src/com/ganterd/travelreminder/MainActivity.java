package com.ganterd.travelreminder;

import com.ganterd.travelreminder.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RemindersHelper.init(this);
    }
    
    @Override
    protected void onResume(){
    	super.onResume();
    	Reminder[] reminders = RemindersHelper.getAllReminders();
    	Log.d("MainActivity", "Listing " + reminders.length + " reminders.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }   
    
    public void createNewTravelReminder(View view){
    	Intent intent = new Intent(this, CreateTravelReminderActivity.class);
    	startActivity(intent);
    }
}
