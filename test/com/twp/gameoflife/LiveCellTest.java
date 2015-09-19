package com.twp.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LiveCellTest {

    @Test
    public void shouldDisplayXToDenoteLiveness() {
        LiveCell liveCell = new LiveCell();

        assertEquals("X", liveCell.getDisplayableState());
    }

    @Test
    public void shouldAddOneToTheCountOfLiveCells() {
        LiveCell liveCell = new LiveCell();

        assertEquals(1, liveCell.addsNumberToCountOfLiveCell());
    }

    @Test
    public void shouldReturnTrueIfAskedItIsAlive() {
        LiveCell liveCell = new LiveCell();

        assertEquals(true, liveCell.isAlive());
    }

    @Test
    public void shouldReturnFalseIfAskedItIsDead() {
        LiveCell liveCell = new LiveCell();

        assertEquals(false, liveCell.isDead());
    }
}
