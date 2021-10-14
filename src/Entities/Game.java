package Entities;

import java.util.Scanner;

public class Game {

    public void play(User u[]) {
        Scanner keyboard = new Scanner(System.in);
        GameBoard t = new GameBoard();
        String game = "";
        int shift = 0;
        int numberPiece = 0;
        int numberBox = 0;
        int status = 0;
        boolean aux = false;

        System.out.println("Turno de: " + u[shift]);
        System.out.println("Fichas disponibles: ");
        t.showPiecesAvaliables();
        System.out.print("Elija ficha para su contricante: ");
        numberPiece = Integer.parseInt(keyboard.nextLine());

        while (!game.equals("s")) {
            if (shift == 0)
                shift++;
            else
                shift--;

            System.out.println("Turno de: " + u[shift] + " su ficha es la número: " + numberPiece);
            while (status != 200) {
                System.out.print("Eligiendo casilla... ");
                game = keyboard.nextLine();
                numberBox = Integer.parseInt(game);
                switch (status = t.putPiece(numberPiece, numberBox)) {
                    case 200:
                        System.out.println("Tablero: \n");
                        t.showBoard();
                        break;
                    default:
                        System.out.println("Error!" + status);
                        break;
                }
            }
            System.out.println("Fichas disponibles: ");
            t.showPiecesAvaliables();
            status = 0;
            System.out.print("¿Qué desea hacer? : ");

            game = keyboard.nextLine();

            switch (game) {
                case "j":
                    while (!aux) {
                        try {
                            System.out.print("Elija ficha para su contricante: ");
                            numberPiece = Integer.parseInt(keyboard.nextLine());
                            aux = t.verifyPiece(numberPiece);
                        } catch (Exception e) {
                            System.out.println("Hubo un error.");
                            aux = false;
                        }
                        if (!aux) {
                            System.out.println("Esa ficha no está disponible, elija otra.");
                            System.out.println("Fichas disponibles: ");
                            t.showPiecesAvaliables();
                        }
                    }
                    aux = false;
                    break;
                case "g":
                    t.verifyWinner();
                    if (t.getWinner() != 0) {
                        u[shift].setPuntaje(u[shift].getPuntaje() + 3);
                        System.out.println(
                                u[shift].getNombre() + " ha ganado la partida :D con las siguientes condiciones: "
                                        + t.getWinningConditions());
                        game = "s";
                    } else {
                        u[shift].setPuntaje(u[shift].getPuntaje() - 2);
                        System.out.println(u[shift].getNombre() + " no ha ganado la partida D: se le restan 2 puntos.");
                    }
                    break;
            }
        }

    }
}
