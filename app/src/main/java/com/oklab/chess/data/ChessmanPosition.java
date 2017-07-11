package com.oklab.chess.data;

/**
 * Created by olgakuklina on 7/11/17.
 */

public class ChessmanPosition {
    public final int RowPosition;
    public final char columnPosition;

    public ChessmanPosition(int rowPosition, char columnPosition) {
        this.RowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    public int getRowPosition() {
        return RowPosition;
    }

    public char getColumnPosition() {
        return columnPosition;
    }
}
