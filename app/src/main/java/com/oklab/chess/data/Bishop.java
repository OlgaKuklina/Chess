package com.oklab.chess.data;

import com.oklab.chess.ChessmanColor;

/**
 * Created by olgakuklina on 7/11/17.
 */

public class Bishop extends Chessman {
    private static final String TAG = Bishop.class.getSimpleName();

    public Bishop(ChessmanColor color, ChessmanPosition position) {
        super(color, position);
    }
}
