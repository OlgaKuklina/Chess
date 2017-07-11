package com.oklab.chess.data;

import com.oklab.chess.ChessmanColor;

/**
 * Created by olgakuklina on 7/11/17.
 */

public class Queen extends Chessman {
    private static final String TAG = Queen.class.getSimpleName();

    public Queen(ChessmanColor color, ChessmanPosition position) {
        super(color, position);
    }
}
