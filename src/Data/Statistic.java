/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Entities.User;
import java.util.ArrayList;

/**
 *
 * @author Retr0
 */
public class Statistic {

    Data connection = new Data();

    public String[] report1() { //3 fijos, + n cantidad de usuarios*2
        ArrayList<User> list = connection.getUsers();
        int numberMatch = connection.getNumberMatch() - 1;
        int numberMatchWin = 0;
        int n = 3;
        for (int i = 0; i < list.size(); i++) {
            numberMatchWin += list.get(i).getWins();
        }
        int numberMatchTie = numberMatch - numberMatchWin;

        String report[] = new String[3 + list.size() * 2];

        for (int i = 0; i < report.length; i++) {
            report[i] = "";
        }
        report[0] = "Participantes: ";
        for (int i = 0; i < list.size(); i++) {
            report[0] += list.get(i).getName() + " ";
        }
        report[1] = "Cantidad total de partidas: " + numberMatch;
        report[2] = "Cantidad de partidas empatadas: " + numberMatchTie;

        for (int i = 0; i < list.size(); i++) {
            report[n] = "Cantidad de partidas ganadas por " + list.get(i).getName() + ": " + list.get(i).getWins();
            n++;
        }

        for (int i = 0; i < list.size(); i++) {
            report[n] = "Cantidad de puntos obtenidos por " + list.get(i).getName() + ": " + list.get(i).getScore();
            n++;
        }
        return report;
    }

    public String[] report2() {
        ArrayList<String> list = connection.getMatchs();
        String[] report = new String[list.size()];
        String aux[];
        for (int i = 0; i < list.size(); i++) {
            aux = list.get(i).split(",");
            if (!aux[1].equals("")) {
                report[i] = "El usuario " + aux[1] + " ganó la patida #" + aux[0] + " utilizando " + aux[2] + " fichas.";
            } else {
                report[i] = "Hubo empate en la patida #" + aux[0];
            }

        }
        return report;
    }

    public String[] report3(){
        ArrayList<String> list = connection.getMatchs();
        String[] report = new String[list.size()];
        String aux[];
        for (int i = 0; i < list.size(); i++) {
            aux = list.get(i).split(",");
            report[i] = "Partida #"+aux[0]+": "+aux[3];
        }
        return report;
    }
    
    public static void main(String[] args) {
        Statistic s = new Statistic();
        String[] r = s.report3();
        for (int i = 0; i < r.length; i++) {
            System.out.println(r[i]);
        }
    }
}
