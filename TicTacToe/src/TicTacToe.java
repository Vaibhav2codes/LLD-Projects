
public class TicTacToe {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();

        System.out.println("Winner is " + game.startGame());
    }
}
