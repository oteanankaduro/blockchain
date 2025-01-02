package com.balazsholczer.blockchain;

import java.util.Date;

public class Block {
    /*
    this class is the implementation of the block.
    * */

    private int id;
    private int nonce;
    private long timestamp;
    private String hash;
    private String previousHash;
    private String transaction;

    public Block(int id, String transaction, String previousHash) {

        /*
        * the contents of the block are placed here.
        * */

        this.id = id;
        this.transaction = transaction;
        this.previousHash = previousHash;
        this.timestamp = new Date().getTime();
        generateHash();
    }

    public void generateHash() {

        String dataToHash = Integer.toString(id) + previousHash + Long.toString(timestamp) + Integer.toString(nonce) + transaction.toString();
        String hashValue = SHA256Helper.generateHash(dataToHash);
        this.hash = hashValue;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash() {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return  this.previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public void incrementNonce() {
        this.nonce++;
    }

    @Override
    public String toString() {
        return this.id + "-" + this.transaction + "-" + this.hash + "-" + this.previousHash + "-";
    }
}
