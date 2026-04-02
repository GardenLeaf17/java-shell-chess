import java.io.IOException;
import java.util.Scanner;

public class Output {

    public static void clearConsole() {
        try {
            new ProcessBuilder("clear")
                    .inheritIO()
                    .start()
                    .waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printMainMenu() {
        clearConsole();
        System.out.print("\nWelcome to Java Chess!");
        System.out.print("\n\nGame has begun");

    }

    public static String[] fetchPlayerChoice(int turn, int move) {

        Scanner inputScanner = new Scanner(System.in);


            System.out.print("\n\n What do you want to do?");
            System.out.print("\n A) Make a move");
            System.out.print("\n B) Offer a draw");
            System.out.print("\n C) Resign");

            System.out.print("\n\nYour choice > ");

        return new String[]{"fromPos", "toPos"};
    }



    static void printChessBoardToShell(char[][] chessboardArray, Piece[] pieces, int turn, int move) {
        clearConsole();

        if (turn == 1) {

            // invert array for black's perspective
            for (int rank = 0; rank < 8; rank++) {

                for (int file = 0; file < 4; file++) {

                    char tempVal = chessboardArray[rank][file];
                    chessboardArray[rank][file] = chessboardArray[7-rank][7-file];
                    chessboardArray[7-rank][7-file] = tempVal;

                }

            }

        }

        System.out.print("\n   +---+---+---+---+---+---+---+---+");

        for (int rank = 0; rank < 8; rank++) {

            // calculating the rank index number using the current rank
            int index = 8 - rank;

            // if black player's turn then the rank index numbers are reversed
            if (turn == 1) {

                index = rank + 1;

            }

            System.out.print("\n "+(index)+" |");

            for (int file = 0; file < 8; file++) {

                System.out.print(" " + Controller.findPiece(chessboardArray[rank][file], pieces).getPieceIcon() + " |");

            }

            System.out.print("\n   +---+---+---+---+---+---+---+---+");

        }

        // if black player's turn then the file letters are reversed
        if (turn == 1) {

            System.out.print("\n     h   g   f   e   d   c   b   a");

        } else {

            System.out.print("\n     a   b   c   d   e   f   g   h");

        }

        System.out.print("\n\n ♕ ♖♖ ♗♗ ♘♘ ♙♙♙♙♙♙♙♙");
        System.out.print("\n ♛ ♜♜ ♝♝ ♞♞ ♟♟♟♟♟♟♟♟ +2");

    }

    static void printPlayerTurn(int turn, int move) {
        System.out.print("\n\n Move " + move);

        if (turn == 0) {
            System.out.print("\n White's turn");

        } else {
            System.out.print("\n Black's turn");
        }
    }

}
