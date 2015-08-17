package com.example.lumpy_000.timer;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer timer;
    TimerTask timerTask;
    final Handler handler = new Handler();
    int dews = 0;
    int newdews = 0;
    int clicks = 1;
    public void initializeTimerTask() {
        timerTask = new TimerTask() {
            public void run() {
                handler.post(new Runnable() {
                    public void run() {

                        display(dews);
                        dews = dews + newdews;
                        dews += 1;
                    }

                });

            }}

        ;
    }
    public void startTimer(View view){
        if (timer==null) {
            timer = new Timer();

            initializeTimerTask();
            timer.schedule(timerTask, 0, 1000);
        }
    }
    public void addbackground(View view){
        newdews++;
        display(dews);
    }
    public void addclick(View view){
        clicks++;
        display(dews);
    }
    public void clicked(View view){
        dews = dews + clicks;
        display(dews);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
