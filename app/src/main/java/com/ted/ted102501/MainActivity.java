package com.ted.ted102501;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2=(Button)findViewById(R.id.button2);
        MyListener oo=new MyListener();
        btn2.setOnClickListener(oo);
    }

    class MyListener implements View.OnClickListener  //member inner class
    {
        public void onClick(View v){

            Log.d("方式2:","button click..");
        }
    }
    public void click1(View v){

        Log.d("方式1:","button click.");
    }
}
