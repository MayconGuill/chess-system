package model.chesslayer.pieces;

import model.boardlayer.entitie.Board;
import model.chesslayer.entitie.ChessPiece;
import model.chesslayer.enums.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] assistant = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return assistant;
    }
}
