package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs

        // Find second menu item TextView and print the text to the logs

        // Find third menu item TextView and print the text to the logs

        mangoSorbet();
        blueberryPie();
        chocolateLavaCake();
    }

    public void mangoSorbet() {
        TextView textView = (TextView) findViewById(R.id.menu_item_1);
        String menuItem1 = textView.getText().toString();

        Log.e("MainActivity.java", menuItem1);
    }

    public void blueberryPie() {
        TextView textView1 = (TextView) findViewById(R.id.menu_item_2);
        String menuItem2 = textView1.getText().toString();

        Log.w("MainActivity.java", menuItem2);
    }

    public void chocolateLavaCake() {
        TextView textView2 = (TextView) findViewById(R.id.menu_item_3);
        String menuItem3 = textView2.getText().toString();

        Log.i("MainActivity.java", menuItem3);
    }
}