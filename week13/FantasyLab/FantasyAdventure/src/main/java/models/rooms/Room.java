package models.rooms;

import java.util.ArrayList;
import java.util.Random;

public class Room {

    private ArrayList<Exit> exits = new ArrayList<>();
    private int i = 0;

    private Exit exit;



    public Room() {
        createExits();

    }

    public Exit randomExit(){
        int pick = new Random().nextInt(Exit.values().length);
        return Exit.values()[pick];
    }

    public void createExits(){
        Random rand = new Random();
        int n = rand.nextInt(4) + 1;

        while (i < n){
        exit = this.randomExit();
        if(exits.contains(exit) == false){
        this.exits.add(exit);
        i++;

    }}}

    public ArrayList<Exit> getExits() {
        return exits;
    }

    public void setExits(ArrayList<Exit> exits) {
        this.exits = exits;
    }
}
