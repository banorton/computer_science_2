/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

import static java.lang.Math.sqrt;

/**
 *
 * @author banor
 */
public class Point {

    int x;
    int y;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }

    public Point() {
    }

    public Point(int px, int py) {
        x = px;
        y = py;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public int getQuandrant() {
        int quad;
        if (x == 0 || y == 0) {
            quad = 0;
            return quad;
        } else if ((x > 0) && (y > 0)) {
            quad = 1;
        } else if ((x < 0) && (y > 0)) {
            quad = 2;
        } else if ((x < 0) && (y < 0)) {
            quad = 3;
        } else {
            quad = 4;
        }

        return quad;
    }

    public void flip() {
        int newY = -1 * x;
        int newX = -1 * y;
        x = newX;
        y = newY;
    }

    public double distance(Point other) {
        double dist;
        dist = sqrt(Math.pow(this.getX() - other.getX(), 2) + Math.pow(this.getY() - other.getY(), 2));
        return dist;
    }
}
