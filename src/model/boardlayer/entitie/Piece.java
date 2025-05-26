package model.boardlayer.entitie;

public abstract class Piece {
    protected Position position;
    
    private Board board;
    public Piece(Board board) {
        this.board = board;
    }
    
    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] assistant = possibleMoves();
        for (int i = 0; i < assistant.length; i++) {
            for (int j = 0; j < assistant.length; j++) {
                if (assistant[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
