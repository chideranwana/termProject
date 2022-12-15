package TermProject;

public class Board {
    public static final int SIZE = 8;

    private Position[][] board;

    public Board() {
        board = new Position[SIZE][SIZE];
    }

    public Position getPos(int row, int col) {
        return (row < 0 || row >= SIZE || col < 0 || col >= SIZE) ? null : board[row][col];
    }

}
