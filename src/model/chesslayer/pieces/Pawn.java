package model.chesslayer.pieces;

import model.boardlayer.entitie.Board;
import model.boardlayer.entitie.Position;
import model.chesslayer.entitie.ChessPiece;
import model.chesslayer.enums.Color;

public class Pawn extends ChessPiece{

    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public boolean[][] possibleMoves() {
       boolean[][] assistant = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position assistantPosition = new Position(0, 0);

        if (getColor() == Color.WHITE) {
            assistantPosition.setValues(position.getRow() - 1, position.getColumn());
            if (getBoard().positionExists(assistantPosition) && !getBoard().thereIsAPiece(assistantPosition)) {
                assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
            }

            assistantPosition.setValues(position.getRow() - 2, position.getColumn());
            Position assistantPosition2 = new Position(position.getRow() - 1, position.getColumn());
            if (getBoard().positionExists(assistantPosition) && !getBoard().thereIsAPiece(assistantPosition) && getBoard().positionExists(assistantPosition2) && !getBoard().thereIsAPiece(assistantPosition2) && getMoveCount() == 0) {
                assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
            }

            assistantPosition.setValues(position.getRow() - 1, position.getColumn() - 1);
            if (getBoard().positionExists(assistantPosition) && isThereOpponentPiece(assistantPosition)) {
                assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
            }

            assistantPosition.setValues(position.getRow() - 1, position.getColumn() + 1);
            if (getBoard().positionExists(assistantPosition) && isThereOpponentPiece(assistantPosition)) {
                assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
            }
        } else {
            assistantPosition.setValues(position.getRow() + 1, position.getColumn());
            if (getBoard().positionExists(assistantPosition) && !getBoard().thereIsAPiece(assistantPosition)) {
                assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
            }

            assistantPosition.setValues(position.getRow() + 2, position.getColumn());
            Position assistantPosition2 = new Position(position.getRow() - 1, position.getColumn());
            if (getBoard().positionExists(assistantPosition) && !getBoard().thereIsAPiece(assistantPosition) && getBoard().positionExists(assistantPosition2) && !getBoard().thereIsAPiece(assistantPosition2) && getMoveCount() == 0) {
                assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
            }

            assistantPosition.setValues(position.getRow() + 1, position.getColumn() - 1);
            if (getBoard().positionExists(assistantPosition) && isThereOpponentPiece(assistantPosition)) {
                assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
            }

            assistantPosition.setValues(position.getRow() + 1, position.getColumn() + 1);
            if (getBoard().positionExists(assistantPosition) && isThereOpponentPiece(assistantPosition)) {
                assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
            }
        }
        return assistant;
    }

    @Override
    public String toString() {
        return "P";
    }
}
