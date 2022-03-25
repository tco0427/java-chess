package chess.domain.piece;

import chess.domain.strategy.PawnMoveStrategy;

public class Pawn extends Piece {
    private final String symbol;

    public Pawn(Team team, String symbol) {
        super(new PawnMoveStrategy(), team);
        this.symbol = symbol;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }
}
