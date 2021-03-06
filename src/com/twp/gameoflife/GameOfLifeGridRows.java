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

    public int findNumberOfLiveCellsToTheLeftAndRight(int cellIndex) {
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

    public int findNumberOfLiveCellsToTheLeftAndRightIncludingSelf(int cellIndex) {
        return findNumberOfLiveCellsToTheLeftAndRight(cellIndex) + row.get(cellIndex).addsNumberToCountOfLiveCell();
    }

    public StateOfCell toggleStateOfCell(int columnIndex) {
        StateOfCell cell = row.get(columnIndex);
        if (cell.isAlive())
            cell = new DeadCell();
        else
            cell = new LiveCell();
        return cell;
    }

    public StateOfCell determineStateOnTick(int numberOfLiveCellsInNeighbourHood, int columnIndex) {
        StateOfCell cell = row.get(columnIndex);
        if (cell.isAlive() && numberOfLiveCellsInNeighbourHood < 2 ) {
        }
        else if (cell.isAlive() && numberOfLiveCellsInNeighbourHood > 3) {
        }
        else if (cell.isDead() && numberOfLiveCellsInNeighbourHood == 3) {
        }
        return toggleStateOfCell(columnIndex);
    }
    public int getMaximumCells() {
        return MAX_INDEX;
    }

    public int getMinimumCellIndex() {
        return MIN_INDEX;
    }

    public String returnRowsInDisplayableFormat() {
        String displayable = "";
        for (StateOfCell cell: row) {
            displayable += cell.getDisplayableState();
        }
        return displayable;
    }
}
