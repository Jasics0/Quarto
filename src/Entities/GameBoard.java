/*
Código de estado: 
200 Inserción Correcta,
401 La ficha no está disponible, 
402 La casilla no está disponible,
404 La casilla no existe,
503 La operación no se hizo correctamente,
 */
package Entities;

public class GameBoard {

    private int winner = 0;
    private int winningAttribute = 0;
    private String winningConditions = "";
    private GamePiece[] piece = new GamePiece[16];
    private GamePiece[][] board = new GamePiece[4][4];

    public GameBoard() {
        createPieces();
    }

    public boolean verifyPiece(int p) {
        return (piece[p] != null);
    }

    public void createPieces() {
        piece[0] = new GamePiece(0, 1, 1, 1, 1);//ok
        piece[1] = new GamePiece(1, 1, 1, 1, 0);//ok
        piece[2] = new GamePiece(2, 1, 1, 0, 1);//ok
        piece[3] = new GamePiece(3, 1, 0, 1, 1);//ok
        piece[4] = new GamePiece(4, 1, 0, 1, 0);//ok
        piece[5] = new GamePiece(5, 1, 0, 0, 1);//ok
        piece[6] = new GamePiece(6, 1, 0, 0, 0);//ok
        piece[7] = new GamePiece(7, 1, 1, 0, 0);

        piece[8] = new GamePiece(8, 0, 1, 1, 1);//ok
        piece[9] = new GamePiece(9, 0, 1, 1, 0);//ok
        piece[10] = new GamePiece(10, 0, 1, 0, 1);//ok
        piece[11] = new GamePiece(11, 0, 0, 1, 1);//ok
        piece[12] = new GamePiece(12, 0, 0, 1, 0);//ok
        piece[13] = new GamePiece(13, 0, 0, 0, 1);//ok
        piece[14] = new GamePiece(14, 0, 0, 0, 0);//ok
        piece[15] = new GamePiece(15, 0, 1, 0, 0);//ok

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
    }// OK

    public void cleanBoard() {
        board = new GamePiece[4][4];
    }

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
            System.out.println(i + ". " + ((piece[i] == null) ? "x" : piece[i].getColor()) + " ");

        }
    }

    public GamePiece[][] getBoardArr() {
        return board;
    }

    public void verifyWinner() {
        if (verifyH()) {
            winner = 1;
        } else if (verifyV()) {
            winner = 2;
        } else if (verifyD()) {
            winner = 3;
        }
    }

    public boolean verifyD() {
        boolean output = false;
        int control[] = {0, 0, 0, 0};
        int aux[];
        GamePiece previous = board[0][0];

        for (int i = 0; i < 4; i++) {
            if (previous != null && board[i][i] != null) {
                aux = comparePieces(previous, board[i][i]);
                control = addControls(control, aux);
            }
            previous = board[i][i];
        }
        if (verifyControl(control)) {
            output = true;
            winningConditions = "Diagonal a con las fichas ";
            winningConditions(previous.getFeatures()[winningAttribute]);
        } else {
            for (int k = 0; k < 4; k++) {
                control[k] = 0;
            }
        }
        if (!output) {
            previous = board[0][3];
            for (int i = 3; i >= 0; i--) {
                if (previous != null && board[3 - i][i] != null) {
                    aux = comparePieces(previous, board[3 - i][i]);
                    control = addControls(control, aux);
                }
                previous = board[3 - i][i];
            }
            if (verifyControl(control)) {
                output = true;
                winningConditions = "Diagonal b con las fichas ";
                winningConditions(previous.getFeatures()[winningAttribute]);
            } else {
                for (int k = 0; k < 4; k++) {
                    control[k] = 0;
                }
            }
        }

        return output;
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
                winningConditions = "Linea " + (i + 1) + " con las fichas ";
                winningConditions(previous.getFeatures()[winningAttribute]);
                break;
            } else {
                for (int k = 0; k < 4; k++) {
                    control[k] = 0;
                }
            }
        }
        return output;
    }

    private void winningConditions(int value) {
        switch (winningAttribute) {
            case 0:
                winningConditions += (value == 1) ? "Azules" : "Rosas";
                break;
            case 1:
                winningConditions += (value == 1) ? "Grandes" : "Pequeñas";
                break;
            case 2:
                winningConditions += (value == 1) ? "Cuadradas" : "Circulares";
                break;
            case 3:
                winningConditions += (value == 1) ? "Con relleno" : "Sin relleno";
                break;

        }

    }

    public boolean verifyV() {
        boolean output = false;
        int control[] = {0, 0, 0, 0};
        int aux[];
        GamePiece previous = board[0][0];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (previous != null && board[j][i] != null) {
                    aux = comparePieces(previous, board[j][i]);
                    control = addControls(control, aux);
                }
                previous = board[j][i];
            }
            if (verifyControl(control)) {
                output = true;
                winningConditions = "Columna " + (i + 1) + " con las fichas ";
                winningConditions(previous.getFeatures()[winningAttribute]);
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
            if (c[i] >= 3) {
                output = true;
                winningAttribute = i;
                break;
            }
        }
        return output;
    }

    public int getWinner() {
        return winner;
    }

    public String getWinningConditions() {
        return winningConditions;
    }

}
