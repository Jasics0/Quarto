/*
Código de estado: 
200 Inserción Correcta,
401 La ficha no está disponible, 
402 La casilla no está disponible,
404 La casilla no existe,
503 La operación no se hizo correctamente,
 */
package Entities;

/**
 *
 * @author Retr0
 */
public class GameBoard {

    int winner = 0;
    GamePiece[] piece = new GamePiece[16];
    GamePiece[][] board = new GamePiece[4][4];

    public GameBoard() {
        createPieces();
    }

    public void createPieces() {
        piece[0] = new GamePiece(1, 1, 1, 1);
        piece[1] = new GamePiece(1, 1, 1, 0);
        piece[2] = new GamePiece(1, 1, 0, 1);
        piece[3] = new GamePiece(1, 0, 1, 1);
        piece[4] = new GamePiece(1, 0, 1, 0);
        piece[5] = new GamePiece(1, 0, 0, 1);
        piece[6] = new GamePiece(1, 0, 0, 0);
        piece[7] = new GamePiece(1, 1, 1, 1);

        piece[8] = new GamePiece(0, 1, 1, 1);
        piece[9] = new GamePiece(0, 1, 1, 0);
        piece[10] = new GamePiece(0, 1, 0, 1);
        piece[11] = new GamePiece(0, 0, 1, 1);
        piece[12] = new GamePiece(0, 0, 1, 0);
        piece[13] = new GamePiece(0, 0, 0, 1);
        piece[14] = new GamePiece(0, 0, 0, 0);
        piece[15] = new GamePiece(0, 1, 1, 1);

    }

    public int putPiece(int numPiece, int numBox) {
        int output = 503;
        if (numBox < 0 || numBox > 15) {
            output = 404;
        } else if (piece[numPiece] == null) {
            output = 401;
        } else {
            int k = 0;
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (k == numBox) {
                        if (board[i][j] != null) {
                            output = 402;
                            i = 4;
                            break;
                        } else {
                            board[i][j] = piece[numPiece];
                            piece[numPiece] = null;
                            output = 200;
                            i = 4;
                            break;
                        }
                    }
                    k++;
                }

            }
        }

        return output;
    }//OK

    public void showBoard() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(((board[i][j] == null) ? "▨" : board[i][j].getColor()) + " ");
            }
            System.out.println("");
        }
    }

    public void showPiecesAvaliables() {
        for (int i = 0; i < piece.length; i++) {
            System.out.println((i + 1) + ". " + ((piece[i] == null) ? "x" : piece[i].getColor()) + " ");

        }
    }

    public void verifyWinner() {
        if (verifyH()) {
            winner = 1;
        }
    }

    public boolean verifyH() {
        boolean output = false;
        int control[] = {0, 0, 0, 0};
        int aux[];
        GamePiece previous = board[0][0];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (previous != null && board[i][j] != null) {
                    aux = comparePieces(previous, board[i][j]);
                    control = addControls(control, aux);
                }
                previous = board[i][j];
            }
            if (verifyControl(control)) {
                output = true;
                break;
            } else {
                for (int k = 0; k < 4; k++) {
                    control[k] = 0;
                }
            }
        }
        return output;
    }

    public int[] comparePieces(GamePiece x, GamePiece y) {
        int control[] = {0, 0, 0, 0};

        for (int i = 0; i < 4; i++) {
            if (x.getFeatures()[i] == y.getFeatures()[i]) {
                control[i] = 1;
            }
        }
        return control;
    }

    public int[] addControls(int[] c, int[] c2) {
        for (int i = 0; i < 4; i++) {
            c[i] = c[i] + c2[i];
        }
        return c;
    }

    public boolean verifyControl(int[] c) {
        boolean output = false;
        for (int i = 0; i < 4; i++) {
            if (c[i] == 4) {
                output = true;
                break;
            }
        }
        return output;
    }

    public int getWinner() {
        return winner;
    }

}
