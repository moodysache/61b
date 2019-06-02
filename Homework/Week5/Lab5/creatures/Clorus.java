package creatures;

import huglife.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.util.Random;

public class Clorus extends Creature {
    /**
     * Creates a creature with the name N. The intention is that this
     * name should be shared between all creatures of the same type.
     *
     * @param n
     */

    private int r;
    /**
     * green color.
     */
    private int g;
    /**
     * blue color.
     */
    private int b;
    public Clorus(Double e) {
        super("clorus");
        this.r=0;
        this.g=0;
        this.b=0;
        this.energy=e;
    }
public Clorus(){
        this(1.0);
}


    @Override
    public void move() {
        this.energy-=0.03;

    }

    @Override
    public void attack(Creature c) {
        this.energy+=c.energy();
    }

    @Override
    public Clorus replicate() {
        energy/=2;
        return new Clorus(energy);
    }

    @Override
    public void stay() {
        this.energy-=0.01;
    }

    @Override
    public Action chooseAction(Map<Direction, Occupant> neighbors) {
        List<Direction> emptyNeighbors = new ArrayList<>();
        List<Direction> plipNeighbors = new ArrayList<>();
        for(Direction j:neighbors.keySet()){
            if(neighbors.get(j)instanceof Empty){
                emptyNeighbors.add(j);
            }
            else if(neighbors.get(j)instanceof Plip){
                plipNeighbors.add(j);
            }

        }
        if (emptyNeighbors.isEmpty()) {
            return new Action(Action.ActionType.STAY);
        }
        if(!plipNeighbors.isEmpty()){
            Random random = new Random();
            int num = random.nextInt(plipNeighbors.size());
            return new Action(Action.ActionType.ATTACK,plipNeighbors.get(num));
        }
        Random random = new Random();
        int num = random.nextInt(emptyNeighbors.size());
        if(this.energy>=1.0){
            return new Action(Action.ActionType.REPLICATE,emptyNeighbors.get(num));
        }
        return new Action(Action.ActionType.MOVE,emptyNeighbors.get(num));
    }

    @Override
    public Color color() {
        this.r=34;
        this.g=0;
        this.b=231;
        return color(34, 0, 231);
    }
}
