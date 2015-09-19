package com.twp.gameoflife;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameOfLifeUniverseTest {

    @Test
    public void shouldFindNumberOfLiveCellsInTheEightNeighboursOfACellAndReturnFiveIfFiveCellsAreLive() {
        ArrayList<StateOfCell> rowOne = new ArrayList<>();
        StateOfCell cellOne = new LiveCell();
        StateOfCell cellTwo = new LiveCell();
        StateOfCell cellThree = new DeadCell();
        rowOne.add(cellOne);
        rowOne.add(cellTwo);
        rowOne.add(cellThree);
        GameOfLifeGridRows gameOfLifeGridRowsOne = new GameOfLifeGridRows(rowOne);

        ArrayList<StateOfCell> rowTwo = new ArrayList<>();
        cellOne = new LiveCell();
        cellTwo = new DeadCell();
        cellThree = new LiveCell();
        rowTwo.add(cellOne);
        rowTwo.add(cellTwo);
        rowTwo.add(cellThree);
        GameOfLifeGridRows gameOfLifeGridRowsTwo = new GameOfLifeGridRows(rowTwo);

        ArrayList<StateOfCell> rowThree = new ArrayList<>();
        cellOne = new DeadCell();
        cellTwo = new LiveCell();
        cellThree = new DeadCell();
        rowThree.add(cellOne);
        rowThree.add(cellTwo);
        rowThree.add(cellThree);
        GameOfLifeGridRows gameOfLifeGridRowsThree = new GameOfLifeGridRows(rowThree);

        ArrayList<GameOfLifeGridRows> gameOfLifeGridRowses = new ArrayList<>();
        gameOfLifeGridRowses.add(gameOfLifeGridRowsOne);
        gameOfLifeGridRowses.add(gameOfLifeGridRowsTwo);
        gameOfLifeGridRowses.add(gameOfLifeGridRowsThree);

        GameOfLifeUniverse gameOfLifeUniverse = new GameOfLifeUniverse(gameOfLifeGridRowses);

        assertEquals(5, gameOfLifeUniverse.findNumberOfLiveCells(1, 1));
    }

    @Test
    public void shouldFindNumberOfLiveCellsInTheEightNeighboursOfACellAndReturnFourIfFourCellsAreLive() {
        ArrayList<StateOfCell> rowOne = new ArrayList<>();
        StateOfCell cellOne = new LiveCell();
        StateOfCell cellTwo = new LiveCell();
        StateOfCell cellThree = new DeadCell();
        rowOne.add(cellOne);
        rowOne.add(cellTwo);
        rowOne.add(cellThree);
        GameOfLifeGridRows gameOfLifeGridRowsOne = new GameOfLifeGridRows(rowOne);

        ArrayList<StateOfCell> rowTwo = new ArrayList<>();
        cellOne = new LiveCell();
        cellTwo = new DeadCell();
        cellThree = new DeadCell();
        rowTwo.add(cellOne);
        rowTwo.add(cellTwo);
        rowTwo.add(cellThree);
        GameOfLifeGridRows gameOfLifeGridRowsTwo = new GameOfLifeGridRows(rowTwo);

        ArrayList<StateOfCell> rowThree = new ArrayList<>();
        cellOne = new DeadCell();
        cellTwo = new LiveCell();
        cellThree = new DeadCell();
        rowThree.add(cellOne);
        rowThree.add(cellTwo);
        rowThree.add(cellThree);
        GameOfLifeGridRows gameOfLifeGridRowsThree = new GameOfLifeGridRows(rowTwo);

        ArrayList<GameOfLifeGridRows> gameOfLifeGridRowses = new ArrayList<>();
        gameOfLifeGridRowses.add(gameOfLifeGridRowsOne);
        gameOfLifeGridRowses.add(gameOfLifeGridRowsTwo);
        gameOfLifeGridRowses.add(gameOfLifeGridRowsThree);

        GameOfLifeUniverse gameOfLifeUniverse = new GameOfLifeUniverse(gameOfLifeGridRowses);

        assertEquals(4, gameOfLifeUniverse.findNumberOfLiveCells(1, 1));
    }
}
