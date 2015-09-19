package com.twp.gameoflife;

public class DeadCell implements StateOfCell{

    @Override
    public String getDisplayableState() {
        return "-";
    }

    @Override
    public int addsNumberToCountOfLiveCell() {
        return 0;
    }
}
