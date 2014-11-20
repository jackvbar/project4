package com.company;

import java.util.LinkedList;

/**
 * Created by jack on 11/16/2014.
 */
public class CompetitionManager {
   private competition head;
   private competition tail;

   public void StartCompetition(Event event){

       competition newComp = new competition();
       if(tail == null){
           tail = newComp;
           newComp.event = event;
           //newComp.Team = team1;
           //newComp.Team = team2;
       }
       else{
           newComp.previous = tail;
           tail.next = newComp;
           //tail = newComp;
       }
   }

    public void EndCompetition(ICompetition competition, Team winningTeam){
        competition CurrItem = head;
        int CurrIndex = 0;
        while(CurrItem != null && CurrIndex != index){
            CurrItem = CurrItem.next;
            CurrIndex++;
        }
        if(CurrItem == null){
            System.out.println("Error");
        }
        return CurrItem.value;


    }

    public ICompetition[] GetCompetitions(){

    }
}
