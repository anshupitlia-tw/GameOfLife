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
        GameOfLifeGridRows gameOfLifeGridRowsThree = new GameOfLifeGridRows(rowThree);

        ArrayList<GameOfLifeGridRows> gameOfLifeGridRowses = new ArrayList<>();
        gameOfLifeGridRowses.add(gameOfLifeGridRowsOne);
        gameOfLifeGridRowses.add(gameOfLifeGridRowsTwo);
        gameOfLifeGridRowses.add(gameOfLifeGridRowsThree);

        GameOfLifeUniverse gameOfLifeUniverse = new GameOfLifeUniverse(gameOfLifeGridRowses);

        assertEquals(4, gameOfLifeUniverse.findNumberOfLiveCells(1, 1));
    }

    @Test
    public void shouldReturnItselfInDisplayableFormat() {
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
        GameOfLifeGridRows gameOfLifeGridRowsThree = new GameOfLifeGridRows(rowThree);

        ArrayList<GameOfLifeGridRows> gameOfLifeGridRowses = new ArrayList<>();
        gameOfLifeGridRowses.add(gameOfLifeGridRowsOne);
        gameOfLifeGridRowses.add(gameOfLifeGridRowsTwo);
        gameOfLifeGridRowses.add(gameOfLifeGridRowsThree);

        String displayable = "XX-\nX--\n-X-\n";
        GameOfLifeUniverse gameOfLifeUniverse = new GameOfLifeUniverse(gameOfLifeGridRowses);

        assertEquals(displayable, gameOfLifeUniverse.returnGameOfLifeUniverseInDisplayableFormat());
    }

    public void shouldProcessEachCellForATickAndProduceAnotherGeneration() {
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

        ArrayList<GameOfLifeGridRows> seed = new ArrayList<>();
        seed.add(gameOfLifeGridRowsOne);
        seed.add(gameOfLifeGridRowsTwo);
        seed.add(gameOfLifeGridRowsThree);

        GameOfLifeUniverse gameOfLifeUniverse = new GameOfLifeUniverse(seed);


        ArrayList<StateOfCell> futureRowOne = new ArrayList<>();
        cellOne = new LiveCell();
        cellTwo = new LiveCell();
        cellThree = new DeadCell();
        futureRowOne.add(cellOne);
        futureRowOne.add(cellTwo);
        futureRowOne.add(cellThree);
        GameOfLifeGridRows futureGameOfLifeGridRowsOne = new GameOfLifeGridRows(rowOne);

        ArrayList<StateOfCell> futureRowTwo = new ArrayList<>();
        cellOne = new LiveCell();
        cellTwo = new DeadCell();
        cellThree = new DeadCell();
        futureRowTwo.add(cellOne);
        futureRowTwo.add(cellTwo);
        futureRowTwo.add(cellThree);
        GameOfLifeGridRows futureGameOfLifeGridRowsTwo = new GameOfLifeGridRows(futureRowTwo);

        ArrayList<StateOfCell> futureRowThree = new ArrayList<>();
        cellOne = new DeadCell();
        cellTwo = new LiveCell();
        cellThree = new DeadCell();
        futureRowThree.add(cellOne);
        futureRowThree.add(cellTwo);
        futureRowThree.add(cellThree);
        GameOfLifeGridRows futureGameOfLifeGridRowsThree = new GameOfLifeGridRows(futureRowThree);

        ArrayList<GameOfLifeGridRows> futureGeneration = new ArrayList<>();
        seed.add(futureGameOfLifeGridRowsOne);
        seed.add(futureGameOfLifeGridRowsTwo);
        seed.add(futureGameOfLifeGridRowsThree);

        GameOfLifeUniverse futureGameOfLifeUniverse = new GameOfLifeUniverse(futureGeneration);
        gameOfLifeUniverse.tick();

        assertEquals(futureGameOfLifeUniverse.returnGameOfLifeUniverseInDisplayableFormat(), gameOfLifeUniverse.returnGameOfLifeUniverseInDisplayableFormat());
    }
}
