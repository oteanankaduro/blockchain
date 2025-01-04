package com.balazsholczer.blockchain;

public class Miner {

    /*
     this is the miner class
     responsible for validating transactions
    */

    private double reward;

    public void mine(Block block, Blockchain blockChain) {

        int difficulty = Constants.DIFFICULTY;

        while(notGoldenHash(block, difficulty)) {
            block.generateHash();
            block.incrementNonce();
        }

        System.out.println(block + " has just been mined...");
        System.out.println("Hash is " + block.getHash());

        blockChain.addBlock(block);
        reward += Constants.MINER_REWARD;
    }

    public boolean notGoldenHash(Block block, int difficulty) {

        String leadingZeros = new String(new char[difficulty]).replace('\0', '0');
        return !block.getHash().substring(0, difficulty).equals(leadingZeros);
    }

    public double getReward() {
        return this.reward;
    }
}
