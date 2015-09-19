package com.twp.gameoflife;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameOfLifeGridRowsTest {

    @Test
    public void shouldFindNumberOfLiveCellsToTheRightAndLeftOfACellAndReturnZeroIfNoLiveCellFound() {
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

        assertEquals(0, gameOfLifeGridRows.findNumberOfLiveCellsToTheLeftAndRight(0));
    }

    @Test
    public void shouldFindNumberOfLiveCellsToTheRightAndLeftOfACellAndReturnOneIfOneLiveCellFound() {
        ArrayList<StateOfCell> row = new ArrayList<>();
        StateOfCell cellOne = new LiveCell();
        StateOfCell cellTwo = new DeadCell();
        StateOfCell cellThree = new DeadCell();
        StateOfCell cellFour = new DeadCell();
        row.add(cellOne);
        row.add(cellTwo);
        row.add(cellThree);
        row.add(cellFour);
        GameOfLifeGridRows gameOfLifeGridRows = new GameOfLifeGridRows(row);

        assertEquals(1, gameOfLifeGridRows.findNumberOfLiveCellsToTheLeftAndRight(1));
    }

    @Test
    public void shouldFindNumberOfLiveCellsToTheRightAndLeftOfACellAndReturnTwoIfTwoLiveCellsFound() {
        ArrayList<StateOfCell> row = new ArrayList<>();
        StateOfCell cellOne = new LiveCell();
        StateOfCell cellTwo = new LiveCell();
        StateOfCell cellThree = new LiveCell();
        StateOfCell cellFour = new DeadCell();
        row.add(cellOne);
        row.add(cellTwo);
        row.add(cellThree);
        row.add(cellFour);
        GameOfLifeGridRows gameOfLifeGridRows = new GameOfLifeGridRows(row);

        assertEquals(2, gameOfLifeGridRows.findNumberOfLiveCellsToTheLeftAndRight(1));
    }

    @Test
    public void shouldFindNumberOfLiveCellsToTheRightAndLeftOfACellAndCountItsOwnStateToAddToLiveCellIfItIsAlive() {
        ArrayList<StateOfCell> row = new ArrayList<>();
        StateOfCell cellOne = new LiveCell();
        StateOfCell cellTwo = new LiveCell();
        StateOfCell cellThree = new LiveCell();
        StateOfCell cellFour = new DeadCell();
        row.add(cellOne);
        row.add(cellTwo);
        row.add(cellThree);
        row.add(cellFour);
        GameOfLifeGridRows gameOfLifeGridRows = new GameOfLifeGridRows(row);

        assertEquals(3, gameOfLifeGridRows.findNumberOfLiveCellsToTheLeftAndRightIncludingSelf(1));
    }

    @Test
    public void shouldFindNumberOfLiveCellsToTheRightAndLeftOfACellAndCountItsOwnStateToAddToLiveCellIfItIsAlive1() {
        ArrayList<StateOfCell> row = new ArrayList<>();
        StateOfCell cellOne = new DeadCell();
        StateOfCell cellTwo = new LiveCell();
        StateOfCell cellThree = new DeadCell();
        row.add(cellOne);
        row.add(cellTwo);
        row.add(cellThree);
        GameOfLifeGridRows gameOfLifeGridRows = new GameOfLifeGridRows(row);

        assertEquals(0, gameOfLifeGridRows.findNumberOfLiveCellsToTheLeftAndRight(1));
    }

    @Test
    public void shouldBeAbleToToggleItsStateFromLiveToDead() {
        ArrayList<StateOfCell> row = new ArrayList<>();
        StateOfCell cellOne = new DeadCell();
        StateOfCell cellTwo = new LiveCell();
        StateOfCell cellThree = new DeadCell();
        row.add(cellOne);
        row.add(cellTwo);
        row.add(cellThree);
        GameOfLifeGridRows gameOfLifeGridRows = new GameOfLifeGridRows(row);

        assertEquals(true, gameOfLifeGridRows.toggleStateOfCell(1).isDead());
    }


    @Test
    public void shouldBeAbleToToggleItsStateFromDeadToLive() {
        ArrayList<StateOfCell> row = new ArrayList<>();
        StateOfCell cellOne = new DeadCell();
        StateOfCell cellTwo = new LiveCell();
        StateOfCell cellThree = new DeadCell();
        row.add(cellOne);
        row.add(cellTwo);
        row.add(cellThree);
        GameOfLifeGridRows gameOfLifeGridRows = new GameOfLifeGridRows(row);

        assertEquals(true, gameOfLifeGridRows.toggleStateOfCell(2).isAlive());
    }

    @Test
    public void shouldMakeACellToDieIfItIsALiveAndIfNumberOfAliveNeighboursIsLessThanTwo() {
        ArrayList<StateOfCell> row = new ArrayList<>();
        StateOfCell cellOne = new LiveCell();
        row.add(cellOne);
        int numberOfAliveCellsInNeighbourHood = 1;
        GameOfLifeGridRows gameOfLifeGridRows = new GameOfLifeGridRows(row);
        gameOfLifeGridRows.determineStateOnTick(numberOfAliveCellsInNeighbourHood, 0);

        assertEquals(false, gameOfLifeGridRows.toggleStateOfCell(0).isAlive());
    }
}
