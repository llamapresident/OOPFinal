/**
 * @author zdyse
 * @createdOn 3/2/2023 at 1:51 PM
 * @projectName OOPFinal
 * @packageName edu.neumont.csc150.potions.maker;
 */
package edu.neumont.csc150.potions.maker;

import edu.neumont.csc150.Console;
import edu.neumont.csc150.potions.actual.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PotionMaker {
    //TODO: update UML as we go
    ArrayList<potion> potionList= new ArrayList<>();

    public void run(){
        int x = 0;
        while (x == 0){
            x = Console.getIntInput("What would you like to do?" +
                    "\n1 : Make a potion with a single effect" +
                    "\n2 : Make a potion with 2 effects" +
                    "\n3 : make a potion with 3 effects" +
                    "\n4 : Make a random potion" +
                    "\n5 : Make a random number of potions" +
                    "\n6 : Exit", Console.TextColor.PURPLE);
            if (x == 1){
                potionMaker1();
                x = 0;
            } else if (x == 2){
                potionMaker2();
                x = 0;
            } else if (x == 3){
                potionMaker3();
                x = 0;
            } else if (x == 4){
                potionMakerRandom();
                x = 0;
            } else if (x == 5){
                randomPotionMaker();
                x = 0;
            } else if (x == 6){
                for (int i = 0; i < potionList.size(); i++) {
                    Console.writeLnGreen(String.valueOf(potionList.get(i)));
                }
                Console.writeLn("Good Bye!");
            } else {
                System.out.println("You must enter a number between 1 and 6");
                x = 0;
            }

        }
    }

    //TODO: All potions should start with the same base ingredient, and from there depending on what you add will determine the effect
    // determine ingredients
    // determine which ingredients do which things
    public void potionMaker1(){
        String x = Console.getStringInput("Choose your ingredient:" +
                "\nlizards tail - regeneration" +
                "\nspider glands - poison" +
                "\nchicken blood - Courage" +
                "\nbear fat - warmth" +
                "\nrum - strength" +
                "\nsugar - speed");
        potion y = new potionDecider(x);
        potionList.add(y);
    }
    public void potionMaker2(){
        String x = Console.getStringInput("Choose your first ingredient:" +
                "\nlizards tail - regeneration" +
                "\nspider glands - poison" +
                "\nchicken blood - Courage" +
                "\nbear fat - warmth" +
                "\nrum - strength" +
                "\nsugar - speed");
        String y = Console.getStringInput("Choose your second ingredient:" +
                "\nlizards tail - regeneration" +
                "\nspider glands - poison" +
                "\nchicken blood - Courage" +
                "\nbear fat - warmth" +
                "\nrum - strength" +
                "\nsugar - speed");
        potionList.add(new potionDecider2(x, y));
    }
    public void potionMaker3(){
        String x = Console.getStringInput("Choose your first ingredient:" +
                "\nlizards tail - regeneration" +
                "\nspider glands - poison" +
                "\nchicken blood - Courage" +
                "\nbear fat - warmth" +
                "\nrum - strength" +
                "\nsugar - speed");
        String y = Console.getStringInput("Choose your second ingredient:" +
                "\nlizards tail - regeneration" +
                "\nspider glands - poison" +
                "\nchicken blood - Courage" +
                "\nbear fat - warmth" +
                "\nrum - strength" +
                "\nsugar - speed");
        String z = Console.getStringInput("Choose your third ingredient:" +
                "\nlizards tail - regeneration" +
                "\nspider glands - poison" +
                "\nchicken blood - Courage" +
                "\nbear fat - warmth" +
                "\nrum - strength" +
                "\nsugar - speed");
        potionList.add(new potionDecider3(x, y, z));
    }
    public void potionMakerRandom(){
        Random r = new Random();
        int a = r.nextInt(3)+1;
        if (a == 1){
            int b = r.nextInt(6) + 1;
            String x = "";
            switch (b){
                case 1:
                    x = "lizards tail";
                    break;
                case 2:
                    x = "spider glands";
                    break;
                case 3:
                    x = "chicken blood";
                    break;
                case 4:
                    x = "bear fat";
                    break;
                case 5:
                    x = "rum";
                    break;
                case 6:
                    x = "sugar";
                    break;
            }
            potion y = new potionDecider(x);
            potionList.add(y);
        } else if (a == 2){
            int b = r.nextInt(6) + 1;
            String x = "", y = "";
            switch (b){
                case 1:
                    x = "lizards tail";
                    break;
                case 2:
                    x = "spider glands";
                    break;
                case 3:
                    x = "chicken blood";
                    break;
                case 4:
                    x = "bear fat";
                    break;
                case 5:
                    x = "rum";
                    break;
                case 6:
                    x = "sugar";
                    break;
            }
            switch (b){
                case 1:
                    y = "lizards tail";
                    break;
                case 2:
                    y = "spider glands";
                    break;
                case 3:
                    y = "chicken blood";
                    break;
                case 4:
                    y = "bear fat";
                    break;
                case 5:
                    y = "rum";
                    break;
                case 6:
                    y = "sugar";
                    break;
            }
            potionList.add(new potionDecider2(x, y));
        } else if (a == 3){
            int b = r.nextInt(6) + 1;
            String x = "", y = "", z = "";
            switch (b){
                case 1:
                    x = "lizards tail";
                    break;
                case 2:
                    x = "spider glands";
                    break;
                case 3:
                    x = "chicken blood";
                    break;
                case 4:
                    x = "bear fat";
                    break;
                case 5:
                    x = "rum";
                    break;
                case 6:
                    x = "sugar";
                    break;
            }
            b = r.nextInt(6) + 1;
            switch (b){
                case 1:
                    y = "lizards tail";
                    break;
                case 2:
                    y = "spider glands";
                    break;
                case 3:
                    y = "chicken blood";
                    break;
                case 4:
                    y = "bear fat";
                    break;
                case 5:
                    y = "rum";
                    break;
                case 6:
                    y = "sugar";
                    break;
            }
            b = r.nextInt(6) + 1;
            switch (b){
                case 1:
                    z = "lizards tail";
                    break;
                case 2:
                    z = "spider glands";
                    break;
                case 3:
                    z = "chicken blood";
                    break;
                case 4:
                    z = "bear fat";
                    break;
                case 5:
                    z = "rum";
                    break;
                case 6:
                    z = "sugar";
                    break;
            }
            potionList.add(new potionDecider3(x, y, z));
        } else System.out.println("Somethings wrong here");

    }
    public void randomPotionMaker(){
        int a = new Random().nextInt(10) + 1;
        switch (a){
            case 1:
                potionMakerRandom();
                break;
            case 2:
                potionMakerRandom();
                potionMakerRandom();
                break;
            case 3:
                for (int i = 0; i < 3; i++) {
                    potionMakerRandom();
                }
                break;
            case 4:
                for (int i = 0; i < 4; i++) {
                    potionMakerRandom();
                }
                break;
            case 5:
                for (int i = 0; i < 5; i++) {
                    potionMakerRandom();
                }
                break;
            case 6:
                for (int i = 0; i < 6; i++) {
                    potionMakerRandom();
                }
                break;
            case 7:
                for (int i = 0; i < 7; i++) {
                    potionMakerRandom();
                }
                break;
            case 8:
                for (int i = 0; i < 8; i++) {
                    potionMakerRandom();
                }
                break;
            case 9:
                for (int i = 0; i < 9; i++) {
                    potionMakerRandom();
                }
                break;
            case 10:
                for (int i = 0; i < 10; i++) {
                    potionMakerRandom();
                }

                break;
        }
    }
}
