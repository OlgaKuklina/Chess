package com.oklab.chess.data;

import com.oklab.chess.ChessmanColor;

/**
 * Created by olgakuklina on 7/11/17.
 */

public class King extends Chessman {
    private static final String TAG = King.class.getSimpleName();

    public King(ChessmanColor color, ChessmanPosition position) {
        super(color, position);
    }
}
