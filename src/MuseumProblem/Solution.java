package MuseumProblem;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Eric on 11/5/2015.
 */
public class Solution {

    public static Integer[][] museum(int n, ArrayList<Point> guards, ArrayList<Point> closed){
        Integer[][] museum = new Integer[n][n];
        int counter = 0;
        setClosed(museum, closed);

        while(!guards.isEmpty()) {
            System.out.println(guards.toString());
            int blockIndex = guards.size() - 1;
            for (int i = blockIndex; i > -1; i--) {
                Point current = guards.get(i);
                int x = (int) current.getX();
                int y = (int) current.getY();
                if (museum[x][y] == null || museum[x][y] != -1 || museum[x][y] > counter) {
                    museum[x][y] = counter;
                }
                guards.remove(i);

                ArrayList<Point> neighbors = getNeighbors(current, n, museum);
                guards.addAll(neighbors);
            }
            counter++;
        }
        return museum;
    }

    public static void setClosed(Integer[][] museum, ArrayList<Point> closed) {
        for (int i = 0; i < closed.size(); i++) {
            Point current = closed.get(i);
            int x = (int) current.getX();
            int y = (int) current.getY();
            museum[x][y] = -1;
        }
    }

    public static ArrayList<Point> getNeighbors(Point current, int n, Integer[][] museum) {
        ArrayList<Point> neighbors = new ArrayList<>();
        int x = (int) current.getX();
        int y = (int) current.getY();

        if (x-1 >= 0 && museum[x-1][y] == null) {
            Point p = new Point(x-1, y);
            neighbors.add(p);
        }
        if (y-1 >= 0 && museum[x][y-1] == null) {
            Point p = new Point(x, y-1);
            neighbors.add(p);
        }
        if (x+1 < n && museum[x+1][y] == null) {
            Point p = new Point(x+1, y);
            neighbors.add(p);
        }
        if (y+1 < n && museum[x][y+1] == null) {
            Point p = new Point(x, y+1);
            neighbors.add(p);
        }

        return neighbors;
    }

    public static void main(String[] args) {
        int n = 4;

        ArrayList<Point> guards = new ArrayList<>();
        ArrayList<Point> closed = new ArrayList<>();

        guards.add(new Point(0,0));
        guards.add(new Point(0,2));
        guards.add(new Point(n-1,n-1));

        closed.add(new Point(0,1));
        closed.add(new Point(2,2));
        Integer[][] museum = museum(n, guards, closed);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(museum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
