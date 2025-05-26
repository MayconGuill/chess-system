package model.chesslayer.pieces;

import model.boardlayer.entitie.Board;
import model.chesslayer.entitie.ChessPiece;
import model.chesslayer.enums.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] assistant = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return assistant;
    }
}
