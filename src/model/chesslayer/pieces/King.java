package model.chesslayer.pieces;

import model.boardlayer.entitie.Board;
import model.boardlayer.entitie.Position;
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

    private boolean canMove(Position position) {
        ChessPiece piece = (ChessPiece) getBoard().piece(position);
        return piece == null || piece.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] assistant = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position assistantPosition = new Position(0, 0);

        // Above
        assistantPosition.setValues(position.getRow() - 1, position.getColumn());
        if (getBoard().positionExists(assistantPosition) && canMove(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
        }

        // Left
        assistantPosition.setValues(position.getRow(), position.getColumn() - 1);
        if (getBoard().positionExists(assistantPosition) && canMove(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
        }

        // Right
        assistantPosition.setValues(position.getRow(), position.getColumn() + 1);
        if (getBoard().positionExists(assistantPosition) && canMove(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
        }

        // Below
        assistantPosition.setValues(position.getRow() + 1, position.getColumn());
        if (getBoard().positionExists(assistantPosition) && canMove(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
        }

        // Northwest
        assistantPosition.setValues(position.getRow() - 1, position.getColumn() - 1);
        if (getBoard().positionExists(assistantPosition) && canMove(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
        }

        // Northeast
        assistantPosition.setValues(position.getRow() - 1, position.getColumn() + 1);
        if (getBoard().positionExists(assistantPosition) && canMove(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
        }

        // Southwest
        assistantPosition.setValues(position.getRow() + 1, position.getColumn() - 1);
        if (getBoard().positionExists(assistantPosition) && canMove(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
        }

        // Southeast
        assistantPosition.setValues(position.getRow() + 1, position.getColumn() + 1);
        if (getBoard().positionExists(assistantPosition) && canMove(assistantPosition)) {
            assistant[assistantPosition.getRow()][assistantPosition.getColumn()] = true;
        }

        return assistant;
    }
}
