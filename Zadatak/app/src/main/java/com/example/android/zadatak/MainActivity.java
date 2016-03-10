package com.example.android.zadatak;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.example.android.zadatak.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ZALIJEPITI OVDJE
        int radniDan = 5;
        int vikend = 9;
        int optimalniSati= 7 * 8;
        int stvarniSati = radniDan;
        stvarniSati = stvarniSati + vikend * 2;
        int rjesenje = optimalniSati - stvarniSati;
        display(rjesenje);


    }
    /**
     * Metoda za pokazivanje na ekranu.
     */

    public void display(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text);
    }

    public void display(int text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text + "");

    }

    public void display1(String text) {

        display(text);
    }

    public void display2(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        t.setText(text);
    }

    public void display3(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_3);
        t.setText(text);
    }
}