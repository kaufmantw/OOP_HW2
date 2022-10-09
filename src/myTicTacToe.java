import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToeGame;
import cs331Helper.cs331TicTacToePlayer;

public class myTicTacToe implements cs331TicTacToeGame{
    private cs331TicTacToeBoard board;
    private cs331TicTacToeController control;
    private Players player1;
    private Players player2;

    public myTicTacToe(){
        this.board = new cs331TicTacToeBoard();
        this.control = new cs331TicTacToeController();
        this.player1 = new Players("X", this.control, this.board);
        this.player2 = new Players("O", this.control, this.board);           
    }

    @Override
    public void invalidSquareChosen(int row, int col){
        (board.squareAt(row, col)).flashColor(javafx.scene.paint.Color.RED);
        control.setControllerMessage("Square chosen has already been taken. Try again.");
    }

    @Override
    public void noWinner(){
        control.setControllerMessage("It's a tie");

    }

    @Override
    public void playerWins(){
        board.highlightWinningSquares(javafx.scene.paint.Color.GREEN);
        Players winner = (Players)this.control.getWinningPlayer();
        this.control.setControllerMessage("Player " + winner.getIcon() + " wins");

    }

    @Override
    public void restartGame(){
        this.control.setControllerMessage("Select a square to start playing!");
        this.board.clearHighlights();
        this.board.clearSymbols(); 
        this.control.playAgain();
    }
}