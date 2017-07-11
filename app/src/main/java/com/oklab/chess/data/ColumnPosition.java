package com.oklab.chess.data;

/**
 * Created by olgakuklina on 7/11/17.
 */

public enum ColumnPosition {
    A('A'),
    B('B'),
    C('C'),
    D('D'),
    E('E'),
    F('F'),
    G('G'),
    H('H');
    private final char matchingColumnPosition;

    ColumnPosition(char matchingColumnPosition) {
        this.matchingColumnPosition = matchingColumnPosition;
    }
    public static ColumnPosition getColumnPosition(char column) {
        for (ColumnPosition position : values()) {
            if (position.matchingColumnPosition == column) {
                return position;
            }
        }
        throw new IllegalArgumentException("Column is out of the board range: " + column);
    }
}
