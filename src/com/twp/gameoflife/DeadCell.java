package com.twp.gameoflife;

public class DeadCell implements StateOfCell{

    DeadCell() {

    }
    @Override
    public String getDisplayableState() {
        return "-";
    }

    @Override
    public int addsNumberToCountOfLiveCell() {
        return 0;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public boolean isDead() {
        return true;
    }
}
