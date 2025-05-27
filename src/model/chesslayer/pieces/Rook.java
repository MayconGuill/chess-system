package model.chesslayer.pieces;

import model.boardlayer.entitie.Board;
import model.boardlayer.entitie.Position;
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

        Position assistantPosition = new Position(0, 0);

        // Above
        assistantPosition.setValues(position.getRow() - 1, position.getColumn());
        while (getBoard().positionExists(assistantPosition) && !getBoard().thereIsAPiece(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
            assistantPosition.setRow(assistantPosition.getRow() - 1);
        }
        if (getBoard().positionExists(assistantPosition) && isThereOpponentPiece(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
        }

        // Left
        assistantPosition.setValues(position.getRow(), position.getColumn() - 1);
        while (getBoard().positionExists(assistantPosition) && !getBoard().thereIsAPiece(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
            assistantPosition.setColumn(assistantPosition.getColumn() - 1);
        }
        if (getBoard().positionExists(assistantPosition) && isThereOpponentPiece(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
        } 

        // Right
        assistantPosition.setValues(position.getRow(), position.getColumn() + 1);
        while (getBoard().positionExists(assistantPosition) && !getBoard().thereIsAPiece(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
            assistantPosition.setColumn(assistantPosition.getColumn() + 1);
        }
        if (getBoard().positionExists(assistantPosition) && isThereOpponentPiece(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
        }

        // Below
        assistantPosition.setValues(position.getRow() + 1, position.getColumn());
        while (getBoard().positionExists(assistantPosition) && !getBoard().thereIsAPiece(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
            assistantPosition.setRow(assistantPosition.getRow() + 1);
        }
        if (getBoard().positionExists(assistantPosition) && isThereOpponentPiece(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
        }

        return assistant;
    }
}
