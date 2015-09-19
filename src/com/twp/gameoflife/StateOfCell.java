package com.twp.gameoflife;

public interface StateOfCell {

    String getDisplayableState();

    int addsNumberToCountOfLiveCell();

    boolean isAlive();

    boolean isDead();

}
