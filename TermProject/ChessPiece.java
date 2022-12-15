package TermProject;

import java.util.*;

public abstract class ChessPiece {

    private final int value;
    protected Position pos;

    public abstract List<Position> computeLegalMoves();

    public ChessPiece(Position pos, int value) {
        this.pos = pos;
        this.pos.setPiece(this);
        this.value = value;
    }

    public void setPosition(Position pos) {
        this.pos = pos;
    }

    public Position getPosition() {
        return pos;
    }

    public int getValue() {
        return value;
    }
}
