package com.oklab.chess;

import android.graphics.Color;

/**
 * Created by olgakuklina on 7/11/17.
 */

public class ChessmanColor {
    public static final String TAG = ChessmanColor.class.getSimpleName();
    private final Color chessmanColor;

    public ChessmanColor(Color chessmanColor) {
        this.chessmanColor = chessmanColor;
    }

    public Color getChessmanColor() {
        return chessmanColor;
    }
}
