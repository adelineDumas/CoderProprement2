package com.example.iem.coderproprement2.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.iem.coderproprement2.BLE.BLEManager;
import com.example.iem.coderproprement2.R;


public class DetailActivity extends AppCompatActivity{

    private TextView textViewRate;
    private TextView textViewnameDevice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //ad - appel de la méthode qui initialise la vue
        initViews();
    }

    /**
     * Initialise la vue
     *
     * @author Adeline Dumas
     */
    private void initViews(){
        Button lButtonRate;

        lButtonRate = (Button) findViewById(R.id.buttonRate);
        textViewRate = (TextView) findViewById(R.id.tvRate);
        textViewnameDevice = (TextView) findViewById(R.id.tvNameDevice);

        textViewnameDevice.setText(BLEManager.getInstance().getDeviceName());


        //ad - si l'on clique sur le bouton Rate
        lButtonRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //ad - on modifie la valeur de la textView
                textViewRate.setText(BLEManager.getInstance().getHearthRate());
            }
        });
    }
}
