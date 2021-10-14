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
        Game play = new Game();
        User usuario[] = new User[2];
        usuario[0] = new User("Javier", 0);
        usuario[1] = new User("Henrro", 0);
        play.play(usuario);
    }
}
