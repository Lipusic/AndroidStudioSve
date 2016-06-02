package com.example.android.kviz2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;

    @Override
    protected Dialog onCreateDialog(int id){
        switch(id){
            case 1:
                AlertDialog.Builder rezultat = new AlertDialog.Builder((this));
                rezultat.setMessage("Broj bodova -->>" + Integer.toString(Rezultat()));
                rezultat.setTitle("Rezultat");
                rezultat.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which){
                        dialog.dismiss();
                    }
                });

                AlertDialog dijalog1 = rezultat.create();
                dijalog1.show();
                break;

            case 2:
                AlertDialog.Builder izlaz = new AlertDialog.Builder((this));
                izlaz.setMessage("Želite li zatvoriti aplikaciju?");
                izlaz.setTitle("Pitanje:");
                izlaz.setPositiveButton("DA", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                izlaz.setNegativeButton("NE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                AlertDialog dijalog2 = izlaz.create();
                dijalog2.show();
                break;

            case 3:
                String[] listabodova = getResources().getStringArray(R.array.interval_bodova);
                int ocjena = Rezultat()/10;
                AlertDialog.Builder bodovi = new AlertDialog.Builder((this));
                bodovi.setTitle("Kviz");
                bodovi.setSingleChoiceItems(listabodova, ocjena, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int item) {

                    }
                });
                bodovi.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                AlertDialog dijalog3 = bodovi.create();
                dijalog3.show();
                break;
            }
            return super.onCreateDialog(id);
        }



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.et1);
        et1.requestFocus();
    }

    public int Rezultat() {
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
        Toast.makeText(this, "Broj bodova: " + b, Toast.LENGTH_SHORT).show();
        return bodovi;
    }

    public void dijalogRezultat(View view){
        showDialog(1);
    }

    public void dijalogIzlaz(View view){
        showDialog(2);
    }

    public void dijalogBodovi(View view){
        showDialog(3);
    }
}