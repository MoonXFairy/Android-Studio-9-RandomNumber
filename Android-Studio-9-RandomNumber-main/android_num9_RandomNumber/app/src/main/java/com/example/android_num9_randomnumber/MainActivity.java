package com.example.android_num9_randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.num1);
        btn1.setOnClickListener(click_num1);
        Button btn2 = (Button)findViewById(R.id.num2);
        btn2.setOnClickListener(click_num2);
        Button btn3 = (Button)findViewById(R.id.num3);
        btn3.setOnClickListener(click_num3);
        Button btn4 = (Button)findViewById(R.id.num4);
        btn4.setOnClickListener(click_num4);
        Button btn5 = (Button)findViewById(R.id.num5);
        btn5.setOnClickListener(click_num5);
        Button btn6 = (Button)findViewById(R.id.num6);
        btn6.setOnClickListener(click_num6);
        Button btn7 = (Button)findViewById(R.id.num7);
        btn7.setOnClickListener(click_num7);
        Button btn8 = (Button)findViewById(R.id.num8);
        btn8.setOnClickListener(click_num8);
        Button btn9 = (Button)findViewById(R.id.num9);
        btn9.setOnClickListener(click_num9);
        Button btn_re = (Button)findViewById(R.id.restart);
        btn_re.setOnClickListener(click_restart);
    }
    private View.OnClickListener click_num1 = new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {
            TextView number = (TextView)findViewById(R.id.set_number);
            number.setText("1");
        }
    };
    private View.OnClickListener click_num2 = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            TextView number = (TextView)findViewById(R.id.set_number);
            number.setText("2");
        }
    };
    private View.OnClickListener click_num3 = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            TextView number = (TextView)findViewById(R.id.set_number);
            number.setText("3");
        }
    };
    private View.OnClickListener click_num4 = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            TextView number = (TextView)findViewById(R.id.set_number);
            number.setText("4");
        }
    };
    private View.OnClickListener click_num5 = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            TextView number = (TextView)findViewById(R.id.set_number);
            number.setText("5");
        }
    };
    private View.OnClickListener click_num6 = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            TextView number = (TextView)findViewById(R.id.set_number);
            number.setText("6");
        }
    };
    private View.OnClickListener click_num7 = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            TextView number = (TextView)findViewById(R.id.set_number);
            number.setText("7");
        }
    };
    private View.OnClickListener click_num8 = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            TextView number = (TextView)findViewById(R.id.set_number);
            number.setText("8");
        }
    };
    private View.OnClickListener click_num9 = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            TextView number = (TextView)findViewById(R.id.set_number);
            number.setText("9");
        }
    };
    private View.OnClickListener click_restart = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            int count = 0;
        }
    };

    public void click_out(View v)
    {
        TextView number = (TextView)findViewById(R.id.set_number);
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("NUM", number.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}