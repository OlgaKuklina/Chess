package com.oklab.chess.data;

/**
 * Created by olgakuklina on 7/11/17.
 */

public enum ChessmanType {
    BISHOP("Bishop"),
    KING("King"),
    QUEEN("Queen"),
    KNIGHT("Knight"),
    ROOK("Rook"),
    PAWN("Pawn");

    private final String matchingChessmanType;

    ChessmanType(String matchingChessmanType) {
        this.matchingChessmanType = matchingChessmanType;
    }

    public static ChessmanType getChessmanType(String chessmanType) {
        for (ChessmanType type : values()) {
            if (type.matchingChessmanType.equals(chessmanType)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown chessman type: " + chessmanType);
    }
}
