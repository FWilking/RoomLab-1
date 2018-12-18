package Rooms;

import Game.Runner;
import People.Person;

public class CoolRoom extends Room
{
    private int temp = 0 ;
    public CoolRoom(int x, int y) {
        super(x, y);
    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You enter a very cool room.  If you enter another room as cold as this one you will die of hypothermia.");
        if(temp < 0) {
            Runner.gameOff();
        }
        else{
            temp--;
        }
    }


}
