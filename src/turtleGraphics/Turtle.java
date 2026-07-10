package turtleGraphics;

import static turtleGraphics.Direction.*;



public class Turtle {
    private TurtlePosition position;
    private boolean penIsUp;
    private Direction currentDirection;
    private SketchPad sketchPad;

    public Turtle(SketchPad sketchPad) {
        this.position = new TurtlePosition(0, 0);
        this.penIsUp =  true;
        this.currentDirection = Direction.EAST;
        this.sketchPad = sketchPad;
    }

    public TurtlePosition getPosition() {
        return position;
    }

    public boolean penIsUp() {
        return penIsUp;
    }


    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
//        switch(currentDirection) {
//            case EAST -> currentDirection = SOUTH;
//            case SOUTH -> currentDirection = WEST;
//            case WEST -> currentDirection = NORTH;
//            case NORTH -> currentDirection = EAST;
//        }

        currentDirection = currentDirection.getRight();
    }

    public void turnLeft() {
//        switch(currentDirection) {
//            case EAST -> currentDirection = NORTH;
//            case NORTH -> currentDirection = WEST;
//            case WEST -> currentDirection = SOUTH;
//            case SOUTH -> currentDirection = EAST;
//        }
        currentDirection = currentDirection.getLeft();
    }


    public void movePenDown() {
        penIsUp = false;
    }

    public void movePenUp() {
        penIsUp = true;
    }

    public void moveForward(int steps) {
        for(int count = 0; count < steps; count++){
            switch (currentDirection) {
                case EAST->  position.increaseColumBy(1);
                case WEST->  position.increaseColumBy(1);
                case NORTH -> position.increaseRowBy(1);
                case SOUTH -> position.increaseRowBy(1);
            }
            if(penIsUp == false) {
                sketchPad.markFloor( position.getRowPosition(), position.getColumnPosition());
            }
        }



    }



//    @Override
//    public String toString() {
//        return "Turtle{" +
//                "position=" + position +
//                ", penIsUp=" + penIsUp +
//                ", currentDirection=" + currentDirection +
//                '}';
//    }
}
