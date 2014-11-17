package com.company;

/**
 * Created by jack on 10/7/2014.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class OlympianManager {

    private Olympian[] olympians  = new Olympian[16];
    private String names;

    public OlympianManager() {
        for(int i = 0; i < olympians.length; i++){
            olympians[i] = new Olympian();
        }
        try {

            BufferedReader inputStream = new BufferedReader(new FileReader("C:\\Users\\jack\\olympians.lgoo.txt"));

            String line2;
            Boolean firstLine = false;
            Integer count = 0;

            while ((line2 = inputStream.readLine()) != null) {
                    List<String> fileList = Arrays.asList(line2.split(","));

                    int age = Integer.parseInt(fileList.get(2).replaceAll("\\s", ""));
                    String cleansed = fileList.get(1).replaceAll("\\s", "");
                    if(cleansed.equals("M")){
                       olympians[count].defineOlympian(fileList.get(0), Sex.MALE, age);
                    } else {
                        olympians[count].defineOlympian(fileList.get(0), Sex.FEMALE, age);
                    }
                    count++;
                }

        } catch (Exception e) {
            System.out.println("Exception");
        }}

        public Olympian[] getObjectOlympians(){
            return this.olympians;

        }


    public void displayOlympians(){
        for(int i=0; i<olympians.length; i++){
            System.out.println(olympians[i].putOlympian());
        }
    }}
