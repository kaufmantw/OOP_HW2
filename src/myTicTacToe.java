import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToeGame;

public class myTicTacToe implements cs331TicTacToeGame{
    private cs331TicTacToeBoard board;
    private cs331TicTacToeController control;

    public myTicTacToe(){
        this.board = new cs331TicTacToeBoard();
        this.control = new cs331TicTacToeController();
        restartGame();
    }

    public void invalidSquareChosen(int row, int col){

    }

    public void noWinner(){

    }

    public void playerWins(){

    }

    public void restartGame(){
        this.control.setControllerMessage("Select a square to start playing!");
    }
}