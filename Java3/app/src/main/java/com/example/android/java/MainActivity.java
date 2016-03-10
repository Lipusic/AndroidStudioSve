package com.example.android.java;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * Ova metoda se pokaže kad se naruči kava.
 */
public class MainActivity extends ActionBarActivity {
    int kolicina = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Ova metoda se poziva kada se pritisne dugme.
     * */

    public void submitOrder(View view) {
        int brojKava = 2;
        display(brojKava);
        displayPrice(brojKava * 7);
    }

    /**
     * Ova metoda radi za plus
     */
    public void increment(View view) {
        kolicina = kolicina+1;
        display(kolicina);
        displayPrice(kolicina*7);
    }

    /**
     * Ova metoda radi za minus
     */
    public void decrement(View view) {
        kolicina = kolicina-1;
        display(kolicina);
        displayPrice(kolicina*7);
    }
    /**
     * Ova metoda pokaže količinu na ekranu.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_price_view);
        quantityTextView.setText("" + number);
    }
    /**
     * Ova metoda prikazuje danu cijenu na ekranu.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.quantity_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
