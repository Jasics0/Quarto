/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author Retr0
 */
public class User {
    private String nombre;
    private int puntaje;

    public User(String nombre, int puntaje) { //Datos se traen de archivo de texto, si no existe en el archivo de texto crearlo
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { //Datos se editan en archivo de texto
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {//Datos se editan en archivo de texto
        this.puntaje = puntaje;
    }

    public String toString(){
        return this.nombre;
    }
}
