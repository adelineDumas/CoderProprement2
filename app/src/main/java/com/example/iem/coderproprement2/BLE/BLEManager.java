package com.example.iem.coderproprement2.BLE;

import android.bluetooth.BluetoothClass;
import android.support.v7.app.AppCompatActivity;

import com.example.iem.coderproprement2.Device;

import java.util.Random;

/**
 * Created by iem on 20/10/2017.
 */

public class BLEManager {

    private BLEManager(){}

    private Device device;

    public void connect (Device device){
        this.device = device ;
    }

    private static BLEManager instance;

    public static BLEManager getInstance(){
        //ad - s'il n'y a pas déjà une instance
        if (instance ==null){
            //ad - on créée une nouvelle instance
            instance = new BLEManager();
        }
        return instance;
    }

    /**
     * Return a random int
     * @author Adeline Dumas
     * @return int
     */
    public String getHearthRate(){
        if (device == null){
            return "0";
        }
        else {
            return Integer.toString(device.getHearthRate());

        }
    }

    /**
     * Return the name of the device
     * @author : Adeline Dumas
     * @return string
     */
    public String getDeviceName() {
        if (device == null) {
            return "no device connected";
        } else {
            return device.getDeviceName();
        }
    }

}
