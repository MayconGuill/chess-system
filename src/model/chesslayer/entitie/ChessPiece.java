package model.chesslayer.entitie;

import model.boardlayer.entitie.Board;
import model.boardlayer.entitie.Piece;
import model.chesslayer.enums.Color;

public abstract class ChessPiece extends Piece{
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
