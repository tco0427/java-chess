package chess.domain.piece;

import chess.domain.strategy.QueenMoveStrategy;

public final class Queen extends Piece {
    private final Team team;
    private final String symbol;

    public Queen(Team team, String symbol) {
        super(new QueenMoveStrategy(), team);
        this.team = team;
        this.symbol = symbol;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    @Override
    public double getScore() {
        return 9;
    }

    @Override
    public boolean isPawn() {
        return false;
    }

    @Override
    public boolean isKing() {
        return false;
    }
}
