package com.example.iem.coderproprement2;


import java.util.Random;

/**
 * Created by iem on 20/10/2017.
 */

public class Device {

    public Device(){}

    /**
     * Return a random int
     * @author Adeline Dumas
     * @return int
     */
    public int getHearthRate(){
        Random random = new Random();
        return random.nextInt(20)+50;
    }

    /**
     * Return the name of the device
     * @author : Adeline Dumas
     * @return string
     */
    public String getDeviceName(){
        return "Deviced 1";
    }
}
