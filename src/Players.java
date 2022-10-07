import cs331Helper.cs331TicTacToeBoard;
import cs331Helper.cs331TicTacToeController;
import cs331Helper.cs331TicTacToePlayer;

public class Players implements cs331TicTacToePlayer{
    private cs331TicTacToeController control;
    private cs331TicTacToeBoard board;
    private String icon;

    public Players(String icon, cs331TicTacToeController control, cs331TicTacToeBoard board){
        this.control = control;
        this.board = board;
        this.icon = icon;
        control.addPlayer(this);
    }

    @Override
    public void selectSquare(int row, int col){
        (board.squareAt(row, col)).markSquare(icon);
        control.setControllerMessage("Player " + icon + " has ended their turn.");
        control.finishedTurn();

    }


}