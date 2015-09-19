//a list of rows for the grid of game of life
package com.twp.gameoflife;

import java.util.ArrayList;

public class GameOfLifeUniverse {
    private ArrayList<GameOfLifeGridRows> columns;
    private static int MIN_INDEX = 0;
    private static int MAX_INDEX;

    GameOfLifeUniverse(ArrayList<GameOfLifeGridRows> columns) {
        this.columns = columns;
        this.MAX_INDEX = columns.size();
    }

    public int findNumberOfLiveCells(int rowIndex, int columnIndex) {
        int count = 0;
        count += columns.get(rowIndex).findNumberOfLiveCellsToTheLeftAndRight(columnIndex);
        if (rowIndex > MIN_INDEX)
            count += columns.get(rowIndex - 1).findNumberOfLiveCellsToTheLeftAndRightIncludingSelf(columnIndex);
        if (rowIndex < MAX_INDEX)
            count += columns.get(rowIndex + 1).findNumberOfLiveCellsToTheLeftAndRightIncludingSelf(columnIndex);
        return count;
    }
}
