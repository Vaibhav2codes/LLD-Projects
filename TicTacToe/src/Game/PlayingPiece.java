package Game;

public class PlayingPiece {
    PieceType pieceType;

    PlayingPiece(PieceType type) {
        this.pieceType = type;
    }

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }
}
