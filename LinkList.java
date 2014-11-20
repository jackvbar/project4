package com.company;

/**
 * Created by jack on 11/19/2014.
 */
public class LinkList {
        private Link head;
        private Link tail;
        private int length;
        private int tracker;

        public boolean haveEmptyList(){
                if (length == 0)
                    return true;
                else
                    return false;
            }

        public void StartComp(competition newComp, Team newTeam1, Team newTeam2, Event newEvent){
            Link storage = new Link();
            storage.setMyComp(newComp);
            storage.setEvent(newEvent);
            storage.setTeam1(newTeam1);
            storage.setTeam2(newTeam2);

            if (haveEmptyList()) {
                head = storage;
                length++;
            }else {
                storage.setNext(head);
                head = storage;
                length++;
            }
        }
        public Link getLink(int tracker){
            if (tracker >length){
                System.out.println("Need a smaller number");
                return null;
            }else {
                Link link = new Link();
                link = head;
                if (tracker == 0)
                    return link;

                for (int i = 0; i <= tracker; i++) {
                    link = link.getNext();
                    if (i == tracker) {
                        return link;
                    }
                }
            return null;
            }}

        public void removeLink(int tracker){
        if (tracker > length || haveEmptyList() || tracker < 0){
            return;}
             if (tracker == 0){
             head = head.getNext();
             length --;
            } else if (tracker == length -1) {
                Link link = new Link();
                link = head;

        for (int i = 0; i < length; i++) {
            link = link.getNext();

            if (i == tracker - 1) {
                link.setNext(null);
                break;
            }
            link = link.getNext();
        }
        length--;
      }
   }
    public int GetLength(){
        return length;
    }

   //Need a series of getnum and remove funtions to handle the removal of links from the list
    //these help because passing through methods allows the data to be changes so that compared variables have mathcing data types

    public int getTeamNum(Team team) {
    Link link = new Link();
        link = head;
        for(int i=0; i<length; i++) {
            if (link.getTeam1() == team) {
                return i;
            }
            link = link.getNext();
        }
        return -500;
    }

    public void killTeam(Team byeTeam) {
        int tracker = getTeamNum(byeTeam);
        removeLink(tracker);
    }

    public int getEventNum(Event event) {
        Link link = new Link();
        link = head;
        for (int i = 0; i < length; i++) {
            if (link.getEvent()==event){
            return i;
        }
        link = link.getNext();
    }
    return -500;
    }

    public void killEvent(Event byeEvent) {
        int tracker = getEventNum(byeEvent);
        removeLink(tracker);
    }



    public void displayTeams(){
        Link link = new Link();
        link = head;
        for(int i=0; i<length; i++){
            System.out.print(i + ":");
            System.out.print(link.getTeam1().getTeamInfo());
            System.out.print(link.getTeam2().getTeamInfo());
            link = link.getNext();
        }
    }

    public void displayEvents(){
        Link link = new Link();
        link = head;
        for (int i=0; i<length; i++){
            System.out.println(i + ":");
            System.out.println(link.getEvent().getInfo());
            link = link.getNext();
        }

    } public void displayCompetitions(){
        Link link = new Link();
        link = head;
        for(int i = 0; i<length; i++){
            System.out.print(i + ":");
            System.out.print(link.getMyComp().Event.getInfo());
            System.out.print(link.getMyComp().Team.getTeamInfo());
            link = link.getNext();
        }
    }
}
