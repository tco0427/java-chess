package chess.domain.strategy;

import chess.domain.ChessBoard;
import chess.domain.position.Direction;
import chess.domain.position.Position;

public final class KnightMoveStrategy implements MoveStrategy {

    @Override
    public void isMovable(Position source, Position target, ChessBoard chessBoard) {
        if (source.isSameFile(target) && source.isSameRank(target)) {
            throw new IllegalStateException("제자리에 머무를 수 없습니다.");
        }

        checkKnightMoving(source, target);
    }

    private void checkKnightMoving(Position source, Position target) {
        Direction direction = Direction.of(source, target);

        if (!direction.isKnightDirection()) {
            throw new IllegalStateException("잘못된 방향입니다.");
        }
    }
}
