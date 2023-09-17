package TicTacToe;

public class LaunchGame {
    public static void main(String[] args) {
        TicTacToe TicTacToe = new TicTacToe();
        TicTacToe.createNewTicTacToe();
        TicTacToe.fillBoardCells();

        TicTacToe.renderBoard();
        TicTacToe.gameProgres();
    }
}
