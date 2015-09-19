package com.twp.gameoflife;

public class LiveCell implements StateOfCell {

    @Override
    public String getDisplayableState() {
        return "X";
    }

    @Override
    public int addsNumberToCountOfLiveCell() {
        return 1;
    }

    @Override
    public boolean isAlive() {
        return true;
    }

    @Override
    public boolean isDead() {
        return false;
    }
}
