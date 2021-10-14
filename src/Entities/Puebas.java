/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Scanner;

/**
 *
 * @author Retr0
 */
public class Puebas {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        GameBoard t = new GameBoard();
        String letra = "";
        int numberPiece = 0;
        int numberBox = 0;
        while (!letra.equals("s")) {
            System.out.print("Eligiendo... ");
            letra = keyboard.nextLine();
            try {
                numberBox = Integer.parseInt(letra);
                t.showPiecesAvaliables();
                System.out.print("Elija su ficha: ");
                numberPiece = keyboard.nextInt();
                int status;
                switch (status=t.putPiece(numberPiece, numberBox)) {
                    case 200:
                        System.out.println("Melardo");
                        t.showBoard();
                        break;
                    default:
                        System.out.println("Error!"+status);
                       break;
                }
            } catch (Exception e) {
                System.out.println("Descifrando letra...");
                switch (letra) {
                    case "g":
                        t.verifyWinner();
                        System.out.println(t.getWinner());
                        break;
                    case "s":
                        System.out.println("Chao owo");
                        break;
                }
            }
            
            keyboard.nextLine();
        }
    }
}
