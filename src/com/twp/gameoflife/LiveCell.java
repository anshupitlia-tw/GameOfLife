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

}
