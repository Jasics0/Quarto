/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Data.Data;

/**
 *
 * @author Retr0
 */
public class User {

    private String name;
    private int score;
    private int wins;
    private int piecesUsed;

    public User(String nombre) { //Datos se traen de archivo de texto, si no existe en el archivo de texto crearlo
        Data connection = new Data();
        User aux = connection.foundUser(nombre);
        if (aux == null) {
            this.name = nombre;
            this.score = 0;
            this.wins = 0;
            connection.writeUser(this);
        } else {
            this.name = aux.getName();
            this.score = aux.getScore();
            this.wins = aux.getWins();
        }
    }

    public User(String nombre, int puntaje, int wins) {
        this.name = nombre;
        this.score = puntaje;
        this.wins = wins;
    }

    public User() {
        this.name = "";
        this.score = 0;
        this.wins = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) { //Datos se editan en archivo de texto
        this.name = nombre;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int puntaje) {//Datos se editan en archivo de texto
        this.score = puntaje;
        Data connection = new Data();
        connection.updateUser(this);
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int numberMatch, String time) {//Datos se editan en archivo de texto
        wins += 1;
        Data connection = new Data();
        connection.updateUser(this);
        connection.writeMatch(numberMatch, this.name, this.piecesUsed, time);
    }

    public String toString() {
        return this.name;
    }

    public void addPiece() {
        this.piecesUsed++;
    }

    public void cleanPeces() {
        this.piecesUsed = 0;
    }
}
