package TermProject;

public class Position {
    private final Board board;
    private final int row;
    private final int col;
    private boolean legal;
    private ChessPiece piece;

    public Position(Board board, int row, int col) {
        this.board = board;
        this.row = row;
        this.col = col;
    }

    public void setPiece(ChessPiece piece) {
        this.piece = piece;
    }

    public ChessPiece getPiece() {
        return piece;
    }

    public Position getAdjacentSquare(int horizontal, int vertical) {
        return board.getPos(vertical + row, horizontal + col);
    }

    public int getRow() {
        return row;
    }

    public void setLegal(boolean legal) {
        this.legal = legal;
    }

    public boolean isLegal() {
        return legal;
    }
}
