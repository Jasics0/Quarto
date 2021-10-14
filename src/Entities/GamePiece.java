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
public class GamePiece {

    private int features[] = new int[4];

    public GamePiece(int color, int size, int shape, int backfill) {
        features[0] = color;
        features[1] = size;
        features[2] = shape;
        features[3] = backfill;
    }

    public int[] getFeatures() {
        return features;
    }

    public int getColor() {
        return features[0];
    }

    public int getSize() {
        return features[1];
    }

    public int getShape() {
        return features[2];
    }

    public int getBackkfill() {
        return features[3];
    }
}
