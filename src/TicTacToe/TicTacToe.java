package TicTacToe;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class TicTacToe {

    char[][] board; // доска на которой будут элементы;
    char player = 'X';
    char computer = 'O';
    // игрок, символ будет меняться в дальнейшем

    public void createNewTicTacToe(){
        board = new char[3][3];
    }
    void fillBoardCells(){
        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }
    }
    void renderBoard(){
        System.out.println("-------------");
        for (char[] chars : board) {
            System.out.print("| ");
            for (char aChar : chars) {
                System.out.print(aChar + " | ");
            }
            System.out.println();
            System.out.println("123");
            System.out.println("125");
        }
        System.out.println("-------------");
        }

     void gameProgres(){
        Scanner scanner = new Scanner(System.in);
        boolean isGameContinue = false;

        while (!isGameContinue) {
            System.out.printf("Ход %s игрока!\n", player);
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            if (i >= 0 && i < 3 && j >= 0 && j < 3) {
                if (board[i][j] == ' ') {
                    board[i][j] = player;
                    isGameContinue = winnerPlayer(board, player);
                    if (isGameContinue) {
                        System.out.println("Игрок " + player + " победил! ");
                    } else {
                        Random random = new Random();
                        i = random.nextInt(3);
                        j = random.nextInt(3);
                        if (board[i][j] == ' '){
                            board[i][j] = computer;
                        }
                        else {
                            i = random.nextInt(3);
                            j = random.nextInt(3);
                            board[i][j] = computer;
                        }
                        isGameContinue = winnerComputer(board, computer);
                    }

                } else {
                    System.out.println("Клетка уже занята!");
                }
                renderBoard();
            } else {
                System.out.println("Неверные координаты. Попробуйте снова.");
            }
        }
    }


    public static boolean winnerPlayer(char[][] board, char player) {
        // check the rows
        for (char[] chars : board) {
            if (chars[0] == player && chars[1] == player && chars[2] == player) {
                return true;
            }
        }

        // check for col
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        // diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }

        return board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }
    public static boolean winnerComputer(char[][] board, char computer) {
        // check the rows
        for (char[] chars : board) {
            if (chars[0] == computer && chars[1] == computer && chars[2] == computer) {
                return true;
            }
        }

        // check for col
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == computer && board[1][j] == computer && board[2][j] == computer) {
                return true;
            }
        }

        // diagonal
        if (board[0][0] == computer && board[1][1] == computer && board[2][2] == computer) {
            return true;
        }

        return board[0][2] == computer && board[1][1] == computer && board[2][0] == computer;
    }
}
