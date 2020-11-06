package com.example.android_num9_randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        num_ans();
    }
    public void click_back(View v)
    {
        finish();
    }
    private void num_ans()
    {
        int number;
        Random num = new Random();
        int answer = num.nextInt((10)+1);
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null)
        {
            number = Integer.parseInt(bundle.getString("NUM"));
            TextView TF = (TextView)findViewById(R.id.true_or_false);
            TextView big_or_small = (TextView)findViewById(R.id.big_or_small);
            if (number == answer)
            {
                big_or_small.setText("猜對了");
                TF.setText("○");
            }
            else if (number > answer)
            {
                big_or_small.setText("太大");
                TF.setText("X");
            }
            else if (number < answer)
            {
                big_or_small.setText("太小");
                TF.setText("X");
            }
        }
    }
}