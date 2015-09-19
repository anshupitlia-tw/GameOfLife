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
        count += getSelfRow(rowIndex).findNumberOfLiveCellsToTheLeftAndRight(columnIndex);
        if (rowIndex > MIN_INDEX)
            count += getBottomRow(rowIndex).findNumberOfLiveCellsToTheLeftAndRightIncludingSelf(columnIndex);
        if (rowIndex < MAX_INDEX)
            count += getTopRow(rowIndex).findNumberOfLiveCellsToTheLeftAndRightIncludingSelf(columnIndex);
        return count;
    }

    public String returnGameOfLifeUniverseInDisplayableFormat() {
        String displayable = "";
        for(int rowIndex = MIN_INDEX; rowIndex < MAX_INDEX; rowIndex++) {
            GameOfLifeGridRows rows = columns.get(rowIndex);
            displayable += rows.returnRowsInDisplayableFormat() + "\n";
        }
        return displayable;
    }

    private GameOfLifeGridRows getTopRow(int index) {
        return columns.get(index + 1);
    }

    private GameOfLifeGridRows getBottomRow(int index) {
        return columns.get(index - 1);
    }

    private GameOfLifeGridRows getSelfRow(int index) {
        return columns.get(index);
    }
}
