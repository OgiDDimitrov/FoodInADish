package com.company;

public class Vegetable extends Food {
    private boolean isFresh = true;

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }
}
