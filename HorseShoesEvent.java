package com.company;

/**
 * Created by jack on 10/7/2014.
 */
public class HorseShoesEvent extends Event {
    private int numHorseShoes = 2;

    public HorseShoesEvent(String name, int playTo, boolean isPlayToExact, int playDistance) {
        super(name, playTo, isPlayToExact, playDistance);
    }

    public HorseShoesEvent(){
        super("Horseshoes", 11, false, 40);
    }
    @Override public String getExtraInfo(){
        return "One player on each team stands at each end of the playing area, the playing area is roughly 40 feet from\n" +
                "stake to stake. Each player tosses horseshoes toward the opposite stake to score points until one team \n" +
                "reaches at least 11 points and has more than a 2 point lead on the opposing team. To determine which \n" +
                "team goes first “coin toss” a horseshoe. After the game has started the team that scored the last good \n" +
                "point tosses first.";

}}