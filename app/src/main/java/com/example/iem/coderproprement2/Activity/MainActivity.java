package com.example.iem.coderproprement2.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.iem.coderproprement2.BLE.BLEManager;
import com.example.iem.coderproprement2.Device;
import com.example.iem.coderproprement2.R;

public class MainActivity extends AppCompatActivity {

    private TextView textViewDevicePaired;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ad - appel de la méthode qui initialise les views
        initViews();

    }

    /**
     * Initialise la vue
     * @author Adeline Dumas
     */
    private void initViews(){

         Button lButtonConnect;
         Button lButtonDetail;

        lButtonConnect = (Button) findViewById(R.id.buttonConnect);
        lButtonDetail = (Button) findViewById(R.id.buttonDetail);
        textViewDevicePaired = (TextView) findViewById(R.id.tvDevicePaired);

        lButtonDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ad - on déclare et on lance une nouvelle activité
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        //ad - si l'on clique sur le bouton connect
        lButtonConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BLEManager manager = BLEManager.getInstance();
                manager.connect(new Device());
                //ad - on modifie la valeur de la textView
                textViewDevicePaired.setText("deviced paired");
            }
        });
    }
}
