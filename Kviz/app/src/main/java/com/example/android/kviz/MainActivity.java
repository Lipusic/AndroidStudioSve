
import android.support.v7.app.AppCompatActivity;

package com.example.android.kviz;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.android.kviz.R;

public class MainActivity extends AppCompatActivity {

    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.et1);
        et1.requestFocus();
    }

    public void Rezultat(View view) {
        EditText et2 = (EditText) findViewById(R.id.et2);
        RadioButton rb1 = (RadioButton) findViewById(R.id.rb1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.rb2);
        RadioButton rb3 = (RadioButton) findViewById(R.id.rb3);
        CheckBox cb1 = (CheckBox) findViewById (R.id.cb1);
        CheckBox cb2 = (CheckBox) findViewById (R.id.cb2);
        CheckBox cb3 = (CheckBox) findViewById (R.id.cb3);

        int bodovi = 0;

        String s1 = et1.getText().toString();
        if(s1.equals("tocanodgovor")) {
            bodovi++;
        }

        if(rb2.isChecked()) {
            bodovi++;
        }

        if(cb2.isChecked()) {
            bodovi++;
        }

        String b = Integer.toString(bodovi);
        Toast.makeText(this, "Broj bodova: " +b, Toast.LENGTH_SHORT).show();
    }
}