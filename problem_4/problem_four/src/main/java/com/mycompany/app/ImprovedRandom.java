package com.mycompany.app;

import java.util.Random;

class ImprovedRandom extends Random {

    /**
     *
     */
    private static final long serialVersionUID = 554888821276960165L;

    public ImprovedRandom(long seed) {
        super(seed);
    }

    public ImprovedRandom() {
        super();
    }

    public int nextIntBetween(int low, int high){
        return nextInt(high - low) + low;
    }
}