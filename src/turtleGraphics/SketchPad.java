package turtleGraphics;

public class SketchPad {
    private final int[][] floor = new int[20][20];

    public int[][] getFloor() {
        return floor;
    }

    public void markFloor(int row, int column) {
        floor[row][column] = 1;
    }

}
