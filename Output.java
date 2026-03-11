public class Output {

    public static void printMainMenu() {

        System.out.print("\n         ::::::::::: :::     :::     :::     ::: "+"\n            :+:   :+: :+:   :+:     :+:   :+: :+: "+"\n           +:+  +:+   +:+  +:+     +:+  +:+   +:+ "+"\n          +#+ +#++:++#++: +#+     +:+ +#++:++#++:"+"\n         +#+ +#+     +#+  +#+   +#+  +#+     +#+ "+"\n    #+# #+# #+#     #+#   #+#+#+#   #+#     #+#"+"\n    #####  ###     ###     ###     ###     ### "+"\n\n      ::::::::  :::    ::: :::::::::: ::::::::   :::::::: "+"\n    :+:    :+: :+:    :+: :+:       :+:    :+: :+:    :+:"+"\n   +:+        +:+    +:+ +:+       +:+        +:+ "+"\n  +#+        +#++:++#++ +#++:++#  +#++:++#++ +#++:++#++ "+"\n +#+        +#+    +#+ +#+              +#+        +#+"+"\n#+#    #+# #+#    #+# #+#       #+#    #+# #+#    #+# "+"\n########  ###    ### ########## ########   ######## ");
        System.out.print("\n\n========================="+" Begin! "+"=========================");

    }

    public static String fetchPlayerInput() {
        return "";
    }

    static void printChessBoardToShell(char[][] chessboardArray, int turn) {

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

            // calculating the rank index number
            int index = 8 - rank;

            if (turn == 1) {

                index = rank + 1;

            }

            System.out.print("\n "+(index)+" |");

            for (int file = 0; file < 8; file++) {

                switch (chessboardArray[rank][file]) {

                    case 'k':
                        System.out.print(" ♚ |");
                        break;

                    case 'K':
                        System.out.print(" ♔ |");
                        break;

                    case 'q':
                        System.out.print(" ♛ |");
                        break;

                    case 'Q':
                        System.out.print(" ♕ |");
                        break;

                    case 'r':
                        System.out.print(" ♜ |");
                        break;

                    case 'R':
                        System.out.print(" ♖ |");
                        break;

                    case 'b':
                        System.out.print(" ♝ |");
                        break;

                    case 'B':
                        System.out.print(" ♗ |");
                        break;

                    case 'n':
                        System.out.print(" ♞ |");
                        break;

                    case 'N':
                        System.out.print(" ♘ |");
                        break;

                    case 'p':
                        System.out.print(" ♟ |");
                        break;

                    case 'P':
                        System.out.print(" ♙ |");
                        break;

                    default:
                        System.out.print("   |");
                        break;

                }

            }

            System.out.print("\n   +---+---+---+---+---+---+---+---+");

        }

        if (turn == 1) {

            System.out.print("\n     h   g   f   e   d   c   b   a");

        } else {

            System.out.print("\n     a   b   c   d   e   f   g   h");

        }

    }

}
