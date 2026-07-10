package turtleGraphics;

public class TurtlePosition {

    private int row;
    private int column;

    TurtlePosition(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRowPosition() {
        return row;
    }

    public int getColumnPosition() {
        return column;
    }


    public void increaseColumBy(int steps) {
        column = column + steps;
    }

    public void increaseRowBy(int steps) {
        row = row + steps;
    }


}
