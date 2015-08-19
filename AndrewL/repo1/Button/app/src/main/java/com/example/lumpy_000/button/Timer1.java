package com.example.lumpy_000.button;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

import android.widget.ImageView;


public class Timer1 extends AppCompatActivity {
    SoundPool sp = null;
    private ImageView image1;
    private int[] imageArray;
    private int currentIndex;
    private int startIndex;
    private int endIndex;
    private boolean mLoaded = false;
    private int soundIds[] = new int[1];

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
                        synchronized (this) {
                            dews = dews + newdews;
                            dews += 1;
                        }
                        display(dews);

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
    public void nextImage(){
        image1.setImageResource(imageArray[currentIndex]);
        Animation rotateimage = AnimationUtils.loadAnimation(this, R.anim.custom_anim);
        image1.startAnimation(rotateimage);
        currentIndex++;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(currentIndex>endIndex){
                    currentIndex--;
                    previousImage();
                }else{
                    nextImage();
                }

            }
        },25); // here 1000(1 second) interval to change from current  to next image

    }
    public void previousImage() {
        image1.setImageResource(imageArray[currentIndex]);
        Animation rotateimage = AnimationUtils.loadAnimation(this, R.anim.custom_anim);
        image1.startAnimation(rotateimage);
        currentIndex--;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (currentIndex < startIndex) {
                    currentIndex++;
                    nextImage();
                } else {
                    previousImage(); // here 1000(1 second) interval to change from current  to previous image
                }
            }
        }, 25);
    }

    public void startTimer(){
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
    public void dewclicks(View view){
        dews++;
        display(dews);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_UP) {
            synchronized (this) {
                dews++;

            }

            if (mLoaded)
                sp.play(soundIds[0], 20.0f, 20.0f, 1, 0, 1);
            currentIndex = 0;
//            nextImage();
            display(dews);
            image1.setImageResource(imageArray[currentIndex]);
            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    currentIndex = 1;
                    image1.setImageResource(imageArray[currentIndex]);
                }
            },50);

//            for(int i = 0; i < 2000;i++){
//            }
//            nextImage();
        }

        return super.onTouchEvent(event);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startTimer();
        image1 = (ImageView)findViewById(R.id.imageView1);
        SoundPool.Builder builder = new SoundPool.Builder();
        sp = builder.build();
        sp.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener(){

            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                mLoaded = true;
            }
        });
        soundIds[0] = sp.load(this, R.raw.yee, 1);
        imageArray = new int[2];
        imageArray[0] = R.drawable.deal;
        imageArray[1] = R.drawable.dews;
        startIndex = 0;
        endIndex = 1;
        currentIndex = 1;
        image1.setImageResource(imageArray[currentIndex]);
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