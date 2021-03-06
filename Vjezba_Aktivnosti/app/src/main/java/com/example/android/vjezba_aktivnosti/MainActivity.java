package com.example.android.vjezba_aktivnosti;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv =(TextView) findViewById(R.id.textView);
        tv.setText("Dobrodosli u prvu aktivnost!");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.sat){
            Intent intent = new Intent(this,Main2Activity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.slika){
            Intent intent = new Intent(this,Main3Activity.class);
            startActivity(intent);
            return true;
        }

        if (id == R.id.skroz) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.skrozn) {
            Intent intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
