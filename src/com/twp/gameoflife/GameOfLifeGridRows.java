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
            count += row.get(cellIndex - 1).addsNumberToCountOfLiveCell();
        if (cellIndex < MAX_INDEX)
            count += row.get(cellIndex + 1).addsNumberToCountOfLiveCell();
        return count;
    }
}
