package com.example.iem.coderproprement2.BLE;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by iem on 20/10/2017.
 */

public class BLEManager {

    private BLEManager(){}

    private static BLEManager INSTANCE = new BLEManager();

    public static BLEManager getInstance(){
        if (INSTANCE ==null){
            INSTANCE = new BLEManager();
        }
        return INSTANCE;
    }


    public static String getRate(){
        return "117";
    }

}
