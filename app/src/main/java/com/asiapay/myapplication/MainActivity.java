package com.asiapay.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.asiapay.samplesdk.SampleSDK;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    SampleSDK asd;
    Button btnDirectCall;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDirectCall = findViewById(R.id.button1);
        btnDirectCall.setOnClickListener(this);
        asd = new SampleSDK();

    }

    @Override
    public void onClick(View view) {
        asd.print();
    }
}
