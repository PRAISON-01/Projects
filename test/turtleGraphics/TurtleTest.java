package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TurtleTest {

    private SketchPad sketchPad;
    private Turtle turtle;

    @BeforeEach
    public void setUp() {
        sketchPad = new SketchPad();
        turtle = new Turtle(sketchPad);
    }
    @Test
    public void defaultPositionForTurtle() {
//        Turtle turtle = new Turtle();
        TurtlePosition position = turtle.getPosition();
        assertEquals(0,position.getRowPosition());
        assertEquals(0,position.getColumnPosition());
    }

    @Test
    public void penIsUp_true() {
//        Turtle turtle = new Turtle();
        assertTrue(turtle.penIsUp());
    }

    @Test
    public void penIsUp_getCurrectDirection_defaultDirectionIsRight() {
//        Turtle turtle = new Turtle();
        Direction currentDirection = turtle.getCurrentDirection();
        assertEquals(Direction.EAST, currentDirection);
    }


    @Test
    public void penIsUp_currentPosition_turnRight_South() {
//        Turtle turtle = new Turtle();
        assertEquals(Direction.EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
    }


    @Test
    public void penIsUp_SOUTH_turnRight_currentPosition_WEST() {
//        Turtle turtle = new Turtle();
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());
    }

    @Test
    public void penIsUp_WEST_turnRight_currenPosition_NORTH() {
//        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());
    }
    @Test
    public void penIsUp_NORTH_turnRight_currenPosition_EAST() {
//        Turtle turtle = new Turtle();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(Direction.EAST, turtle.getCurrentDirection());
    }

    @Test
    public void penIsUp_EAST_turnLeft_currentPosition_NORTH() {
//        Turtle turtle = new Turtle();
        turtle.turnLeft();
        assertEquals(Direction.NORTH, turtle.getCurrentDirection());
    }

    @Test
    public void penIsUp_NORTH_turnLeft_currentPosition_WEST() {
//        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(Direction.WEST, turtle.getCurrentDirection());

    }

    @Test
    public void penIsUp_WEST_turnLeft_currentPosition_SOUTH() {
//        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());
    }

    @Test
    public void penIsUp_SOUTH_turnLeft_currentPosition_EAST() {
//        Turtle turtle = new Turtle();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(Direction.EAST, turtle.getCurrentDirection());
    }

    @Test
    public void penIsUp_movePenDown_penIsUpIsFalse() {
//        Turtle turtle = new Turtle();
        assertTrue(turtle.penIsUp());

        turtle.movePenDown();
        assertFalse(turtle.penIsUp());
    }

    @Test
    public void penIsUp_movePenDown_movePenUp_penIsUpIsTrue() {
//        Turtle turtle = new Turtle();
        assertTrue(turtle.penIsUp());

        turtle.movePenDown();
        assertFalse(turtle.penIsUp());

        turtle.movePenUp();
        assertTrue(turtle.penIsUp());
    }

    @Test
    public void peIsUp_Move5Steps_columnCountIs5() {
//        Turtle turtle = new Turtle();
        TurtlePosition position = turtle.getPosition();
        assertEquals(0,position.getRowPosition());
        assertEquals(0,position.getColumnPosition());

        turtle.moveForward(5);
        assertEquals(0,position.getRowPosition());
        assertEquals(5,position.getColumnPosition());
    }


    @Test
    public void penIsUp_Move5Steps_turnRight_directionIsSouth_Move5Steps_rowCountIs5() {
//        Turtle turtle = new Turtle();
        TurtlePosition position = turtle.getPosition();
        assertEquals(Direction.EAST, turtle.getCurrentDirection());
        assertEquals(0,position.getRowPosition());
        assertEquals(0,position.getColumnPosition());

        turtle.moveForward(5);
        turtle.turnRight();

        assertEquals(Direction.SOUTH, turtle.getCurrentDirection());

        turtle.moveForward(5);
        assertEquals(5,position.getRowPosition());
        assertEquals(5,position.getColumnPosition());
    }

    @Test
    public void movePenDown_moveForward3steps_movesOnSketchPad() {
        turtle.movePenDown();
        turtle.moveForward(3);
        assertEquals(1, sketchPad.getFloor()[0][0]);
        assertEquals(1, sketchPad.getFloor()[0][1]);
        assertEquals(1, sketchPad.getFloor()[0][2]);
        assertEquals(1, sketchPad.getFloor()[0][3]);
    }



}
