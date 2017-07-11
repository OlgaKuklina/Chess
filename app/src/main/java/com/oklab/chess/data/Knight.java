package com.oklab.chess.data;

import com.oklab.chess.ChessmanColor;

/**
 * Created by olgakuklina on 7/11/17.
 */

public class Knight extends Chessman {
    public Knight(ChessmanColor color, ChessmanPosition position) {
        super(color, position);
    }

    private static final int[][] offsets = {
            {-1, 1},
            {1, -1},
            {1, 1},
            {-1, -1}
    };
}
