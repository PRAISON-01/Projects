package turtleGraphics;

public enum Direction {
    EAST("NORTH", "SOUTH"),
    SOUTH("EAST", "WEST"),
    WEST("SOUTH", "NORTH"),
    NORTH("WEST", "EAST");

    private String left;
    private String right;


    Direction (String left, String right) {
        this.left = left;
        this.right = right;
    }

    public Direction getRight() {
        return Direction.valueOf(right);
    }

    public Direction getLeft() {
        return Direction.valueOf(left);
    }

}
