package com.twp.gameoflife;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeadCellTest {

    @Test
    public void shouldDisplayHyphenToDenoteDeadCell() {
        DeadCell deadCell = new DeadCell();

        assertEquals("-", deadCell.getDisplayableState());
    }

    @Test
    public void shouldNotAddAnythingToTheCountOfLiveCells() {
        DeadCell deadCell = new DeadCell();

        assertEquals(0, deadCell.addsNumberToCountOfLiveCell());
    }
}
