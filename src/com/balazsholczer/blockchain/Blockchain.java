package com.balazsholczer.blockchain;

import java.util.ArrayList;
import java.util.List;

public class Blockchain {

    /*
    this is the blockchain class
     */

    private List<Block> blockChain;

    /*
    the method below did not come with a "void" in the method declaration
    it was added to fix the error that claimed the method declared was invalid
    below is how it was presented at the source

    public BlockChain() {
        this.blockChain = new ArrayList<>();
    }
     */
    public void BlockChain() {
        this.blockChain = new ArrayList<>();
    }

    public void addBlock(Block block) {
        this.blockChain.add(block);
    }

    public List<Block> getBlockChain() {
        return this.blockChain;
    }

    public int size() {
        return this.blockChain.size();
    }

    @Override
    public String toString() {

        String blockChain = "";

        for(Block block: this.blockChain)
            blockChain += block.toString() + "\n";

        return blockChain;
    }
}
