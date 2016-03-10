package com.example.android.java;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Ova metoda se pokaže kad se naruči kava.
 */
public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Ova metoda se poziva kada se pritisne dugme.

     */
    public void submitOrder(View view) {
        display(1);
    }

    /**
     * Ova metoda pokaže količinu na ekranu.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}