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

    int a = 1;
    int x = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder1(View view) {

        display(x);
    }
    public void submitOrder(View view) {
        herp(x);
    }
    public void theNewWorldOrder(View view) {
        calculatePrice(x);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    public void display(int numbercoffee) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + numbercoffee);
        TextView aDerp = (TextView) findViewById(
                R.id.a_derp);
        Button botton1 = (Button) findViewById(
                R.id.botton1);
        {
            x++;
            quantityTextView.setText("" + x);
        }
    }
    public void herp(int numbercoffee) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + numbercoffee);
        Button buutton1 = (Button) findViewById(
                R.id.buutton1);
        {
            if (x > 0)
            x = x - 1;
            quantityTextView.setText("" + x);
    }

        }
    public void calculatePrice(int x) {
        double calculateprice = x * 2.59;
        TextView asdf = (TextView) findViewById(
                R.id.asdf);
        asdf.setText("" + calculateprice + "$");
    }
    }