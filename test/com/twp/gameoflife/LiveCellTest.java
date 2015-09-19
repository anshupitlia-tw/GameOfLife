package com.twp.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LiveCellTest {

    @Test
    public void shouldDisplayXToDenoteLiveness() {
        LiveCell liveCell = new LiveCell();

        assertEquals("X", liveCell.getDisplayableState());
    }
}