package com.example.iem.coderproprement2.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.iem.coderproprement2.BLE.BLEManager;
import com.example.iem.coderproprement2.R;

public class MainActivity extends AppCompatActivity {

    Button buttonConnect;
    Button buttonDetail;
    TextView tvDevicePaired;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonConnect = (Button) findViewById(R.id.buttonConnect);
        buttonDetail = (Button) findViewById(R.id.buttonDetail);
        tvDevicePaired = (TextView) findViewById(R.id.tvDevicePaired);

        buttonDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        buttonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvDevicePaired.setText("deviced paired");
            }
        });

    }
}
