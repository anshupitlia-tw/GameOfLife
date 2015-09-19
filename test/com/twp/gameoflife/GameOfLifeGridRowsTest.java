package com.twp.gameoflife;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameOfLifeGridRowsTest {

    @Test
    public void shouldFindNumberOfLiveCellsToTheRightAndLeftOfACellAndReturnTheNumber() {
        ArrayList<StateOfCell> row = new ArrayList<>();
        StateOfCell cellOne = new LiveCell();
        StateOfCell cellTwo = new DeadCell();
        StateOfCell cellThree = new LiveCell();
        StateOfCell cellFour = new DeadCell();
        row.add(cellOne);
        row.add(cellTwo);
        row.add(cellThree);
        row.add(cellFour);
        GameOfLifeGridRows gameOfLifeGridRows = new GameOfLifeGridRows(row);

        assertEquals(0, gameOfLifeGridRows.findNumberOfLiveCells(0));
    }
}
