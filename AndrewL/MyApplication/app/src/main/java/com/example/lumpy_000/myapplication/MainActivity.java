package com.example.lumpy_000.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.media.MediaPlayer;
import android.view.View.OnClickListener;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {

    int x = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(x);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int numbercoffee) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + numbercoffee);
        TextView aDerp = (TextView) findViewById(
                R.id.a_derp);
        Button botton1 = (Button) findViewById(
                R.id.botton1);
        x = x + 1;
        quantityTextView.setText("" + x);
        Button buutton1 = (Button) findViewById(
                R.id.button1);
        x = x - 1;
        quantityTextView.setText("" + x);
        }
    }