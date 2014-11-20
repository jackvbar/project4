/*
Jack Barry
Software development 1 Project 3
10-28-2014
*/

package com.company;

import java.io.*;
import java.util.*;

public class Main {
    private static String fileName;

    public static void main(String[] args) {
        /**/

        try{
           BufferedReader BuffRead= new BufferedReader(new FileReader(args[0]));
           String line=BuffRead.readLine();

               if (line.equals("lgoo") || line.equals("LGOO")) {
                   System.out.println("File Accepted");
               } else {
                   System.out.println("Error, File is incorrect");
               }

            }catch(IOException ioe){
                System.out.println("IO Exception");
           }
        Main.InitializeAndWelcome();

        /* */
        System.out.println("Please enter the name of your Olympian file with extension included");
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        try{
            fileName = userInput.readLine();
        }catch(IOException ioe){
            System.out.println("Error");
            return;
        }

        String userTyped;
        boolean escape = false;
            BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
               try{
                   userTyped= userIn.readLine();
               }catch(IOException ioe){
                   System.out.println("Error");
                   return;
               }
            while (!escape){
            if (userTyped.equals("e") || userTyped.equals("events")) {
            /*make a call to displayEvents method*/
                EventManager();
                escape = true;
                Main.InitializeAndWelcome();

            } else if (userTyped.equals("o") || userTyped.equals("olympians")) {
            /*make a call to the displayOlympians method*/
                OlympianManager();
            } else if (userTyped.equals("h") || userTyped.equals("help")) {
                displayHelp();
            }
            else if (userTyped.equals("t") || userTyped.equals("teams")){
                displayTeams();
            }else if (userTyped.equals("path")|| userTyped.equals("p")){
                getFileName();
            }
            else if (userTyped.equals("c") || userTyped.equals("competitions")){
                displayCompetition();
            }
            else if (userTyped.equals("sc") || userTyped.equals("start competition")){
                startComp();
            }
            else if (userTyped.equals("ec") || userTyped.equals("end competition")){
                    endCompetition();
                }
            else if (userTyped.equals("q") || userTyped.equals("quit")) {
                    System.out.println("Thank you for playing, goodbye");
                    EndProgram();
            } else {
                System.out.println("Invalid input, entering the letters e, o, h, or q or the words events, olympians, help, or quit as they appear before you.");
                try{
                    userTyped = userIn.readLine();
            }catch(IOException ioe){
                    System.out.println("Error");
                    return;
                }
        }}
    }

    public static void InitializeAndWelcome(){
        /* Print welcome message */
               System.out.println("Welcome to the Annual Lawn Game Olympics, Please read the following instructions." +
                       "\nEnter the letter e or the word events for a list of today's events.\nEnter the letter o or the word olympians for a list of the competing olympians." +
                       "\nEnter the letter t or the word teams to create and see Olympian teams." +
                       "\nEnter the letter h or the word help to display some helpful tips if you are having trouble."
                       "\nEnter the letters sc or the words start competition to initialize a competition.\nEnter the letter c or the word competition for a list of the competitions." +
                       "\nEnter the letters ec or the words end competition to end a competition." +
                       "\nEnter the letter p or the word path to allow the program to read your olympians.lgoo file."
               );

           }

    public static void EventManager(){
        EventManager Manage = new EventManager();
        Manage.displayEvents();
    }

    public static void OlympianManager()
    {
        OlympianManager OlympManage = new OlympianManager();
        OlympManage.displayOlympians();
    }

   public static void displayTeams(){
       TeamManager teams = new TeamManager();
       teams.getTeamArray();
       teams.displayTeams();
   }

    public static void getFileName(){
        OlympianManager olympian = new OlympianManager();
        olympian.getFileName(fileName);
    }

    public static void displayHelp(){
        System.out.println("Your input is case sensitive, make sure you are using lowercase letters and try again.\n" +
                "Remember, entering the letter e or the word events will display a list of today's events.\n" +
                "Entering the letter o or the word olympians will display a list of the olympians competing today.\n" +
                "Entering the letter t or the word teams will create and display teams for the Yard Game Olympics.\n" +
                "Entering the letter h or the word help brings you to this message.\n" +
                "Entering anything other than the above arguments will not work.");
    }

    public static void endCompetition(){
        String compRep = "";
        CompetitionManager.displayComps();
        System.out.println("Enter the number of the competition you would like to end");
        BufferedReader typedNum = new BufferedReader(new InputStreamReader(System.in));
        try{
            compRep = typedNum.readLine();
        }catch(IOException ioe) {
            System.out.println("error");
        }
        int compNum = Integer.parseInt(compRep);

        if (compNum >= CompetitionManager.CompList.length){
            System.out.println("Competition not found, select another competition from the list");
        endCompetition();
        }
        CompetitionManager.EndCompetition(compNum);
    }

    public static void displayCompetition(){
        CompetitionManager myList = new CompetitionManager();
        for(int i=0; i < myList.length(); i++) {
            System.out.println(myList.get(i));
            myList.StartCompetition(i);
        }

    }

    public static void EndProgram(){
        System.exit(0);
    }

}

