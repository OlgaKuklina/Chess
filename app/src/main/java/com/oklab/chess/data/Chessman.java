package com.oklab.chess.data;

import com.oklab.chess.ChessmanColor;

/**
 * Created by olgakuklina on 7/11/17.
 */

public abstract class Chessman {
    private final ChessmanColor color;
    private final ChessmanPosition position;

    public Chessman(ChessmanColor color, ChessmanPosition position) {
        this.position = position;
        this.color = color;
    }
}
