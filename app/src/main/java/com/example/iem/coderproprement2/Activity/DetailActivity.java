package com.example.iem.coderproprement2.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.iem.coderproprement2.BLE.BLEManager;
import com.example.iem.coderproprement2.R;


public class DetailActivity extends AppCompatActivity{
    Button buttonRate;
    TextView tvRate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        buttonRate = (Button) findViewById(R.id.buttonRate);
        tvRate = (TextView) findViewById(R.id.tvRate);

        buttonRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvRate.setText(BLEManager.getInstance().getRate());

            }
        });

    }
}
