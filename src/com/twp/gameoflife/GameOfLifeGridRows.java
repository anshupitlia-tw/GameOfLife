//A row of cells with state
package com.twp.gameoflife;

import java.util.ArrayList;

public class GameOfLifeGridRows {
    private ArrayList<StateOfCell> row;
    private static int MIN_INDEX = 0;
    private static int MAX_INDEX;

    GameOfLifeGridRows(ArrayList<StateOfCell> row) {
        this.row = row;
        MAX_INDEX = row.size();
    }

    public int findNumberOfLiveCells(int cellIndex) {
        int count = 0;
        if (cellIndex > MIN_INDEX)
            count += getLeftCell(cellIndex).addsNumberToCountOfLiveCell();
        if (cellIndex < MAX_INDEX)
            count += getRightCell(cellIndex).addsNumberToCountOfLiveCell();
        return count;
    }

    private StateOfCell getRightCell(int index) {
        return row.get(index + 1);
    }

    private StateOfCell getLeftCell(int index) {
        return row.get(index - 1);
    }
}
