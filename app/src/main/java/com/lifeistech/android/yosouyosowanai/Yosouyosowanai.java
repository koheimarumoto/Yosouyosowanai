package com.lifeistech.android.yosouyosowanai;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


public class Yosouyosowanai extends ActionBarActivity {

    String name;
    String[] people = {"一夏","十六夜","和人","当麻"};
    String[] food = {"かれー","みそしる","ちゃーはん","えびちり"};
    TextView nameTextView;
    TextView foodTextView;
    TextView verbTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yosouyosowanai);

        nameTextView=(TextView)findViewById(R.id.nameTextView);
        foodTextView=(TextView)findViewById(R.id.foodTextView);
        verbTextView=(TextView)findViewById(R.id.verbTextView);

     }
    public void serveFood(View v){

        Random randomName = new Random();
        int index = randomName.nextInt(4);
        String name = people[index];
        nameTextView.setText(name+"に");

        Random randomFood = new Random();
        foodTextView.setText(food[randomFood.nextInt(4)]+"を");

        Random random = new Random();
        if(random.nextInt(100)>50) {
            verbTextView.setText("よそえました＾＾”");
        }else{
            verbTextView.setText("よそえませんでした！");
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_yosouyosowanai, menu);
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
