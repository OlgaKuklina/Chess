package com.oklab.chess.data;

/**
 * Created by olgakuklina on 7/11/17.
 */

public enum RowPosition {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8);

    private final int matchingRowPosition;
    RowPosition(int matchingRowPosition) {
        this.matchingRowPosition = matchingRowPosition;
    }

    public static  RowPosition getRowPosition(int row) {
        for (RowPosition position : values()) {
            if (position.matchingRowPosition == row) {
                return position;
            }
        }
            throw new IllegalArgumentException("Row is out of the board range: " + row);
        }
    }
