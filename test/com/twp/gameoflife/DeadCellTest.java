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

    @Test
    public void shouldReturnFalseIfAskedItIsAlive() {
        DeadCell deadCell = new DeadCell();

        assertEquals(false, deadCell.isAlive());
    }

    @Test
    public void shouldReturnTrueIfAskedItIsDead() {
        DeadCell deadCell = new DeadCell();

        assertEquals(true, deadCell.isDead());
    }
}
