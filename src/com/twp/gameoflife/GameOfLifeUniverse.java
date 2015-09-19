//a list of rows for the grid of game of life
package com.twp.gameoflife;

import java.util.ArrayList;

public class GameOfLifeUniverse {
    private ArrayList<GameOfLifeGridRows> columns;

    GameOfLifeUniverse(ArrayList<GameOfLifeGridRows> columns) {
        this.columns = columns;
    }

    public int findNumberOfLiveCells(int rowIndex, int columnIndex) {
        return 5;
    }
}
