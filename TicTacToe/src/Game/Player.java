package Game;

public class Player {
    PlayingPiece playingPiece;
    String playerName;

    public Player(PlayingPiece playingPiece, String playerName) {
        this.playingPiece = playingPiece;
        this.playerName = playerName;
    }

    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

    public String getPlayerName() {
        return playerName;
    }

}
