package com.company;

/**
 * Created by jack on 10/7/2014.
 */
public class WashoosEvent extends Event{
   private boolean hasAutoWinStick = false;
   private int numWashoos = 8;

    public WashoosEvent(String name, int playTo, boolean isPlayToExact, int playDistance) {
        super(name, playTo, isPlayToExact, playDistance);
    }

    public WashoosEvent(){
        
        super("Washoos", 21, true, 15);
    }
    @Override public String getExtraInfo(){
        return "One player on each team stands at each end of the playing area, the playing area is roughly 15 feet from\n" +
                "board to board. Each player tosses washoos toward the opposite board to score points until one team \n" +
                "reaches exactly 21 points. To determine which team goes first “coin toss” a washoo. After the game has\n" +
                "started the team that scored the last good point tosses first.\n";

}}

