package creatures;

import huglife.*;
import org.junit.Test;

import java.awt.*;
import java.util.HashMap;

import static org.junit.Assert.*;

public class TestClorus {

    @Test
    public void testBasics() {
        Clorus p = new Clorus(2.0);
        assertEquals(2, p.energy(), 0.01);
        assertEquals(new Color(34, 0, 231), p.color());
        p.move();
        assertEquals(1.97, p.energy(), 0.01);
        p.move();
        assertEquals(1.94, p.energy(), 0.01);
        p.stay();
        assertEquals(1.93, p.energy(), 0.01);
        p.stay();
        assertEquals(1.92, p.energy(), 0.01);
    }
    @Test
    public void testReplicate() {

        Clorus p = new Clorus(2.0);
        Clorus x=p.replicate();
        assertNotEquals(x,p);
        assertEquals(x.energy(), p.energy(),0.01);
    }

    @Test
    public void testChooseStay() {

        // No empty adjacent spaces; stay.
        Clorus p = new  Clorus(1.2);
        HashMap<Direction, Occupant> surrounded = new HashMap<Direction, Occupant>();
        surrounded.put(Direction.TOP, new Impassible());
        surrounded.put(Direction.BOTTOM, new Impassible());
        surrounded.put(Direction.LEFT, new Impassible());
        surrounded.put(Direction.RIGHT, new Impassible());

        Action actual = p.chooseAction(surrounded);
        Action expected = new Action(Action.ActionType.STAY);

        assertEquals(expected, actual);



    }
    @Test
    public void testChooseAttack() {

        // No empty adjacent spaces; stay.
        Clorus p = new  Clorus(1.2);
        HashMap<Direction, Occupant> surrounded = new HashMap<Direction, Occupant>();
        surrounded.put(Direction.TOP, new Plip());
        surrounded.put(Direction.BOTTOM,new Empty());
        surrounded.put(Direction.LEFT, new Impassible());
        surrounded.put(Direction.RIGHT, new Impassible());

        Action actual = p.chooseAction(surrounded);
        Action expected = new Action(Action.ActionType.ATTACK,Direction.TOP);

        assertEquals(expected, actual);


        Clorus q = new  Clorus(1.2);
        HashMap<Direction, Occupant> surrounded1 = new HashMap<Direction, Occupant>();
        surrounded.put(Direction.TOP, new Empty());
        surrounded.put(Direction.BOTTOM,new Empty());
        surrounded.put(Direction.LEFT, new Impassible());
        surrounded.put(Direction.RIGHT, new Plip());

        Action actual1 = q.chooseAction(surrounded);
        Action expected1 = new Action(Action.ActionType.ATTACK,Direction.RIGHT);

        assertEquals(expected, actual);
    }
    @Test
    public void testChooseReplicate() {

        // No empty adjacent spaces; stay.
        Clorus p = new  Clorus(1.2);
        HashMap<Direction, Occupant> surrounded = new HashMap<Direction, Occupant>();
        surrounded.put(Direction.TOP, new Impassible());
        surrounded.put(Direction.BOTTOM,new Impassible());
        surrounded.put(Direction.LEFT, new Empty());
        surrounded.put(Direction.RIGHT, new Impassible());

        Action actual = p.chooseAction(surrounded);
        Action expected = new Action(Action.ActionType.REPLICATE,Direction.LEFT);

        assertEquals(expected, actual);



    }
    @Test
    public void testChooseMove() {

        // No empty adjacent spaces; stay.
        Clorus p = new  Clorus(0.8);
        HashMap<Direction, Occupant> surrounded = new HashMap<Direction, Occupant>();
        surrounded.put(Direction.TOP, new Empty());
        surrounded.put(Direction.BOTTOM,new Impassible());
        surrounded.put(Direction.LEFT, new Impassible());
        surrounded.put(Direction.RIGHT, new Impassible());

        Action actual = p.chooseAction(surrounded);
        Action expected = new Action(Action.ActionType.MOVE,Direction.TOP);

        assertEquals(expected, actual);



    }




}