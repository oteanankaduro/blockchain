package com.balazsholczer.blockchain;

public class Constants {

    private Constants () {

        /*
         this private constructor exists to prevent any external agent
         from instantiating the Constants class.
        */
    }

    public static final int DIFFICULTY = 5;
    public  static final double MINER_REWARD = 10;
    public static final String GENESIS_PREV_HASH = "0000000000000000000000000000000000000000000000000000000000000000";
}
