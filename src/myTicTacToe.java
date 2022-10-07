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
        
    }

    @Override
    public void noWinner(){

    }

    @Override
    public void playerWins(){
        board.highlightWinningSquares(javafx.scene.paint.Color.GOLD);

    }

    @Override
    public void restartGame(){
        this.control.setControllerMessage("Select a square to start playing!");
        board.clearHighlights();
        board.clearSymbols(); 
    }
}